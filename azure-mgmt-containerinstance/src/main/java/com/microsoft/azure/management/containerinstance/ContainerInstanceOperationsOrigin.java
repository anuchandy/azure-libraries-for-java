/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.containerinstance;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for ContainerInstanceOperationsOrigin.
 */
public final class ContainerInstanceOperationsOrigin extends ExpandableStringEnum<ContainerInstanceOperationsOrigin> {
    /** Static value User for ContainerInstanceOperationsOrigin. */
    public static final ContainerInstanceOperationsOrigin USER = fromString("User");

    /** Static value System for ContainerInstanceOperationsOrigin. */
    public static final ContainerInstanceOperationsOrigin SYSTEM = fromString("System");

    /**
     * Creates or finds a ContainerInstanceOperationsOrigin from its string representation.
     * @param name a name to look for
     * @return the corresponding ContainerInstanceOperationsOrigin
     */
    @JsonCreator
    public static ContainerInstanceOperationsOrigin fromString(String name) {
        return fromString(name, ContainerInstanceOperationsOrigin.class);
    }

    /**
     * @return known ContainerInstanceOperationsOrigin values
     */
    public static Collection<ContainerInstanceOperationsOrigin> values() {
        return values(ContainerInstanceOperationsOrigin.class);
    }
}
