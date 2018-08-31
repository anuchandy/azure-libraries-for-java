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
 * BGP peer status details.
 */
public final class BgpPeerStatus {
    /**
     * The virtual network gateway's local address.
     */
    @JsonProperty(value = "localAddress", access = JsonProperty.Access.WRITE_ONLY)
    private String localAddress;

    /**
     * The remote BGP peer.
     */
    @JsonProperty(value = "neighbor", access = JsonProperty.Access.WRITE_ONLY)
    private String neighbor;

    /**
     * The autonomous system number of the remote BGP peer.
     */
    @JsonProperty(value = "asn", access = JsonProperty.Access.WRITE_ONLY)
    private Integer asn;

    /**
     * The BGP peer state. Possible values include: 'Unknown', 'Stopped',
     * 'Idle', 'Connecting', 'Connected'.
     */
    @JsonProperty(value = "state", access = JsonProperty.Access.WRITE_ONLY)
    private BgpPeerState state;

    /**
     * For how long the peering has been up.
     */
    @JsonProperty(value = "connectedDuration", access = JsonProperty.Access.WRITE_ONLY)
    private String connectedDuration;

    /**
     * The number of routes learned from this peer.
     */
    @JsonProperty(value = "routesReceived", access = JsonProperty.Access.WRITE_ONLY)
    private Long routesReceived;

    /**
     * The number of BGP messages sent.
     */
    @JsonProperty(value = "messagesSent", access = JsonProperty.Access.WRITE_ONLY)
    private Long messagesSent;

    /**
     * The number of BGP messages received.
     */
    @JsonProperty(value = "messagesReceived", access = JsonProperty.Access.WRITE_ONLY)
    private Long messagesReceived;

    /**
     * Get the localAddress value.
     *
     * @return the localAddress value.
     */
    public String localAddress() {
        return this.localAddress;
    }

    /**
     * Get the neighbor value.
     *
     * @return the neighbor value.
     */
    public String neighbor() {
        return this.neighbor;
    }

    /**
     * Get the asn value.
     *
     * @return the asn value.
     */
    public Integer asn() {
        return this.asn;
    }

    /**
     * Get the state value.
     *
     * @return the state value.
     */
    public BgpPeerState state() {
        return this.state;
    }

    /**
     * Get the connectedDuration value.
     *
     * @return the connectedDuration value.
     */
    public String connectedDuration() {
        return this.connectedDuration;
    }

    /**
     * Get the routesReceived value.
     *
     * @return the routesReceived value.
     */
    public Long routesReceived() {
        return this.routesReceived;
    }

    /**
     * Get the messagesSent value.
     *
     * @return the messagesSent value.
     */
    public Long messagesSent() {
        return this.messagesSent;
    }

    /**
     * Get the messagesReceived value.
     *
     * @return the messagesReceived value.
     */
    public Long messagesReceived() {
        return this.messagesReceived;
    }
}
