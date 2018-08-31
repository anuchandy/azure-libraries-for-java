/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.SubResource;
import com.microsoft.rest.v2.serializer.JsonFlatten;

/**
 * IP configuration of an application gateway. Currently 1 public and 1 private
 * IP configuration is allowed.
 */
@JsonFlatten
public class ApplicationGatewayIPConfiguration extends SubResource {
    /**
     * Reference of the subnet resource. A subnet from where application
     * gateway gets its private address.
     */
    @JsonProperty(value = "properties.subnet")
    private SubResource subnet;

    /**
     * Provisioning state of the application gateway subnet resource. Possible
     * values are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * Name of the resource that is unique within a resource group. This name
     * can be used to access the resource.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Type of the resource.
     */
    @JsonProperty(value = "type")
    private String type;

    /**
     * Get the subnet value.
     *
     * @return the subnet value.
     */
    public SubResource subnet() {
        return this.subnet;
    }

    /**
     * Set the subnet value.
     *
     * @param subnet the subnet value to set.
     * @return the ApplicationGatewayIPConfiguration object itself.
     */
    public ApplicationGatewayIPConfiguration withSubnet(SubResource subnet) {
        this.subnet = subnet;
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
     * Set the provisioningState value.
     *
     * @param provisioningState the provisioningState value to set.
     * @return the ApplicationGatewayIPConfiguration object itself.
     */
    public ApplicationGatewayIPConfiguration withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the name value.
     *
     * @return the name value.
     */
    public String name() {
        return this.name;
    }

    /**
     * Set the name value.
     *
     * @param name the name value to set.
     * @return the ApplicationGatewayIPConfiguration object itself.
     */
    public ApplicationGatewayIPConfiguration withName(String name) {
        this.name = name;
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
     * @return the ApplicationGatewayIPConfiguration object itself.
     */
    public ApplicationGatewayIPConfiguration withEtag(String etag) {
        this.etag = etag;
        return this;
    }

    /**
     * Get the type value.
     *
     * @return the type value.
     */
    public String type() {
        return this.type;
    }

    /**
     * Set the type value.
     *
     * @param type the type value to set.
     * @return the ApplicationGatewayIPConfiguration object itself.
     */
    public ApplicationGatewayIPConfiguration withType(String type) {
        this.type = type;
        return this;
    }
}