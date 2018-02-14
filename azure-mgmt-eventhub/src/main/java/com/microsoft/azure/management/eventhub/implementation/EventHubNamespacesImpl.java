/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.eventhub.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.eventhub.EventHubNamespace;
import com.microsoft.azure.management.eventhub.EventHubNamespaceAuthorizationRules;
import com.microsoft.azure.management.eventhub.EventHubNamespaces;
import com.microsoft.azure.management.eventhub.EventHubs;
import com.microsoft.azure.management.resources.fluentcore.arm.collection.implementation.TopLevelModifiableResourcesImpl;
import com.microsoft.azure.management.storage.implementation.StorageManager;

/**
 * Implementation for {@link EventHubNamespaces}.
 */
@LangDefinition
class EventHubNamespacesImpl extends TopLevelModifiableResourcesImpl<
        EventHubNamespace,
        EventHubNamespaceImpl,
        EHNamespaceInner,
        NamespacesInner,
        EventHubManager>
    implements EventHubNamespaces {
    private final StorageManager storageManager;

    protected EventHubNamespacesImpl(EventHubManager manager, StorageManager storageManager) {
        super(manager.inner().namespaces(), manager);
        this.storageManager = storageManager;
    }

    @Override
    protected EventHubNamespaceImpl wrapModel(String name) {
        return new EventHubNamespaceImpl(name, new EHNamespaceInner(), this.manager(), storageManager);
    }

    @Override
    protected EventHubNamespaceImpl wrapModel(EHNamespaceInner inner) {
        return new EventHubNamespaceImpl(inner.name(), inner, this.manager(), storageManager);
    }

    @Override
    public EventHubNamespaceImpl define(String name) {
        return wrapModel(name);
    }

    @Override
    public EventHubNamespaceAuthorizationRules authorizationRules() {
        return this.manager().namespaceAuthorizationRules();
    }

    @Override
    public EventHubs eventHubs() {
        return this.manager().eventHubs();
    }
}
