/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.compute.implementation.GalleriesInner;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsBatchDeletion;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsDeletingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsListingByResourceGroup;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsListing;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;

/**
 * Entry point to computeGalleries management API in Azure.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_15_0)
public interface ComputeGalleries extends SupportsCreating<ComputeGallery.DefinitionStages.Blank>,
        SupportsDeletingByResourceGroup,
        SupportsBatchDeletion,
        SupportsGettingByResourceGroup<ComputeGallery>,
        SupportsListingByResourceGroup<ComputeGallery>,
        SupportsListing<ComputeGallery>,
        HasInner<GalleriesInner> {
}
