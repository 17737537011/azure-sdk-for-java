/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.applicationinsights.v2015_05_01;

import rx.Completable;
import rx.Observable;
import com.microsoft.azure.management.applicationinsights.v2015_05_01.implementation.ExportConfigurationsInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ExportConfigurations.
 */
public interface ExportConfigurations extends HasInner<ExportConfigurationsInner> {
    /**
     * Gets a list of Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentExportConfiguration> listAsync(String resourceGroupName, String resourceName);

    /**
     * Create a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportProperties Properties that need to be specified to create a Continuous Export configuration of a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentExportConfiguration> createAsync(String resourceGroupName, String resourceName, ApplicationInsightsComponentExportRequest exportProperties);

    /**
     * Delete a Continuous Export configuration of an Application Insights component.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentExportConfiguration> deleteAsync(String resourceGroupName, String resourceName, String exportId);

    /**
     * Get the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentExportConfiguration> getAsync(String resourceGroupName, String resourceName, String exportId);

    /**
     * Update the Continuous Export configuration for this export id.
     *
     * @param resourceGroupName The name of the resource group.
     * @param resourceName The name of the Application Insights component resource.
     * @param exportId The Continuous Export configuration ID. This is unique within a Application Insights component.
     * @param exportProperties Properties that need to be specified to update the Continuous Export configuration.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ApplicationInsightsComponentExportConfiguration> updateAsync(String resourceGroupName, String resourceName, String exportId, ApplicationInsightsComponentExportRequest exportProperties);

}