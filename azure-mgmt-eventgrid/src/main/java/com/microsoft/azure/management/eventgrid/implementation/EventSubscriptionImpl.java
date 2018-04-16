/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 *
 */

package com.microsoft.azure.management.eventgrid.implementation;

import com.microsoft.azure.management.eventgrid.EventSubscription;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.CreatableUpdatableImpl;
import rx.Observable;
import com.microsoft.azure.management.eventgrid.EventSubscriptionDestination;
import com.microsoft.azure.management.eventgrid.EventSubscriptionFilter;
import java.util.List;
import com.microsoft.azure.management.eventgrid.EventSubscriptionProvisioningState;
import rx.functions.Func1;

class EventSubscriptionImpl extends CreatableUpdatableImpl<EventSubscription, EventSubscriptionInner, EventSubscriptionImpl> implements EventSubscription, EventSubscription.Definition, EventSubscription.Update {
    private String scope;
    private String eventSubscriptionName;
    private EventSubscriptionUpdateParametersInner updateParameter;
    private final EventGridManager manager;

    EventSubscriptionImpl(String name, EventGridManager manager) {
        super(name, new EventSubscriptionInner());
        this.manager = manager;
        // Set resource name
        this.eventSubscriptionName = name;
        //
        this.updateParameter = new EventSubscriptionUpdateParametersInner();
    }

    EventSubscriptionImpl(EventSubscriptionInner inner, EventGridManager manager) {
        super(inner.name(), inner);
        this.manager = manager;
        // Set resource name
        this.eventSubscriptionName = inner.name();
        // resource ancestor names
        this.eventSubscriptionName = IdParsingUtils.getValueFromIdByName(inner.id(), "eventSubscriptions");
        // this.scope = IdParsingUtils.getValueFromIdByPosition(inner.id(), 0);
        //
        this.scope = inner.id().substring(1, inner.id().indexOf("/provider") - 1);
        this.updateParameter = new EventSubscriptionUpdateParametersInner();
    }

    @Override
    public EventGridManager manager() {
        return this.manager;
    }

    @Override
    public Observable<EventSubscription> createResourceAsync() {
        EventSubscriptionsInner client = this.manager().inner().eventSubscriptions();
        return client.createOrUpdateAsync(this.scope, this.eventSubscriptionName, this.inner())
            .map(new Func1<EventSubscriptionInner, EventSubscriptionInner>() {
               @Override
               public EventSubscriptionInner call(EventSubscriptionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    public Observable<EventSubscription> updateResourceAsync() {
        EventSubscriptionsInner client = this.manager().inner().eventSubscriptions();
        return client.updateAsync(this.scope, this.eventSubscriptionName, this.updateParameter)
            .map(new Func1<EventSubscriptionInner, EventSubscriptionInner>() {
               @Override
               public EventSubscriptionInner call(EventSubscriptionInner resource) {
                   resetCreateUpdateParameters();
                   return resource;
               }
            })
            .map(innerToFluentMap(this));
    }

    @Override
    protected Observable<EventSubscriptionInner> getInnerAsync() {
        EventSubscriptionsInner client = this.manager().inner().eventSubscriptions();
        return client.getAsync(this.scope, this.eventSubscriptionName);
    }

    @Override
    public boolean isInCreateMode() {
        return this.inner().id() == null;
    }

    private void resetCreateUpdateParameters() {
        this.updateParameter = new EventSubscriptionUpdateParametersInner();
    }

    @Override
    public EventSubscriptionDestination destination() {
        return this.inner().destination();
    }

    @Override
    public EventSubscriptionFilter filter() {
        return this.inner().filter();
    }

    @Override
    public String id() {
        return this.inner().id();
    }

    @Override
    public List<String> labels() {
        return this.inner().labels();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public EventSubscriptionProvisioningState provisioningState() {
        return this.inner().provisioningState();
    }

    @Override
    public String topic() {
        return this.inner().topic();
    }

    @Override
    public String type() {
        return this.inner().type();
    }

    @Override
    public EventSubscriptionImpl withScope(String scope) {
        this.scope = scope;
        return this;
    }

    @Override
    public EventSubscriptionImpl withDestination(EventSubscriptionDestination destination) {
        if (isInCreateMode()) {
            this.inner().withDestination(destination);
        } else {
            this.updateParameter.withDestination(destination);
        }
        return this;
    }

    @Override
    public EventSubscriptionImpl withFilter(EventSubscriptionFilter filter) {
        if (isInCreateMode()) {
            this.inner().withFilter(filter);
        } else {
            this.updateParameter.withFilter(filter);
        }
        return this;
    }

    @Override
    public EventSubscriptionImpl withLabels(List<String> labels) {
        if (isInCreateMode()) {
            this.inner().withLabels(labels);
        } else {
            this.updateParameter.withLabels(labels);
        }
        return this;
    }

}
