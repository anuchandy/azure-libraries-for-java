/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.eventhub;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.eventhub.implementation.AccessKeysInner;
import com.microsoft.azure.management.resources.fluentcore.model.HasInner;

/**
 * Type representing access key of {@link EventHubNamespaceAuthorizationRule}.
 */
@Fluent
@Beta(Beta.SinceVersion.V2_0_0)
public interface EventHubAuthorizationKey
        extends
        HasInner<AccessKeysInner> {
    /**
     * @return primary access key
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    String primaryKey();
    /**
     * @return secondary access key
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    String secondaryKey();
    /**
     * @return primary connection string
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    String primaryConnectionString();
    /**
     * @return secondary connection string
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    String secondaryConnectionString();
}
