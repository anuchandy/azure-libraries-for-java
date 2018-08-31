/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.network;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.v2.ExpandableStringEnum;
import java.util.Collection;

/**
 * Defines values for ApplicationGatewayTier.
 */
public final class ApplicationGatewayTier extends ExpandableStringEnum<ApplicationGatewayTier> {
    /**
     * Static value Standard for ApplicationGatewayTier.
     */
    public static final ApplicationGatewayTier STANDARD = fromString("Standard");

    /**
     * Static value WAF for ApplicationGatewayTier.
     */
    public static final ApplicationGatewayTier WAF = fromString("WAF");

    /**
     * Creates or finds a ApplicationGatewayTier from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding ApplicationGatewayTier.
     */
    @JsonCreator
    public static ApplicationGatewayTier fromString(String name) {
        return fromString(name, ApplicationGatewayTier.class);
    }

    /**
     * @return known ApplicationGatewayTier values.
     */
    public static Collection<ApplicationGatewayTier> values() {
        return values(ApplicationGatewayTier.class);
    }
}
