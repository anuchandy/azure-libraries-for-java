/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network.implementation;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.microsoft.azure.v2.SubResource;
import com.microsoft.azure.v2.management.network.ApplicationGatewaySslCipherSuite;
import com.microsoft.azure.v2.management.network.ApplicationGatewaySslProtocol;
import com.microsoft.rest.v2.serializer.JsonFlatten;
import java.util.List;

/**
 * An Ssl predefined policy.
 */
@JsonFlatten
public class ApplicationGatewaySslPredefinedPolicyInner extends SubResource {
    /**
     * Name of Ssl predefined policy.
     */
    @JsonProperty(value = "name")
    private String name;

    /**
     * Ssl cipher suites to be enabled in the specified order for application
     * gateway.
     */
    @JsonProperty(value = "properties.cipherSuites")
    private List<ApplicationGatewaySslCipherSuite> cipherSuites;

    /**
     * Minimum version of Ssl protocol to be supported on application gateway.
     * Possible values include: 'TLSv1_0', 'TLSv1_1', 'TLSv1_2'.
     */
    @JsonProperty(value = "properties.minProtocolVersion")
    private ApplicationGatewaySslProtocol minProtocolVersion;

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
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get the cipherSuites value.
     *
     * @return the cipherSuites value.
     */
    public List<ApplicationGatewaySslCipherSuite> cipherSuites() {
        return this.cipherSuites;
    }

    /**
     * Set the cipherSuites value.
     *
     * @param cipherSuites the cipherSuites value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withCipherSuites(List<ApplicationGatewaySslCipherSuite> cipherSuites) {
        this.cipherSuites = cipherSuites;
        return this;
    }

    /**
     * Get the minProtocolVersion value.
     *
     * @return the minProtocolVersion value.
     */
    public ApplicationGatewaySslProtocol minProtocolVersion() {
        return this.minProtocolVersion;
    }

    /**
     * Set the minProtocolVersion value.
     *
     * @param minProtocolVersion the minProtocolVersion value to set.
     * @return the ApplicationGatewaySslPredefinedPolicyInner object itself.
     */
    public ApplicationGatewaySslPredefinedPolicyInner withMinProtocolVersion(ApplicationGatewaySslProtocol minProtocolVersion) {
        this.minProtocolVersion = minProtocolVersion;
        return this;
    }
}
