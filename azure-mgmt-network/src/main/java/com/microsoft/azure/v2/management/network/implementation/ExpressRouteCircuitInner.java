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
import com.microsoft.azure.v2.management.network.ExpressRouteCircuitServiceProviderProperties;
import com.microsoft.azure.v2.management.network.ExpressRouteCircuitSku;
import com.microsoft.azure.v2.management.network.ServiceProviderProvisioningState;
import com.microsoft.rest.v2.annotations.SkipParentValidation;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * ExpressRouteCircuit resource.
 */
@JsonFlatten
@SkipParentValidation
public class ExpressRouteCircuitInner extends Resource {
    /**
     * The SKU.
     */
    @JsonProperty(value = "sku")
    private ExpressRouteCircuitSku sku;

    /**
     * Allow classic operations.
     */
    @JsonProperty(value = "properties.allowClassicOperations")
    private Boolean allowClassicOperations;

    /**
     * The CircuitProvisioningState state of the resource.
     */
    @JsonProperty(value = "properties.circuitProvisioningState")
    private String circuitProvisioningState;

    /**
     * The ServiceProviderProvisioningState state of the resource. Possible
     * values are 'NotProvisioned', 'Provisioning', 'Provisioned', and
     * 'Deprovisioning'. Possible values include: 'NotProvisioned',
     * 'Provisioning', 'Provisioned', 'Deprovisioning'.
     */
    @JsonProperty(value = "properties.serviceProviderProvisioningState")
    private ServiceProviderProvisioningState serviceProviderProvisioningState;

    /**
     * The list of authorizations.
     */
    @JsonProperty(value = "properties.authorizations")
    private List<ExpressRouteCircuitAuthorizationInner> authorizations;

    /**
     * The list of peerings.
     */
    @JsonProperty(value = "properties.peerings")
    private List<ExpressRouteCircuitPeeringInner> peerings;

    /**
     * The ServiceKey.
     */
    @JsonProperty(value = "properties.serviceKey")
    private String serviceKey;

    /**
     * The ServiceProviderNotes.
     */
    @JsonProperty(value = "properties.serviceProviderNotes")
    private String serviceProviderNotes;

    /**
     * The ServiceProviderProperties.
     */
    @JsonProperty(value = "properties.serviceProviderProperties")
    private ExpressRouteCircuitServiceProviderProperties serviceProviderProperties;

    /**
     * Gets the provisioning state of the public IP resource. Possible values
     * are: 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * The GatewayManager Etag.
     */
    @JsonProperty(value = "properties.gatewayManagerEtag")
    private String gatewayManagerEtag;

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
     * Get the sku value.
     *
     * @return the sku value.
     */
    public ExpressRouteCircuitSku sku() {
        return this.sku;
    }

    /**
     * Set the sku value.
     *
     * @param sku the sku value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withSku(ExpressRouteCircuitSku sku) {
        this.sku = sku;
        return this;
    }

    /**
     * Get the allowClassicOperations value.
     *
     * @return the allowClassicOperations value.
     */
    public Boolean allowClassicOperations() {
        return this.allowClassicOperations;
    }

    /**
     * Set the allowClassicOperations value.
     *
     * @param allowClassicOperations the allowClassicOperations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAllowClassicOperations(Boolean allowClassicOperations) {
        this.allowClassicOperations = allowClassicOperations;
        return this;
    }

    /**
     * Get the circuitProvisioningState value.
     *
     * @return the circuitProvisioningState value.
     */
    public String circuitProvisioningState() {
        return this.circuitProvisioningState;
    }

    /**
     * Set the circuitProvisioningState value.
     *
     * @param circuitProvisioningState the circuitProvisioningState value to
     * set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withCircuitProvisioningState(String circuitProvisioningState) {
        this.circuitProvisioningState = circuitProvisioningState;
        return this;
    }

    /**
     * Get the serviceProviderProvisioningState value.
     *
     * @return the serviceProviderProvisioningState value.
     */
    public ServiceProviderProvisioningState serviceProviderProvisioningState() {
        return this.serviceProviderProvisioningState;
    }

    /**
     * Set the serviceProviderProvisioningState value.
     *
     * @param serviceProviderProvisioningState the
     * serviceProviderProvisioningState value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProvisioningState(ServiceProviderProvisioningState serviceProviderProvisioningState) {
        this.serviceProviderProvisioningState = serviceProviderProvisioningState;
        return this;
    }

    /**
     * Get the authorizations value.
     *
     * @return the authorizations value.
     */
    public List<ExpressRouteCircuitAuthorizationInner> authorizations() {
        return this.authorizations;
    }

    /**
     * Set the authorizations value.
     *
     * @param authorizations the authorizations value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withAuthorizations(List<ExpressRouteCircuitAuthorizationInner> authorizations) {
        this.authorizations = authorizations;
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
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withPeerings(List<ExpressRouteCircuitPeeringInner> peerings) {
        this.peerings = peerings;
        return this;
    }

    /**
     * Get the serviceKey value.
     *
     * @return the serviceKey value.
     */
    public String serviceKey() {
        return this.serviceKey;
    }

    /**
     * Set the serviceKey value.
     *
     * @param serviceKey the serviceKey value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceKey(String serviceKey) {
        this.serviceKey = serviceKey;
        return this;
    }

    /**
     * Get the serviceProviderNotes value.
     *
     * @return the serviceProviderNotes value.
     */
    public String serviceProviderNotes() {
        return this.serviceProviderNotes;
    }

    /**
     * Set the serviceProviderNotes value.
     *
     * @param serviceProviderNotes the serviceProviderNotes value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderNotes(String serviceProviderNotes) {
        this.serviceProviderNotes = serviceProviderNotes;
        return this;
    }

    /**
     * Get the serviceProviderProperties value.
     *
     * @return the serviceProviderProperties value.
     */
    public ExpressRouteCircuitServiceProviderProperties serviceProviderProperties() {
        return this.serviceProviderProperties;
    }

    /**
     * Set the serviceProviderProperties value.
     *
     * @param serviceProviderProperties the serviceProviderProperties value to
     * set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withServiceProviderProperties(ExpressRouteCircuitServiceProviderProperties serviceProviderProperties) {
        this.serviceProviderProperties = serviceProviderProperties;
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
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withProvisioningState(String provisioningState) {
        this.provisioningState = provisioningState;
        return this;
    }

    /**
     * Get the gatewayManagerEtag value.
     *
     * @return the gatewayManagerEtag value.
     */
    public String gatewayManagerEtag() {
        return this.gatewayManagerEtag;
    }

    /**
     * Set the gatewayManagerEtag value.
     *
     * @param gatewayManagerEtag the gatewayManagerEtag value to set.
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withGatewayManagerEtag(String gatewayManagerEtag) {
        this.gatewayManagerEtag = gatewayManagerEtag;
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
     * @return the ExpressRouteCircuitInner object itself.
     */
    public ExpressRouteCircuitInner withId(String id) {
        this.id = id;
        return this;
    }
}
