/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 * Changes may cause incorrect behavior and will be lost if the code is
 * regenerated.
 */

package com.microsoft.azure.management.monitor.implementation;

import java.util.List;
import com.microsoft.azure.management.monitor.Operation;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Result of the request to list Microsoft.Insights operations. It contains a
 * list of operations and a URL link to get the next set of results.
 */
public class OperationListResultInner {
    /**
     * List of operations supported by the Microsoft.Insights provider.
     */
    @JsonProperty(value = "value")
    private List<Operation> value;

    /**
     * URL to get the next set of operation list results if there are any.
     */
    @JsonProperty(value = "nextLink")
    private String nextLink;

    /**
     * Get the value value.
     *
     * @return the value value
     */
    public List<Operation> value() {
        return this.value;
    }

    /**
     * Set the value value.
     *
     * @param value the value value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withValue(List<Operation> value) {
        this.value = value;
        return this;
    }

    /**
     * Get the nextLink value.
     *
     * @return the nextLink value
     */
    public String nextLink() {
        return this.nextLink;
    }

    /**
     * Set the nextLink value.
     *
     * @param nextLink the nextLink value to set
     * @return the OperationListResultInner object itself.
     */
    public OperationListResultInner withNextLink(String nextLink) {
        this.nextLink = nextLink;
        return this;
    }

}