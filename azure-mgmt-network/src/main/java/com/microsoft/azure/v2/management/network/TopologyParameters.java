/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Parameters that define the representation of topology.
 */
public final class TopologyParameters {
    /**
     * The name of the target resource group to perform topology on.
     */
    @JsonProperty(value = "targetResourceGroupName", required = true)
    private String targetResourceGroupName;

    /**
     * Get the targetResourceGroupName value.
     *
     * @return the targetResourceGroupName value.
     */
    public String targetResourceGroupName() {
        return this.targetResourceGroupName;
    }

    /**
     * Set the targetResourceGroupName value.
     *
     * @param targetResourceGroupName the targetResourceGroupName value to set.
     * @return the TopologyParameters object itself.
     */
    public TopologyParameters withTargetResourceGroupName(String targetResourceGroupName) {
        this.targetResourceGroupName = targetResourceGroupName;
        return this;
    }
}