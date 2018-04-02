/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.implementation;

import com.microsoft.azure.management.keyvault.Operation;
import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.keyvault.OperationDisplay;
import com.microsoft.azure.management.keyvault.ServiceSpecification;

class OperationImpl extends WrapperImpl<OperationInner> implements Operation {

    OperationImpl(OperationInner inner) {
        super(inner);
    }

    @Override
    public OperationDisplay display() {
        return this.inner().display();
    }

    @Override
    public String name() {
        return this.inner().name();
    }

    @Override
    public String origin() {
        return this.inner().origin();
    }

    @Override
    public ServiceSpecification serviceSpecification() {
        return this.inner().serviceSpecification();
    }

}
