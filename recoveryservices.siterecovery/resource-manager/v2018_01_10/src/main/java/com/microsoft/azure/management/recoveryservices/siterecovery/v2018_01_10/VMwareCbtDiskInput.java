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
 * VMwareCbt disk input.
 */
public class VMwareCbtDiskInput {
    /**
     * The disk Id.
     */
    @JsonProperty(value = "diskId", required = true)
    private String diskId;

    /**
     * A value indicating whether the disk is the OS disk.
     */
    @JsonProperty(value = "isOSDisk", required = true)
    private String isOSDisk;

    /**
     * The log storage account ARM Id.
     */
    @JsonProperty(value = "logStorageAccountId", required = true)
    private String logStorageAccountId;

    /**
     * The key vault secret name of the log storage account.
     */
    @JsonProperty(value = "logStorageAccountSasSecretName", required = true)
    private String logStorageAccountSasSecretName;

    /**
     * The disk type. Possible values include: 'Standard_LRS', 'Premium_LRS',
     * 'StandardSSD_LRS'.
     */
    @JsonProperty(value = "diskType")
    private DiskAccountType diskType;

    /**
     * Get the disk Id.
     *
     * @return the diskId value
     */
    public String diskId() {
        return this.diskId;
    }

    /**
     * Set the disk Id.
     *
     * @param diskId the diskId value to set
     * @return the VMwareCbtDiskInput object itself.
     */
    public VMwareCbtDiskInput withDiskId(String diskId) {
        this.diskId = diskId;
        return this;
    }

    /**
     * Get a value indicating whether the disk is the OS disk.
     *
     * @return the isOSDisk value
     */
    public String isOSDisk() {
        return this.isOSDisk;
    }

    /**
     * Set a value indicating whether the disk is the OS disk.
     *
     * @param isOSDisk the isOSDisk value to set
     * @return the VMwareCbtDiskInput object itself.
     */
    public VMwareCbtDiskInput withIsOSDisk(String isOSDisk) {
        this.isOSDisk = isOSDisk;
        return this;
    }

    /**
     * Get the log storage account ARM Id.
     *
     * @return the logStorageAccountId value
     */
    public String logStorageAccountId() {
        return this.logStorageAccountId;
    }

    /**
     * Set the log storage account ARM Id.
     *
     * @param logStorageAccountId the logStorageAccountId value to set
     * @return the VMwareCbtDiskInput object itself.
     */
    public VMwareCbtDiskInput withLogStorageAccountId(String logStorageAccountId) {
        this.logStorageAccountId = logStorageAccountId;
        return this;
    }

    /**
     * Get the key vault secret name of the log storage account.
     *
     * @return the logStorageAccountSasSecretName value
     */
    public String logStorageAccountSasSecretName() {
        return this.logStorageAccountSasSecretName;
    }

    /**
     * Set the key vault secret name of the log storage account.
     *
     * @param logStorageAccountSasSecretName the logStorageAccountSasSecretName value to set
     * @return the VMwareCbtDiskInput object itself.
     */
    public VMwareCbtDiskInput withLogStorageAccountSasSecretName(String logStorageAccountSasSecretName) {
        this.logStorageAccountSasSecretName = logStorageAccountSasSecretName;
        return this;
    }

    /**
     * Get the disk type. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS'.
     *
     * @return the diskType value
     */
    public DiskAccountType diskType() {
        return this.diskType;
    }

    /**
     * Set the disk type. Possible values include: 'Standard_LRS', 'Premium_LRS', 'StandardSSD_LRS'.
     *
     * @param diskType the diskType value to set
     * @return the VMwareCbtDiskInput object itself.
     */
    public VMwareCbtDiskInput withDiskType(DiskAccountType diskType) {
        this.diskType = diskType;
        return this;
    }

}
