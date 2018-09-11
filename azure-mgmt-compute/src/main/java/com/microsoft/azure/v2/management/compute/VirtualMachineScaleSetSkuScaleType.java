/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.v2.management.compute;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;

/**
 * Defines values for VirtualMachineScaleSetSkuScaleType.
 */
public enum VirtualMachineScaleSetSkuScaleType {
    /**
     * Enum value Automatic.
     */
    AUTOMATIC("Automatic"),

    /**
     * Enum value None.
     */
    NONE("None");

    /**
     * The actual serialized value for a VirtualMachineScaleSetSkuScaleType instance.
     */
    private final String value;

    VirtualMachineScaleSetSkuScaleType(String value) {
        this.value = value;
    }

    /**
     * Parses a serialized value to a VirtualMachineScaleSetSkuScaleType instance.
     *
     * @param value the serialized value to parse.
     * @return the parsed VirtualMachineScaleSetSkuScaleType object, or null if unable to parse.
     */
    @JsonCreator
    public static VirtualMachineScaleSetSkuScaleType fromString(String value) {
        VirtualMachineScaleSetSkuScaleType[] items = VirtualMachineScaleSetSkuScaleType.values();
        for (VirtualMachineScaleSetSkuScaleType item : items) {
            if (item.toString().equalsIgnoreCase(value)) {
                return item;
            }
        }
        return null;
    }

    @JsonValue
    @Override
    public String toString() {
        return this.value;
    }
}
