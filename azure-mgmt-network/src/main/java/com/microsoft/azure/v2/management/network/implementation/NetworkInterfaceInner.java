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
import com.microsoft.azure.v2.management.network.NetworkInterfaceDnsSettings;
import com.microsoft.rest.v2.annotations.SkipParentValidation;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * A network interface in a resource group.
 */
@JsonFlatten
@SkipParentValidation
public class NetworkInterfaceInner extends Resource {
    /**
     * The reference of a virtual machine.
     */
    @JsonProperty(value = "properties.virtualMachine")
    private SubResource virtualMachine;

    /**
     * The reference of the NetworkSecurityGroup resource.
     */
    @JsonProperty(value = "properties.networkSecurityGroup")
    private NetworkSecurityGroupInner networkSecurityGroup;

    /**
     * A list of IPConfigurations of the network interface.
     */
    @JsonProperty(value = "properties.ipConfigurations")
    private List<NetworkInterfaceIPConfigurationInner> ipConfigurations;

    /**
     * The DNS settings in network interface.
     */
    @JsonProperty(value = "properties.dnsSettings")
    private NetworkInterfaceDnsSettings dnsSettings;

    /**
     * The MAC address of the network interface.
     */
    @JsonProperty(value = "properties.macAddress")
    private String macAddress;

    /**
     * Gets whether this is a primary network interface on a virtual machine.
     */
    @JsonProperty(value = "properties.primary")
    private Boolean primary;

    /**
     * If the network interface is accelerated networking enabled.
     */
    @JsonProperty(value = "properties.enableAcceleratedNetworking")
    private Boolean enableAcceleratedNetworking;

    /**
     * Indicates whether IP forwarding is enabled on this network interface.
     */
    @JsonProperty(value = "properties.enableIPForwarding")
    private Boolean enableIPForwarding;

    /**
     * The resource GUID property of the network interface resource.
     */
    @JsonProperty(value = "properties.resourceGuid")
    private String resourceGuid;

    /**
     * The provisioning state of the public IP resource. Possible values are:
     * 'Updating', 'Deleting', and 'Failed'.
     */
    @JsonProperty(value = "properties.provisioningState")
    private String provisioningState;

    /**
     * A unique read-only string that changes whenever the resource is updated.
     */
    @JsonProperty(value = "etag")
    private String etag;

    /**
     * Resource ID.
     */
    @JsonProperty(value = "id")
    private String id;

    /**
     * Get the virtualMachine value.
     *
     * @return the virtualMachine value.
     */
    public SubResource virtualMachine() {
        return this.virtualMachine;
    }

    /**
     * Set the virtualMachine value.
     *
     * @param virtualMachine the virtualMachine value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withVirtualMachine(SubResource virtualMachine) {
        this.virtualMachine = virtualMachine;
        return this;
    }

    /**
     * Get the networkSecurityGroup value.
     *
     * @return the networkSecurityGroup value.
     */
    public NetworkSecurityGroupInner networkSecurityGroup() {
        return this.networkSecurityGroup;
    }

    /**
     * Set the networkSecurityGroup value.
     *
     * @param networkSecurityGroup the networkSecurityGroup value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withNetworkSecurityGroup(NetworkSecurityGroupInner networkSecurityGroup) {
        this.networkSecurityGroup = networkSecurityGroup;
        return this;
    }

    /**
     * Get the ipConfigurations value.
     *
     * @return the ipConfigurations value.
     */
    public List<NetworkInterfaceIPConfigurationInner> ipConfigurations() {
        return this.ipConfigurations;
    }

    /**
     * Set the ipConfigurations value.
     *
     * @param ipConfigurations the ipConfigurations value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withIpConfigurations(List<NetworkInterfaceIPConfigurationInner> ipConfigurations) {
        this.ipConfigurations = ipConfigurations;
        return this;
    }

    /**
     * Get the dnsSettings value.
     *
     * @return the dnsSettings value.
     */
    public NetworkInterfaceDnsSettings dnsSettings() {
        return this.dnsSettings;
    }

    /**
     * Set the dnsSettings value.
     *
     * @param dnsSettings the dnsSettings value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withDnsSettings(NetworkInterfaceDnsSettings dnsSettings) {
        this.dnsSettings = dnsSettings;
        return this;
    }

    /**
     * Get the macAddress value.
     *
     * @return the macAddress value.
     */
    public String macAddress() {
        return this.macAddress;
    }

    /**
     * Set the macAddress value.
     *
     * @param macAddress the macAddress value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withMacAddress(String macAddress) {
        this.macAddress = macAddress;
        return this;
    }

    /**
     * Get the primary value.
     *
     * @return the primary value.
     */
    public Boolean primary() {
        return this.primary;
    }

    /**
     * Set the primary value.
     *
     * @param primary the primary value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withPrimary(Boolean primary) {
        this.primary = primary;
        return this;
    }

    /**
     * Get the enableAcceleratedNetworking value.
     *
     * @return the enableAcceleratedNetworking value.
     */
    public Boolean enableAcceleratedNetworking() {
        return this.enableAcceleratedNetworking;
    }

    /**
     * Set the enableAcceleratedNetworking value.
     *
     * @param enableAcceleratedNetworking the enableAcceleratedNetworking value
     * to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableAcceleratedNetworking(Boolean enableAcceleratedNetworking) {
        this.enableAcceleratedNetworking = enableAcceleratedNetworking;
        return this;
    }

    /**
     * Get the enableIPForwarding value.
     *
     * @return the enableIPForwarding value.
     */
    public Boolean enableIPForwarding() {
        return this.enableIPForwarding;
    }

    /**
     * Set the enableIPForwarding value.
     *
     * @param enableIPForwarding the enableIPForwarding value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEnableIPForwarding(Boolean enableIPForwarding) {
        this.enableIPForwarding = enableIPForwarding;
        return this;
    }

    /**
     * Get the resourceGuid value.
     *
     * @return the resourceGuid value.
     */
    public String resourceGuid() {
        return this.resourceGuid;
    }

    /**
     * Set the resourceGuid value.
     *
     * @param resourceGuid the resourceGuid value to set.
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withResourceGuid(String resourceGuid) {
        this.resourceGuid = resourceGuid;
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
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withProvisioningState(String provisioningState) {
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
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withEtag(String etag) {
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
     * @return the NetworkInterfaceInner object itself.
     */
    public NetworkInterfaceInner withId(String id) {
        this.id = id;
        return this;
    }
}
