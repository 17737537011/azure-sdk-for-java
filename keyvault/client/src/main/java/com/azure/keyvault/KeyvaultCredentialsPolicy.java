// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.keyvault;

import com.azure.common.credentials.ServiceClientCredentials;
import com.azure.common.http.*;
import com.azure.common.http.policy.HttpPipelinePolicy;
import io.netty.handler.codec.http.HttpResponseStatus;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import reactor.core.publisher.Mono;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

final class KeyvaultCredentialsPolicy implements HttpPipelinePolicy {

    private static final String HOST_HEADER = "Host";
    private static final String AUTHORIZATION_HEADER = "Authorization";
    private static final String CONTENT_TYPE_HEADER = "Content-Type";


    private final URL vaultUrl;
    private final AuthorizationHeaderProvider provider;
    private final Logger logger = LoggerFactory.getLogger(KeyvaultCredentials.class);


    /**
     * Creates a policy that authenticates requests with Azure Azure Keyvault service.
     *
     * package-private class as users do not need to see or modify which auth headers are added to requests.
     * @param credentials for the Configuration Store in Azure
     */
    KeyvaultCredentialsPolicy(ServiceClientCredentials credentials, String vaultUrl) {
        this.vaultUrl = validateURL(vaultUrl);
        this.provider = new AuthorizationHeaderProvider(credentials);
    }

    private URL validateURL(String vaultUrl) {
        try {
            return new URL(vaultUrl);
        } catch (MalformedURLException e) {
            throw new IllegalArgumentException(e);
        }
    }

    /**
     * Sign the request.
     *
     * @param context The request context
     * @return A {@link Mono} representing the HTTP response that will arrive asynchronously.
     */
    @Override
    public Mono<HttpResponse> process(HttpPipelineCallContext context, HttpPipelineNextPolicy next) {
        final Map<String, String> mapped = getDefaultHeaders(context.httpRequest().headers());
        mapped.forEach((key, value) -> context.httpRequest().headers().set(key, value));

        try {
            String bearer = provider.getAuthenticationHeaderValue(context.httpRequest());
            context.httpRequest().headers().set(AUTHORIZATION_HEADER, bearer);
        } catch (IOException e) {
            Mono.error(e);
        }

        return next.process().doOnSuccess(this::logResponseDelegate);
    }

    private Map<String, String> getDefaultHeaders(HttpHeaders currentHeaders) {
        final Map<String, String> mapped = new HashMap<>();

        mapped.put(HOST_HEADER, vaultUrl.getHost());
        mapped.put(CONTENT_TYPE_HEADER, "application/json");

        return mapped;
    }

    private void logResponseDelegate(HttpResponse response) {
        Objects.requireNonNull(response, "HttpResponse is required.");

        if (response.statusCode() == HttpResponseStatus.UNAUTHORIZED.code()) {
            logger.error("HTTP Unauthorized status, String-to-Sign:'{}'",
                    response.headers().value(AUTHORIZATION_HEADER));
        }
    }

    private static class AuthorizationHeaderProvider {
        private final ServiceClientCredentials credentials;
        AuthorizationHeaderProvider(ServiceClientCredentials credentials) {
            this.credentials = credentials;
        }
        private String getAuthenticationHeaderValue(final HttpRequest request) throws IOException {
            return String.format("Bearer %s",
                    credentials.authorizationHeaderValue("test"));
        }
    }
}
