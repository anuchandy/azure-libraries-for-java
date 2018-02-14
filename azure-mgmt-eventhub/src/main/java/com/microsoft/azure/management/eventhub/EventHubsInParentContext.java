package com.microsoft.azure.management.eventhub;

import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.eventhub.implementation.EventHubManager;
import com.microsoft.azure.management.eventhub.implementation.EventHubsInner;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.SupportsGettingById;
import com.microsoft.azure.management.resources.fluentcore.arm.models.HasManager;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsCreating;
import com.microsoft.azure.management.resources.fluentcore.collection.SupportsDeletingById;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import rx.Completable;
import rx.Observable;

/**
 * Entry point to manage event hubs in the context of namespace.
 */
@Fluent
@Beta(Beta.SinceVersion.V1_7_0)
public interface EventHubsInParentContext extends
        SupportsCreating<EventHubInParentContext.DefinitionStages.Blank>,
        SupportsDeletingById,
        SupportsGettingById<EventHub>,
        HasInner<EventHubsInner>,
        HasManager<EventHubManager> {
    /**
     * Lists the event hubs in a namespace under a resource group.
     *
     * @return list of event hubs
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    PagedList<EventHub> list();
    /**
     * Lists the event hubs in a namespace under a resource group.
     *
     * @return observable that emits the event hubs
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    Observable<EventHub> listAsync();
    /**
     * Gets an event hub in a namespace under a resource group.
     *
     * @param name event hub name
     * @return observable that emits the event hubs
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    Observable<EventHub> getByNameAsync(String name);
    /**
     * Gets an event hub in a namespace under a resource group.
     *
     * @param name event hub name
     * @return the event hubs
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    EventHub getByName(String name);
    /**
     * Deletes an event hub in a namespace under a resource group.
     *
     * @param name event hub name
     * @return the completable representing the task
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    Completable deleteByNameAsync(String name);
    /**
     * Deletes an event hub in a namespace under a resource group.
     *
     * @param name event hub name
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    void deleteByName(String name);
}
