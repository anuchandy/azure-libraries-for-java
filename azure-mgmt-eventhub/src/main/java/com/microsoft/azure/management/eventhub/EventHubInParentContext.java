package com.microsoft.azure.management.eventhub;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;
import com.microsoft.azure.management.storage.StorageAccount;

/**
 * Type representing an Azure EventHub in the context of parent namespace.
 */
@Fluent
@Beta(Beta.SinceVersion.V2_0_0)
public interface EventHubInParentContext extends EventHub {
    /**
     * The entirety of the event hub definition.
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface Definition extends
            DefinitionStages.Blank,
            DefinitionStages.WithCaptureProviderOrCreate,
            DefinitionStages.WithCaptureEnabledDisabled,
            DefinitionStages.WithCaptureOptionalSettingsOrCreate,
            DefinitionStages.WithCreate {
    }

    /**
     * Grouping of event hub definition stages.
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface DefinitionStages {
        /**
         * The first stage of a event hub definition.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface Blank extends WithCaptureProviderOrCreate {
        }

        /**
         * The stage of the event hub definition allowing to specify provider to store captured data when data capturing is enabled.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithCaptureProviderOrCreate extends WithCreate {
            /**
             * Specifies a new storage account to store the captured data when data capturing is enabled.
             *
             * @param storageAccountCreatable creatable storage account definition
             * @param containerName container to store the files containing captured data
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureEnabledDisabled withNewStorageAccountForCapturedData(Creatable<StorageAccount> storageAccountCreatable, String containerName);
            /**
             * Specifies an existing storage account to store the captured data when data capturing is enabled.
             *
             * @param storageAccount storage account
             * @param containerName an existing or new container to store the files containing captured data
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureEnabledDisabled withExistingStorageAccountForCapturedData(StorageAccount storageAccount, String containerName);
            /**
             * Specifies an existing storage account to store the captured data when data capturing is enabled.
             *
             * @param storageAccountId storage account arm id
             * @param containerName an existing or new container to store the files containing captured data
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureEnabledDisabled withExistingStorageAccountForCapturedData(String storageAccountId, String containerName);
        }

        /**
         * The stage of the event hub definition allowing to enable or disable data capturing.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithCaptureEnabledDisabled {
            /**
             * Specifies that data capture should be enabled for the event hub.
             *
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureOptionalSettingsOrCreate withDataCaptureEnabled();

            /**
             * Specifies that data capture should be disabled for the event hub.
             *
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureOptionalSettingsOrCreate withDataCaptureDisabled();
        }

        /**
         * The stage of the event hub definition allowing to configure data capturing.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithCaptureOptionalSettingsOrCreate extends WithCreate {
            /**
             * Specifies the capture window size in seconds.
             *
             * @param sizeInSeconds window size in seconds
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureOptionalSettingsOrCreate withDataCaptureWindowSizeInSeconds(int sizeInSeconds);
            /**
             * Specifies the capture window size in MB.
             *
             * @param sizeInMB window size in MB
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureOptionalSettingsOrCreate withDataCaptureWindowSizeInMB(int sizeInMB);
            /**
             * Specifies file name format containing captured data.
             *
             * @param format the file name format
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCaptureOptionalSettingsOrCreate withDataCaptureFileNameFormat(String format);
        }

        /**
         * The stage of the event hub definition allowing to add authorization rule for accessing
         * the event hub.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithAuthorizationRule {
            /**
             * Specifies that a new authorization rule should be created that has send access to the event hub.
             *
             * @param ruleName rule name
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCreate withNewSendRule(String ruleName);
            /**
             * Specifies that a new authorization rule should be created that has listen access to the event hub.
             *
             * @param ruleName rule name
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCreate withNewListenRule(String ruleName);
            /**
             * Specifies that a new authorization rule should be created that has manage access to the event hub.
             *
             * @param ruleName rule name
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCreate withNewManageRule(String ruleName);
        }

        /**
         * The stage of the event hub definition allowing to add consumer group for the event hub.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface  WithConsumerGroup {
            /**
             * Specifies that a new consumer group should be created for the event hub.
             *
             * @param name consumer group name
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCreate withNewConsumerGroup(String name);

            /**
             * Specifies that a new consumer group should be created for the event hub.
             *
             * @param name consumer group name
             * @param metadata consumer group metadata
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCreate withNewConsumerGroup(String name, String metadata);
        }

        /**
         * The stage of the event hub definition allowing to specify partition count for event hub.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithPartitionCount {
            /**
             * Specifies the number of partitions in the event hub.
             *
             * @param count partitions count
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCreate withPartitionCount(long count);
        }

        /**
         *  The stage of the event hub definition allowing to specify retention period for event hub events.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithRetentionPeriod {
            /**
             * Specifies the retention period for events in days.
             *
             * @param period retention period
             * @return next stage of the event hub definition
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            WithCreate withRetentionPeriodInDays(long period);
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithCreate extends
                Creatable<EventHub>,
                DefinitionStages.WithAuthorizationRule,
                DefinitionStages.WithConsumerGroup,
                DefinitionStages.WithPartitionCount,
                DefinitionStages.WithRetentionPeriod {
        }
    }

    /**
     * Grouping of event hub update stages.
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface UpdateStages {
        /**
         * The stage of the event hub definition allowing to add an authorization rule for accessing
         * the event hub.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithAuthorizationRule {
            /**
             * Specifies that a new authorization rule should be created that has send access to the event hub.
             *
             * @param name rule name
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withNewSendRule(String name);
            /**
             * Specifies that a new authorization rule should be created that has listen access to the event hub.
             *
             * @param name rule name
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withNewListenRule(String name);
            /**
             * Specifies that a new authorization rule should be created that has manage access to the event hub.
             *
             * @param name rule name
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withNewManageRule(String name);
            /**
             * Specifies that an authorization rule associated with the event hub should be deleted.
             *
             * @param ruleName rule name
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withoutAuthorizationRule(String ruleName);
        }

        /**
         * The stage of the event hub update allowing to add consumer group for event hub.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface  WithConsumerGroup {
            /**
             * Specifies that a new consumer group should be created for the event hub.
             *
             * @param name group name
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withNewConsumerGroup(String name);
            /**
             * Specifies that a new consumer group should be created for the event hub.
             *
             * @param name group name
             * @param metadata group metadata
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withNewConsumerGroup(String name, String metadata);
            /**
             * Specifies that a consumer group associated with the event hub should be deleted.
             *
             * @param name group name
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withoutConsumerGroup(String name);
        }

        /**
         * The stage of the event hub update allowing to configure data capture.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithCapture {
            /**
             * Specifies a new storage account to store the captured data when data capturing is enabled.
             *
             * @param storageAccountCreatable creatable storage account definition
             * @param containerName container to store the files containing captured data
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withNewStorageAccountForCapturedData(Creatable<StorageAccount> storageAccountCreatable, String containerName);
            /**
             * Specifies an existing storage account to store the captured data when data capturing is enabled.
             *
             * @param storageAccount storage account
             * @param containerName an existing or new container to store the files containing captured data
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withExistingStorageAccountForCapturedData(StorageAccount storageAccount, String containerName);
            /**
             * Specifies an existing storage account to store the captured data when data capturing is enabled.
             *
             * @param storageAccountId storage account arm id
             * @param containerName an existing or new container to store the files containing captured data
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withExistingStorageAccountForCapturedData(String storageAccountId, String containerName);
            /**
             * Specifies that data capture should be enabled for the event hub.
             *
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withDataCaptureEnabled();
            /**
             * Specifies that data capture should be disabled for the event hub.
             *
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withDataCaptureDisabled();
            /**
             * Specifies the capture window size in seconds.
             *
             * @param sizeInSeconds window size in seconds
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withDataCaptureWindowSizeInSeconds(int sizeInSeconds);
            /**
             * Specifies the capture window size in MB.
             *
             * @param sizeInMB window size in MB
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withDataCaptureWindowSizeInMB(int sizeInMB);
            /**
             * Specifies the format of the file containing captured data.
             *
             * @param format the file name format
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withDataCaptureFileNameFormat(String format);
        }

        /**
         * The stage of the event hub update allowing to specify partition count for event hub.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithPartitionCount {
            /**
             * Specifies the number of partitions in the event hub.
             *
             * @param count partitions count
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withPartitionCount(long count);
        }

        /**
         *  The stage of the event hub definition allowing to specify retention period for event hub events.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithRetentionPeriod {
            /**
             * Specifies the retention period for events in days.
             *
             * @param period retention period
             * @return next stage of the event hub update
             */
            @Beta(Beta.SinceVersion.V1_7_0)
            Update withRetentionPeriodInDays(long period);
        }
    }

    /**
     * The template for a event hub update operation, containing all the settings that can be modified.
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface Update extends
            Appliable<EventHub>,
            UpdateStages.WithConsumerGroup,
            UpdateStages.WithAuthorizationRule,
            UpdateStages.WithCapture,
            UpdateStages.WithPartitionCount,
            UpdateStages.WithRetentionPeriod {
    }
}
