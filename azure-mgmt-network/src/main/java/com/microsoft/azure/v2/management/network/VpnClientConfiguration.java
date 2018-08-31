/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonProperty;
import java.util.List;

/**
 * VpnClientConfiguration for P2S client.
 */
public final class VpnClientConfiguration {
    /**
     * The reference of the address space resource which represents Address
     * space for P2S VpnClient.
     */
    @JsonProperty(value = "vpnClientAddressPool")
    private AddressSpace vpnClientAddressPool;

    /**
     * VpnClientRootCertificate for virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRootCertificates")
    private List<VpnClientRootCertificate> vpnClientRootCertificates;

    /**
     * VpnClientRevokedCertificate for Virtual network gateway.
     */
    @JsonProperty(value = "vpnClientRevokedCertificates")
    private List<VpnClientRevokedCertificate> vpnClientRevokedCertificates;

    /**
     * VpnClientProtocols for Virtual network gateway.
     */
    @JsonProperty(value = "vpnClientProtocols")
    private List<VpnClientProtocol> vpnClientProtocols;

    /**
     * The radius server address property of the VirtualNetworkGateway resource
     * for vpn client connection.
     */
    @JsonProperty(value = "radiusServerAddress")
    private String radiusServerAddress;

    /**
     * The radius secret property of the VirtualNetworkGateway resource for vpn
     * client connection.
     */
    @JsonProperty(value = "radiusServerSecret")
    private String radiusServerSecret;

    /**
     * Get the vpnClientAddressPool value.
     *
     * @return the vpnClientAddressPool value.
     */
    public AddressSpace vpnClientAddressPool() {
        return this.vpnClientAddressPool;
    }

    /**
     * Set the vpnClientAddressPool value.
     *
     * @param vpnClientAddressPool the vpnClientAddressPool value to set.
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientAddressPool(AddressSpace vpnClientAddressPool) {
        this.vpnClientAddressPool = vpnClientAddressPool;
        return this;
    }

    /**
     * Get the vpnClientRootCertificates value.
     *
     * @return the vpnClientRootCertificates value.
     */
    public List<VpnClientRootCertificate> vpnClientRootCertificates() {
        return this.vpnClientRootCertificates;
    }

    /**
     * Set the vpnClientRootCertificates value.
     *
     * @param vpnClientRootCertificates the vpnClientRootCertificates value to
     * set.
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRootCertificates(List<VpnClientRootCertificate> vpnClientRootCertificates) {
        this.vpnClientRootCertificates = vpnClientRootCertificates;
        return this;
    }

    /**
     * Get the vpnClientRevokedCertificates value.
     *
     * @return the vpnClientRevokedCertificates value.
     */
    public List<VpnClientRevokedCertificate> vpnClientRevokedCertificates() {
        return this.vpnClientRevokedCertificates;
    }

    /**
     * Set the vpnClientRevokedCertificates value.
     *
     * @param vpnClientRevokedCertificates the vpnClientRevokedCertificates
     * value to set.
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientRevokedCertificates(List<VpnClientRevokedCertificate> vpnClientRevokedCertificates) {
        this.vpnClientRevokedCertificates = vpnClientRevokedCertificates;
        return this;
    }

    /**
     * Get the vpnClientProtocols value.
     *
     * @return the vpnClientProtocols value.
     */
    public List<VpnClientProtocol> vpnClientProtocols() {
        return this.vpnClientProtocols;
    }

    /**
     * Set the vpnClientProtocols value.
     *
     * @param vpnClientProtocols the vpnClientProtocols value to set.
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withVpnClientProtocols(List<VpnClientProtocol> vpnClientProtocols) {
        this.vpnClientProtocols = vpnClientProtocols;
        return this;
    }

    /**
     * Get the radiusServerAddress value.
     *
     * @return the radiusServerAddress value.
     */
    public String radiusServerAddress() {
        return this.radiusServerAddress;
    }

    /**
     * Set the radiusServerAddress value.
     *
     * @param radiusServerAddress the radiusServerAddress value to set.
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withRadiusServerAddress(String radiusServerAddress) {
        this.radiusServerAddress = radiusServerAddress;
        return this;
    }

    /**
     * Get the radiusServerSecret value.
     *
     * @return the radiusServerSecret value.
     */
    public String radiusServerSecret() {
        return this.radiusServerSecret;
    }

    /**
     * Set the radiusServerSecret value.
     *
     * @param radiusServerSecret the radiusServerSecret value to set.
     * @return the VpnClientConfiguration object itself.
     */
    public VpnClientConfiguration withRadiusServerSecret(String radiusServerSecret) {
        this.radiusServerSecret = radiusServerSecret;
        return this;
    }
}
