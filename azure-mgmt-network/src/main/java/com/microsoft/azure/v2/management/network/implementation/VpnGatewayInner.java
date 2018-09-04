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
import com.microsoft.azure.v2.SubResource;
import com.microsoft.azure.v2.management.network.BgpSettings;
import com.microsoft.azure.v2.management.network.Policies;
import com.microsoft.azure.v2.management.network.ProvisioningState;
import com.microsoft.rest.v2.annotations.SkipParentValidation;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * VpnGateway Resource.
 */
@JsonFlatten
@SkipParentValidation
public class VpnGatewayInner extends Resource {
    /**
     * The VirtualHub to which the gateway belongs.
     */
    @JsonProperty(value = "properties.virtualHub")
    private SubResource virtualHub;

    /**
     * list of all vpn connections to the gateway.
     */
    @JsonProperty(value = "properties.connections")
    private List<VpnConnectionInner> connections;

    /**
     * Local network gateway's BGP speaker settings.
     */
    @JsonProperty(value = "properties.bgpSettings")
    private BgpSettings bgpSettings;

    /**
     * The provisioning state of the resource. Possible values include:
     * 'Succeeded', 'Updating', 'Deleting', 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private ProvisioningState provisioningState;

    /**
     * The policies applied to this vpn gateway.
     */
    @JsonProperty(value = "properties.policies")
    private Policies policies;

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
     * Get the virtualHub value.
     *
     * @return the virtualHub value.
     */
    public SubResource virtualHub() {
        return this.virtualHub;
    }

    /**
     * Set the virtualHub value.
     *
     * @param virtualHub the virtualHub value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withVirtualHub(SubResource virtualHub) {
        this.virtualHub = virtualHub;
        return this;
    }

    /**
     * Get the connections value.
     *
     * @return the connections value.
     */
    public List<VpnConnectionInner> connections() {
        return this.connections;
    }

    /**
     * Set the connections value.
     *
     * @param connections the connections value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withConnections(List<VpnConnectionInner> connections) {
        this.connections = connections;
        return this;
    }

    /**
     * Get the bgpSettings value.
     *
     * @return the bgpSettings value.
     */
    public BgpSettings bgpSettings() {
        return this.bgpSettings;
    }

    /**
     * Set the bgpSettings value.
     *
     * @param bgpSettings the bgpSettings value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withBgpSettings(BgpSettings bgpSettings) {
        this.bgpSettings = bgpSettings;
        return this;
    }

    /**
     * Get the provisioningState value.
     *
     * @return the provisioningState value.
     */
    public ProvisioningState provisioningState() {
        return this.provisioningState;
    }

    /**
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withProvisioningState(ProvisioningState provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the policies value.
     *
     * @return the policies value.
     */
    public Policies policies() {
        return this.policies;
    }

    /**
     * Set the policies value.
     *
     * @param policies the policies value to set.
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withPolicies(Policies policies) {
        this.policies = policies;
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
     * @return the VpnGatewayInner object itself.
     */
    public VpnGatewayInner withId(String id) {
        this.id = id;
        return this;
    }
}
