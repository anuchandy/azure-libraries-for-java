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
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * Route table resource.
 */
@JsonFlatten
@SkipParentValidation
public class RouteTableInner extends Resource {
    /**
     * Collection of routes contained within a route table.
     */
    @JsonProperty(value = "properties.routes")
    private List<RouteInner> routesProperty;

    /**
     * A collection of references to subnets.
     */
    @JsonProperty(value = "properties.subnets", access = JsonProperty.Access.WRITE_ONLY)
    private List<SubnetInner> subnetsProperty;

    /**
     * The provisioning state of the resource. Possible values are: 'Updating',
     * 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Gets a unique read-only string that changes whenever the resource is
     * updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the routesProperty value.
     *
     * @return the routesProperty value.
     */
    public List<RouteInner> routesProperty() {
        return this.routesProperty;
    }

    /**
     * Set the routesProperty value.
     *
     * @param routesProperty the routesProperty value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withRoutesProperty(List<RouteInner> routesProperty) {
        this.routesProperty = routesProperty;
        return this;
    }

    /**
     * Get the subnetsProperty value.
     *
     * @return the subnetsProperty value.
     */
    public List<SubnetInner> subnetsProperty() {
        return this.subnetsProperty;
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
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
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
     * Set the etag value.
     *
     * @param etag the etag value to set.
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withEtag(String etag) {
        this.etag = etag;
        return this;
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
     * @return the RouteTableInner object itself.
     */
    public RouteTableInner withId(String id) {
        this.id = id;
        return this;
    }
}
