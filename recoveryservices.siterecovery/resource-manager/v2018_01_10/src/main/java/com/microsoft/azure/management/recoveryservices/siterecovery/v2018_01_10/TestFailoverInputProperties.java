/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Input definition for planned failover input properties.
 */
public class TestFailoverInputProperties {
    /**
     * Failover direction.
     */
    @JsonProperty(value = "failoverDirection")
    private String failoverDirection;

    /**
     * Network type to be used for test failover.
     */
    @JsonProperty(value = "networkType")
    private String networkType;

    /**
     * The id of the network to be used for test failover.
     */
    @JsonProperty(value = "networkId")
    private String networkId;

    /**
     * A value indicating whether the test failover cleanup is to be skipped.
     */
    @JsonProperty(value = "skipTestFailoverCleanup")
    private String skipTestFailoverCleanup;

    /**
     * Provider specific settings.
     */
    @JsonProperty(value = "providerSpecificDetails")
    private ProviderSpecificFailoverInput providerSpecificDetails;

    /**
     * Get failover direction.
     *
     * @return the failoverDirection value
     */
    public String failoverDirection() {
        return this.failoverDirection;
    }

    /**
     * Set failover direction.
     *
     * @param failoverDirection the failoverDirection value to set
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withFailoverDirection(String failoverDirection) {
        this.failoverDirection = failoverDirection;
        return this;
    }

    /**
     * Get network type to be used for test failover.
     *
     * @return the networkType value
     */
    public String networkType() {
        return this.networkType;
    }

    /**
     * Set network type to be used for test failover.
     *
     * @param networkType the networkType value to set
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }

    /**
     * Get the id of the network to be used for test failover.
     *
     * @return the networkId value
     */
    public String networkId() {
        return this.networkId;
    }

    /**
     * Set the id of the network to be used for test failover.
     *
     * @param networkId the networkId value to set
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }

    /**
     * Get a value indicating whether the test failover cleanup is to be skipped.
     *
     * @return the skipTestFailoverCleanup value
     */
    public String skipTestFailoverCleanup() {
        return this.skipTestFailoverCleanup;
    }

    /**
     * Set a value indicating whether the test failover cleanup is to be skipped.
     *
     * @param skipTestFailoverCleanup the skipTestFailoverCleanup value to set
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withSkipTestFailoverCleanup(String skipTestFailoverCleanup) {
        this.skipTestFailoverCleanup = skipTestFailoverCleanup;
        return this;
    }

    /**
     * Get provider specific settings.
     *
     * @return the providerSpecificDetails value
     */
    public ProviderSpecificFailoverInput providerSpecificDetails() {
        return this.providerSpecificDetails;
    }

    /**
     * Set provider specific settings.
     *
     * @param providerSpecificDetails the providerSpecificDetails value to set
     * @return the TestFailoverInputProperties object itself.
     */
    public TestFailoverInputProperties withProviderSpecificDetails(ProviderSpecificFailoverInput providerSpecificDetails) {
        this.providerSpecificDetails = providerSpecificDetails;
        return this;
    }

}
