/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault;

import com.microsoft.azure.management.resources.fluentcore.model.HasInner;
import com.microsoft.azure.management.keyvault.implementation.OperationInner;
import com.microsoft.azure.management.keyvault.OperationDisplay;
import com.microsoft.azure.management.keyvault.ServiceSpecification;

public interface Operation extends HasInner<OperationInner> {
    /**
     * @return the display value.
     */
    OperationDisplay display();

    /**
     * @return the name value.
     */
    String name();

    /**
     * @return the origin value.
     */
    String origin();

    /**
     * @return the serviceSpecification value.
     */
    ServiceSpecification serviceSpecification();

}
