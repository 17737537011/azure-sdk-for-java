/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10;

import com.microsoft.azure.arm.collection.SupportsCreating;
import rx.Observable;
import rx.Completable;
import com.microsoft.azure.management.recoveryservices.siterecovery.v2018_01_10.implementation.ReplicationProtectionContainersInner;
import com.microsoft.azure.arm.model.HasInner;

/**
 * Type representing ReplicationProtectionContainers.
 */
public interface ReplicationProtectionContainers extends SupportsCreating<ProtectionContainer.DefinitionStages.Blank>, HasInner<ReplicationProtectionContainersInner> {
    /**
     * Adds a protectable item to the replication protection container.
     * The operation to a add a protectable item to a protection container(Add physical server.).
     *
     * @param fabricName The name of the fabric.
     * @param protectionContainerName The name of the protection container.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainer> discoverProtectableItemAsync(String fabricName, String protectionContainerName);

    /**
     * Removes a protection container.
     * Operation to remove a protection container.
     *
     * @param fabricName Unique fabric ARM name.
     * @param protectionContainerName Unique protection container ARM name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Completable deleteAsync(String fabricName, String protectionContainerName);

    /**
     * Switches protection from one container to another or one replication provider to another.
     * Operation to switch protection from one container to another or one replication provider to another.
     *
     * @param fabricName Unique fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainer> switchProtectionAsync(String fabricName, String protectionContainerName);

    /**
     * Gets the list of all protection containers in a vault.
     * Lists the protection containers in a vault.
     *
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainer> listAsync();

    /**
     * Gets the protection container details.
     * Gets the details of a protection container.
     *
     * @param fabricName Fabric name.
     * @param protectionContainerName Protection container name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainer> getAsync(String fabricName, String protectionContainerName);

    /**
     * Gets the list of protection container for a fabric.
     * Lists the protection containers in the specified fabric.
     *
     * @param fabricName Fabric name.
     * @throws IllegalArgumentException thrown if parameters fail the validation
     * @return the observable for the request
     */
    Observable<ProtectionContainer> listByReplicationFabricsAsync(final String fabricName);

}
