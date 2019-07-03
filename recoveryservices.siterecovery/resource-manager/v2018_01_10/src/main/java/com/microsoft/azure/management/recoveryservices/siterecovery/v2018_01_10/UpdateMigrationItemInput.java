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
 * Update migration item input.
 */
public class UpdateMigrationItemInput {
    /**
     * Update migration item input properties.
     */
    @JsonProperty(value = "properties")
    private UpdateMigrationItemInputProperties properties;

    /**
     * Get update migration item input properties.
     *
     * @return the properties value
     */
    public UpdateMigrationItemInputProperties properties() {
        return this.properties;
    }

    /**
     * Set update migration item input properties.
     *
     * @param properties the properties value to set
     * @return the UpdateMigrationItemInput object itself.
     */
    public UpdateMigrationItemInput withProperties(UpdateMigrationItemInputProperties properties) {
        this.properties = properties;
        return this;
    }

}
