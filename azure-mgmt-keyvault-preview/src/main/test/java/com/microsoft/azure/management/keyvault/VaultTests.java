/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 */

package com.microsoft.azure.management.keyvault;

import com.microsoft.azure.Page;
import com.microsoft.azure.PagedList;
import com.microsoft.azure.management.keyvault.implementation.*;
import com.microsoft.azure.management.resources.fluentcore.arm.Region;
import org.junit.Ignore;
import org.junit.Test;
import rx.Observable;
import rx.functions.Action1;
import rx.functions.Func1;

import java.util.ArrayList;
import java.util.UUID;

public class VaultTests extends KeyVaultManagementTest {

    @Test
    @Ignore
    public void canCreateVault() throws Exception {
        RG_NAME = generateRandomResourceName("javacsmrg", 15);
        VAULT_NAME = generateRandomResourceName("java-keyvault-", 20);
        //
        // ===================Create Vault using interface based code-gen==================
        //
        VaultProperties vaultProperties1 = new VaultProperties();
        vaultProperties1.withAccessPolicies(new ArrayList<AccessPolicyEntry>());
        vaultProperties1.withTenantId(UUID.fromString("54826b22-38d6-4fb2-bad9-b7b93a3e9c5a"));
        vaultProperties1.withSku(new Sku().withName(SkuName.STANDARD));
        //
        //
         Vault vault = keyVaultManager
                 .vaults()
                    .define(VAULT_NAME)
                        .withRegion(Region.US_EAST)
                        .withNewResourceGroup(RG_NAME)
                        .withProperties(vaultProperties1)
                        .create();
        //
        // ===================Create Vault using inner based code-gen=======================
        //
        VaultsInner vaultsInnerClient =  keyVaultManager.vaults().inner();
        //
        VaultCreateOrUpdateParametersInner createOrUpdateParam = new VaultCreateOrUpdateParametersInner();
        //
        createOrUpdateParam.withLocation(Region.US_EAST.toString());
        //
        VaultProperties vaultProperties2 = new VaultProperties();
        vaultProperties2.withAccessPolicies(new ArrayList<AccessPolicyEntry>());
        vaultProperties2.withTenantId(UUID.fromString("54826b22-38d6-4fb2-bad9-b7b93a3e9c5a"));
        vaultProperties2.withSku(new Sku().withName(SkuName.STANDARD));
        //
        createOrUpdateParam.withProperties(vaultProperties2);
        //
        VaultInner innerVault = vaultsInnerClient.createOrUpdate(RG_NAME,
                VAULT_NAME + "1",
                createOrUpdateParam);
    }

    @Test
    @Ignore
    public void canListVault() throws Exception {
        RG_NAME = "";
        // ====================List vaults using interface based code-gen==================
        //
       PagedList<Vault> vaults =  keyVaultManager.vaults().list();
        for(Vault vault : vaults) {
            System.out.println(vault.name());
        }
        //
        // ===================List vaults using inner based code-gen=======================
        //
        VaultsInner vaultsInnerClient =  keyVaultManager.vaults().inner();
        PagedList<VaultInner> innerVaults = vaultsInnerClient.listBySubscription();
        for(VaultInner innerVault : innerVaults) {
            System.out.println(innerVault.name());
        }
    }

    @Test
    @Ignore
    public void canOperateOnDeletedVaults() throws Exception {
        String vaultName = "<an-existing-vault>";

        // ====================Operate on deleted vaults using interface based code-gen==================
        //

        Observable<DeletedVault> deletedVaults1 = keyVaultManager.deletedVaults()
                .listDeletedAsync();

        deletedVaults1.subscribe(new Action1<DeletedVault>() {
            @Override
            public void call(DeletedVault deletedVault) {
                // inspect deleted vaults
            }
        });

        Observable<DeletedVault> deletedVault1 = keyVaultManager.deletedVaults()
                .getDeletedAsync(vaultName, Region.US_EAST.toString());

        deletedVault1.subscribe(new Action1<DeletedVault>() {
            @Override
            public void call(DeletedVault deletedVault) {
                // inspect deleted vault
            }
        });

        keyVaultManager.deletedVaults().purgeDeletedAsync(vaultName, Region.US_EAST.toString()).await();

        // ====================Operate on deleted vaults using inner based code-gen=====================
        //
        VaultsInner vaultsInnerClient =  keyVaultManager.vaults().inner();

        Observable<Page<DeletedVaultInner>> deletedVaults2 = vaultsInnerClient.listDeletedAsync();

        deletedVaults2
        .flatMapIterable(new Func1<Page<DeletedVaultInner>, Iterable<DeletedVaultInner>>() {
            @Override
            public Iterable<DeletedVaultInner> call(Page<DeletedVaultInner> deletedVaultsInnerPage) {
                return deletedVaultsInnerPage.items();
            }
        })
        .subscribe(new Action1<DeletedVaultInner>() {
            @Override
            public void call(DeletedVaultInner vaults) {
                // Process inner deleted vaults
            }
        });

        Observable<DeletedVaultInner> deletedVault2 = vaultsInnerClient.getDeletedAsync(vaultName, Region.US_EAST.toString());

        deletedVault2.subscribe(new Action1<DeletedVaultInner>() {
            @Override
            public void call(DeletedVaultInner deletedVault) {
                // inspect inner deleted vault
            }
        });

        vaultsInnerClient.purgeDeletedAsync(vaultName, Region.US_EAST.toString());

    }

}