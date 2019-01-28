package com.microsoft.azure.management.batch.usage;

import com.microsoft.azure.AzureEnvironment;
import com.microsoft.azure.credentials.ApplicationTokenCredentials;
import com.microsoft.azure.credentials.AzureTokenCredentials;
import com.microsoft.azure.management.batch.v2017_09_01.AutoStorageBaseProperties;
import com.microsoft.azure.management.resources.ResourceGroup;
import com.microsoft.azure.management.resources.implementation.ResourceManager;
import com.microsoft.azure.management.storage.StorageAccount;
import com.microsoft.azure.management.storage.implementation.StorageManager;
import com.microsoft.rest.LogLevel;

public final class ManageBatchAccount {

    public static void main(String[] args) {
        // Authenticate
        AzureTokenCredentials credentials = new ApplicationTokenCredentials("<client-d>", "<tenant-id>", "<secret-key>", AzureEnvironment.AZURE)
                .withDefaultSubscriptionId("<subscriptionid>");
        // Fluent Batch manager
        //
        com.microsoft.azure.management.batch.implementation.BatchManager fluentBatchManager = com.microsoft.azure.management.batch.implementation.BatchManager
                .authenticate(credentials, credentials.defaultSubscriptionId());
        // Autogen Batch Manager
        //
        com.microsoft.azure.management.batch.v2017_09_01.implementation.BatchManager autogenBatchManager = com.microsoft.azure.management.batch.v2017_09_01.implementation.BatchManager
                .authenticate(credentials, credentials.defaultSubscriptionId());
        //
        // Create a resource Group
        ResourceGroup resourceGroup = createResourcerGroup("batch-rg-123", credentials);
        // Create a storage Account
        StorageAccount storageAccount = createStorageAccount("batch-stg_123", resourceGroup, credentials);
        // Create a batch account using Fluent Batch Manager
        //
        //
        com.microsoft.azure.management.batch.BatchAccount fluentBatchAccount = fluentBatchManager.batchAccounts()
                .define("fluent-batch")
                .withRegion("East US")
                .withExistingResourceGroup(resourceGroup.name())
                .withExistingStorageAccount(storageAccount)
                .create();
        // Create a batch account using Autogen Batch Manager
        //
        com.microsoft.azure.management.batch.v2017_09_01.BatchAccount autogenBatchAccount = autogenBatchManager.batchAccounts()
                .define("autogen-batch")
                .withRegion("East US")
                .withExistingResourceGroup(resourceGroup.name())
                .withAutoStorage(new AutoStorageBaseProperties().withStorageAccountId(storageAccount.id()))
                .create();
    }

    private static ResourceGroup createResourcerGroup(String name, AzureTokenCredentials credentials) {
        ResourceManager resourceManager = ResourceManager.configure()
                .withLogLevel(LogLevel.BASIC)
                .authenticate(credentials)
                .withSubscription(credentials.defaultSubscriptionId());
        return resourceManager.resourceGroups().define(name)
                .withRegion("East US")
                .create();
    }

    private static StorageAccount createStorageAccount(String name, ResourceGroup resourceGroup, AzureTokenCredentials credentials) {
        StorageManager storageManager = createStorageManager(credentials);
        return storageManager.storageAccounts().define(name)
                .withRegion("East US")
                .withExistingResourceGroup(resourceGroup.name())
                .create();
    }

    private static ResourceManager createResourceManager(AzureTokenCredentials credentials) {
        ResourceManager resourceManager = ResourceManager.configure()
                .withLogLevel(LogLevel.BASIC)
                .authenticate(credentials)
                .withSubscription(credentials.defaultSubscriptionId());
        return resourceManager;
    }

    private static StorageManager createStorageManager(AzureTokenCredentials credentials) {
        StorageManager storageManager = StorageManager.configure()
                .withLogLevel(LogLevel.BASIC)
                .authenticate(credentials, credentials.defaultSubscriptionId());
        return storageManager;
    }

    private ManageBatchAccount() {
    }
}