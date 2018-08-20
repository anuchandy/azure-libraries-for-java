/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.compute.ComputeGallery;
import com.microsoft.azure.management.compute.ComputeGalleryImage;
import com.microsoft.azure.management.resources.fluentcore.arm.models.implementation.GroupableResourceImpl;
import rx.Observable;

/**
 * The implementation for ComputeGallery and its create and update interfaces.
 */
@LangDefinition
class ComputeGalleryImpl
        extends GroupableResourceImpl<ComputeGallery, GalleryInner, ComputeGalleryImpl, ComputeManager>
        implements ComputeGallery, ComputeGallery.Definition, ComputeGallery.Update {
    ComputeGalleryImpl(String name, GalleryInner inner, ComputeManager manager) {
        super(name, inner, manager);
    }

    @Override
    public Observable<ComputeGallery> createResourceAsync() {
        GalleriesInner client = this.manager().inner().galleries();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<ComputeGallery> updateResourceAsync() {
        GalleriesInner client = this.manager().inner().galleries();
        return client.createOrUpdateAsync(this.resourceGroupName(), this.name(), this.inner())
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<GalleryInner> getInnerAsync() {
        GalleriesInner client = this.manager().inner().galleries();
        return client.getByResourceGroupAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    @Override
    public String description() {
        return this.inner().description();
    }

    @Override
    public String uniqueName() {
        return this.inner().identifier().uniqueName();
    }

    @Override
    public String provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public Observable<ComputeGalleryImage> getImageAsync(String imageName) {
        return this.manager().computeGalleryImages().getByGalleryAsync(this.resourceGroupName(), this.name(), imageName);
    }

    @Override
    public ComputeGalleryImage getImage(String imageName) {
        return this.manager().computeGalleryImages().getByGallery(this.resourceGroupName(), this.name(), imageName);
    }

    @Override
    public Observable<ComputeGalleryImage> listImagesAsync() {
        return this.manager().computeGalleryImages().listByGalleryAsync(this.resourceGroupName(), this.name());
    }

    @Override
    public PagedList<ComputeGalleryImage> listImages() {
        return this.manager().computeGalleryImages().listByGallery(this.resourceGroupName(), this.name());
    }

    @Override
    public ComputeGalleryImpl withDescription(String description) {
        this.inner().withDescription(description);
        return this;
    }
}
