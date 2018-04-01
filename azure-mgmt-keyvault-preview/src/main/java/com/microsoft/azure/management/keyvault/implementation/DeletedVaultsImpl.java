/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.keyvault.implementation;

import com.microsoft.azure.management.resources.fluentcore.model.implementation.WrapperImpl;
import com.microsoft.azure.management.keyvault.DeletedVaults;
import rx.Completable;
import rx.Observable;
import rx.functions.Func1;
import com.microsoft.azure.management.keyvault.DeletedVault;

public class DeletedVaultsImpl extends WrapperImpl<VaultsInner> implements DeletedVaults {
    private final KeyVaultManager manager;

    DeletedVaultsImpl(KeyVaultManager manager) {
        super(manager.inner().vaults());
        this.manager = manager;
    }

    public KeyVaultManager manager() {
        return this.manager;
    }

    private DeletedVaultImpl wrapModel(DeletedVaultInner inner) {
        return  new DeletedVaultImpl(inner, this.manager());
    }

    @Override
    public Completable purgeDeletedAsync(String vaultName, String location) {
        VaultsInner client = this.inner();
        return client.purgeDeletedAsync(vaultName, location).toCompletable();
    }

    @Override
    public Observable<DeletedVault> GetByLocationAsync(String vaultName, String location) {
        VaultsInner client = this.inner();
        return client.getDeletedAsync(vaultName, location)
        .map(new Func1<DeletedVaultInner, DeletedVault>() {
            @Override
            public DeletedVault call(DeletedVaultInner inner) {
                return wrapModel(inner);
            }
       });
    }

}
