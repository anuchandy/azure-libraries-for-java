/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */
package com.microsoft.azure.v2.management.network;

import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.v2.management.network.implementation.NetworkManager;
import com.microsoft.azure.v2.management.network.implementation.PublicIPAddressesInner;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsBatchCreation;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;


/**
 * Entry point to public IP address management.
 */
@Fluent()
public interface PublicIPAddresses extends
    SupportsListing<PublicIPAddress>,
    SupportsCreating<PublicIPAddress.DefinitionStages.Blank>,
    SupportsDeletingById,
    SupportsListingByResourceGroup<PublicIPAddress>,
    SupportsGettingByResourceGroup<PublicIPAddress>,
    SupportsGettingById<PublicIPAddress>,
    SupportsDeletingByResourceGroup,
    SupportsBatchCreation<PublicIPAddress>,
    SupportsBatchDeletion,
    HasManager<NetworkManager>,
    HasInner<PublicIPAddressesInner> {
}