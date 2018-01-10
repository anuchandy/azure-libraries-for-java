/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.eventgrid;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OperationOrigin.
 */
public final class OperationOrigin extends ExpandableStringEnum<OperationOrigin> {
    /** Static value User for OperationOrigin. */
    public static final OperationOrigin USER = fromString("User");

    /** Static value System for OperationOrigin. */
    public static final OperationOrigin SYSTEM = fromString("System");

    /** Static value UserAndSystem for OperationOrigin. */
    public static final OperationOrigin USER_AND_SYSTEM = fromString("UserAndSystem");

    /**
     * Creates or finds a OperationOrigin from its string representation.
     * @param name a name to look for
     * @return the corresponding OperationOrigin
     */
    @JsonCreator
    public static OperationOrigin fromString(String name) {
        return fromString(name, OperationOrigin.class);
    }

    /**
     * @return known OperationOrigin values
     */
    public static Collection<OperationOrigin> values() {
        return values(OperationOrigin.class);
    }
}
