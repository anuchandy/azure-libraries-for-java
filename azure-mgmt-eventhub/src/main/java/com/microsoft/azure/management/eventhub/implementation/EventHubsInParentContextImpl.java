package com.microsoft.azure.management.eventhub.implementation;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.eventhub.EventHub;
import com.microsoft.azure.management.eventhub.EventHubNamespace;
import com.microsoft.azure.management.eventhub.EventHubsInParentContext;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.storage.implementation.StorageManager;
import com.microsoft.rest.ServiceCallback;
import com.microsoft.rest.ServiceFuture;
import rx.Completable;
import rx.Observable;

class EventHubsInParentContextImpl extends WrapperImpl<EventHubsInner> implements EventHubsInParentContext {
    private EventHubManager manager;
    private EventHubNamespace parentNamespace;
    private StorageManager storageManager;

    protected EventHubsInParentContextImpl(EventHubsInner inner, EventHubNamespace parentNamespace, EventHubManager manager, StorageManager storageManager) {
        super(inner);
        this.parentNamespace = parentNamespace;
        this.manager = manager;
    }

    @Override
    public PagedList<EventHub> list() {
        return manager
                .eventHubs()
                .listByNamespace(parentNamespace.resourceGroupName(), parentNamespace.name());
    }

    @Override
    public Observable<EventHub> listAsync() {
        return manager
                .eventHubs()
                .listByNamespaceAsync(parentNamespace.resourceGroupName(), parentNamespace.name());
    }

    @Override
    public Observable<EventHub> getByNameAsync(String name) {
        return manager
                .eventHubs()
                .getByNameAsync(parentNamespace.resourceGroupName(), parentNamespace.name(), name);
    }

    @Override
    public EventHub getByName(String name) {
        return manager
                .eventHubs()
                .getByName(parentNamespace.resourceGroupName(), parentNamespace.name(), name);
    }

    @Override
    public Completable deleteByNameAsync(String name) {
        return manager
                .eventHubs()
                .deleteByNameAsync(parentNamespace.resourceGroupName(), parentNamespace.name(), name);
    }

    @Override
    public void deleteByName(String name) {
        manager.eventHubs()
                .deleteByName(parentNamespace.resourceGroupName(), parentNamespace.name(), name);
    }

    @Override
    public EventHub getById(String id) {
        return manager
                .eventHubs()
                .getById(id);
    }

    @Override
    public Observable<EventHub> getByIdAsync(String id) {
            return manager
                    .eventHubs()
                    .getByIdAsync(id);
    }

    @Override
    public ServiceFuture<EventHub> getByIdAsync(String id, ServiceCallback<EventHub> callback) {
        return manager
                .eventHubs()
                .getByIdAsync(id, callback);
    }

    @Override
    public EventHubManager manager() {
        return this.manager;
    }

    @Override
    public EventHubInParentContextImpl define(String name) {
        return new EventHubInParentContextImpl(name, this.parentNamespace, this.manager, storageManager);
    }

    @Override
    public void deleteById(String id) {
        manager.eventHubs()
                .deleteById(id);
    }

    @Override
    public ServiceFuture<Void> deleteByIdAsync(String id, ServiceCallback<Void> callback) {
        return manager
                .eventHubs()
                .deleteByIdAsync(id, callback);
    }

    @Override
    public Completable deleteByIdAsync(String id) {
        return manager
                .eventHubs()
                .deleteByIdAsync(id);
    }
}
