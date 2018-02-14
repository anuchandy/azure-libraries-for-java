package com.microsoft.azure.management.eventhub.implementation;

import com.microsoft.azure.management.apigeneration.LangDefinition;
import com.microsoft.azure.management.eventhub.EventHubInParentContext;
import com.microsoft.azure.management.eventhub.EventHubNamespace;
import com.microsoft.azure.management.storage.implementation.StorageManager;

/**
 * Implementation for {@link EventHubInParentContext}.
 */
@LangDefinition
public class EventHubInParentContextImpl extends EventHubImpl {
    EventHubInParentContextImpl(String name, EventHubNamespace namespace, EventHubManager manager, StorageManager storageManager) {
        super(name, manager, storageManager);
        this.withExistingNamespace(namespace);
    }
}
