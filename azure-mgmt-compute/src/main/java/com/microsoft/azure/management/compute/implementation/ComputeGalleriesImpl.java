/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.compute.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.compute.ComputeGalleries;
import com.microsoft.azure.management.compute.ComputeGallery;
import com.microsoft.azure.management.resources.fluentcore.arm.ResourceUtils;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.GroupableResourcesImpl;
import com.microsoft.azure.management.resources.fluentcore.utils.RXMapper;
import rx.Observable;
import rx.Completable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import rx.functions.Func1;
import com.microsoft.azure.Page;

/**
 * The implementation for ComputeGalleries.
 */
@LangDefinition
class ComputeGalleriesImpl extends GroupableResourcesImpl<ComputeGallery, ComputeGalleryImpl, GalleryInner, GalleriesInner, ComputeManager> implements ComputeGalleries {
    protected ComputeGalleriesImpl(ComputeManager manager) {
        super(manager.inner().galleries(), manager);
    }

    @Override
    protected Observable<GalleryInner> getInnerAsync(String resourceGroupName, String name) {
        GalleriesInner client = this.inner();
        return client.getByResourceGroupAsync(resourceGroupName, name);
    }

    @Override
    protected Completable deleteInnerAsync(String resourceGroupName, String name) {
        GalleriesInner client = this.inner();
        return client.deleteAsync(resourceGroupName, name).toCompletable();
    }

    @Override
    public Observable<String> deleteByIdsAsync(Collection<String> ids) {
        if (ids == null || ids.isEmpty()) {
            return Observable.empty();
        }
        Collection<Observable<String>> observables = new ArrayList<>();
        for (String id : ids) {
            final String resourceGroupName = ResourceUtils.groupFromResourceId(id);
            final String name = ResourceUtils.nameFromResourceId(id);
            Observable<String> o = RXMapper.map(this.inner().deleteAsync(resourceGroupName, name), id);
            observables.add(o);
        }
        return Observable.mergeDelayError(observables);
    }

    @Override
    public Observable<String> deleteByIdsAsync(String...ids) {
        return this.deleteByIdsAsync(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public void deleteByIds(Collection<String> ids) {
        if (ids != null && !ids.isEmpty()) {
            this.deleteByIdsAsync(ids).toBlocking().last();
        }
    }

    @Override
    public void deleteByIds(String...ids) {
        this.deleteByIds(new ArrayList<String>(Arrays.asList(ids)));
    }

    @Override
    public PagedList<ComputeGallery> listByResourceGroup(String resourceGroupName) {
        GalleriesInner client = this.inner();
        return this.wrapList(client.listByResourceGroup(resourceGroupName));
    }

    @Override
    public Observable<ComputeGallery> listByResourceGroupAsync(String resourceGroupName) {
        GalleriesInner client = this.inner();
        return client.listByResourceGroupAsync(resourceGroupName)
        .flatMapIterable(new Func1<Page<GalleryInner>, Iterable<GalleryInner>>() {
            @Override
            public Iterable<GalleryInner> call(Page<GalleryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GalleryInner, ComputeGallery>() {
            @Override
            public ComputeGallery call(GalleryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public PagedList<ComputeGallery> list() {
        GalleriesInner client = this.inner();
        return this.wrapList(client.list());
    }

    @Override
    public Observable<ComputeGallery> listAsync() {
        GalleriesInner client = this.inner();
        return client.listAsync()
        .flatMapIterable(new Func1<Page<GalleryInner>, Iterable<GalleryInner>>() {
            @Override
            public Iterable<GalleryInner> call(Page<GalleryInner> page) {
                return page.items();
            }
        })
        .map(new Func1<GalleryInner, ComputeGallery>() {
            @Override
            public ComputeGallery call(GalleryInner inner) {
                return wrapModel(inner);
            }
        });
    }

    @Override
    public ComputeGalleryImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    protected ComputeGalleryImpl wrapModel(GalleryInner inner) {
        return new ComputeGalleryImpl(inner.name(), inner, manager());
    }

    @Override
    protected ComputeGalleryImpl wrapModel(String name) {
        return new ComputeGalleryImpl(name, new GalleryInner(), this.manager());
    }
}
