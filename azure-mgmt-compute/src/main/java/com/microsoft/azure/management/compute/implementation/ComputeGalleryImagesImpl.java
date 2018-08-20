/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.compute.ComputeGalleryImage;
import com.microsoft.azure.management.compute.ComputeGalleryImages;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.resources.fluentcore.utils.PagedListConverter;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;

/**
 * The implementation for ComputeGalleryImages.
 */
@LangDefinition
class ComputeGalleryImagesImpl extends WrapperImpl<GalleryImagesInner> implements ComputeGalleryImages {
    private final ComputeManager manager;

    ComputeGalleryImagesImpl(ComputeManager manager) {
        super(manager.inner().galleryImages());
        this.manager = manager;
    }

    public ComputeManager manager() {
        return this.manager;
    }

    @Override
    public ComputeGalleryImageImpl define(String name) {
        return wrapModel(name);
    }

    private ComputeGalleryImageImpl wrapModel(GalleryImageInner inner) {
        return new ComputeGalleryImageImpl(inner, manager());
    }

    private ComputeGalleryImageImpl wrapModel(String name) {
        return new ComputeGalleryImageImpl(name, this.manager());
    }

    @Override
    public Observable<ComputeGalleryImage> listByGalleryAsync(final String resourceGroupName, final String galleryName) {
        GalleryImagesInner client = this.inner();
        return client.listByGalleryAsync(resourceGroupName, galleryName)
        .flatMapIterable(new Func1<Page<GalleryImageInner>, Iterable<GalleryImageInner>>() {
            @Override
            public Iterable<GalleryImageInner> call(Page<GalleryImageInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GalleryImageInner, ComputeGalleryImage>() {
            @Override
            public ComputeGalleryImage call(GalleryImageInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ComputeGalleryImage> listByGallery(String resourceGroupName, String galleryName) {
        return (new PagedListConverter<GalleryImageInner, ComputeGalleryImage>() {
            @Override
            public Observable<ComputeGalleryImage> typeConvertAsync(final GalleryImageInner inner) {
                return Observable.<ComputeGalleryImage>just(wrapModel(inner));
            }
        }).convert(inner().listByGallery(resourceGroupName, galleryName));
    }

    @Override
    public Observable<ComputeGalleryImage> getByGalleryAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        GalleryImagesInner client = this.inner();
        return client.getAsync(resourceGroupName, galleryName, galleryImageName)
        .map(new Func1<GalleryImageInner, ComputeGalleryImage>() {
            @Override
            public ComputeGalleryImage call(GalleryImageInner inner) {
                return wrapModel(inner);
            }
       });
    }

    @Override
    public ComputeGalleryImage getByGallery(String resourceGroupName, String galleryName, String galleryImageName) {
        return this.getByGalleryAsync(resourceGroupName, galleryName, galleryImageName).toBlocking().last();
    }

    @Override
    public Completable deleteByGalleryAsync(String resourceGroupName, String galleryName, String galleryImageName) {
        GalleryImagesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, galleryName, galleryImageName).toCompletable();
    }

    @Override
    public void deleteByGallery(String resourceGroupName, String galleryName, String galleryImageName) {
        this.deleteByGalleryAsync(resourceGroupName, galleryName, galleryImageName).await();
    }
}
