/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.Resource;
import com.microsoft.rest.v2.annotations.SkipParentValidation;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Route Filter Resource.
 */
@JsonFlatten
@SkipParentValidation
public class RouteFilterInner extends Resource {
    /**
     * Collection of RouteFilterRules contained within a route filter.
     */
    @JsonProperty(value = "properties.rules")
    private List<RouteFilterRuleInner> rules;

    /**
     * A collection of references to express route circuit peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /**
     * The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', 'Succeeded' and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState", access = JsonProperty.Access.WRITE_ONLY)
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag", access = JsonProperty.Access.WRITE_ONLY)
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the rules value.
     *
     * @return the rules value.
     */
    public List<RouteFilterRuleInner> rules() {
        return this.rules;
    }

    /**
     * Set the rules value.
     *
     * @param rules the rules value to set.
     * @return the RouteFilterInner object itself.
     */
    public RouteFilterInner withRules(List<RouteFilterRuleInner> rules) {
        this.rules = rules;
        return this;
    }

    /**
     * Get the peerings value.
     *
     * @return the peerings value.
     */
    public List<ExpressRouteCircuitPeeringInner> peerings() {
        return this.peerings;
    }

    /**
     * Set the peerings value.
     *
     * @param peerings the peerings value to set.
     * @return the RouteFilterInner object itself.
     */
    public RouteFilterInner withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value.
     */
    public String provisioningState() {
        return this.provisioningState;
    }

    /**
     * Get the etag value.
     *
     * @return the etag value.
     */
    public String etag() {
        return this.etag;
    }

    /**
     * Get the id value.
     *
     * @return the id value.
     */
    public String id() {
        return this.id;
    }

    /**
     * Set the id value.
     *
     * @param id the id value to set.
     * @return the RouteFilterInner object itself.
     */
    public RouteFilterInner withId(String id) {
        this.id = id;
        return this;
    }
}
