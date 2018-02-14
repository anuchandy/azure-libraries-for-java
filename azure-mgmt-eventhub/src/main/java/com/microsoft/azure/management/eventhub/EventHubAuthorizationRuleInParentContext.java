package com.microsoft.azure.management.eventhub;

import com.microsoft.azure.management.apigeneration.Beta;
import com.microsoft.azure.management.apigeneration.Fluent;
import com.microsoft.azure.management.resources.fluentcore.model.Appliable;
import com.microsoft.azure.management.resources.fluentcore.model.Creatable;

/**
 * Type representing authorization rule of an event hub (in parent event hub context).
 */
@Fluent
@Beta(Beta.SinceVersion.V2_0_0)
public interface EventHubAuthorizationRuleInParentContext
        extends
        EventHubAuthorizationRule {
    /**
     * Grouping of event hub authorization rule definition stages.
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface DefinitionStages {
        /**
         * The first stage of event hub authorization rule definition.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface Blank extends AuthorizationRule
                .DefinitionStages
                .WithListenOrSendOrManage<WithCreate> {
        }

        /**
         * The stage of the definition which contains all the minimum required inputs for
         * the resource to be created (via {@link WithCreate#create()}), but also allows
         * for any other optional settings to be specified.
         */
        @Beta(Beta.SinceVersion.V1_7_0)
        interface WithCreate extends Creatable<EventHubAuthorizationRule> {
        }
    }

    /**
     * The entirety of the event hub namespace authorization rule definition.
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface Definition extends
            DefinitionStages.Blank,
            DefinitionStages.WithCreate {
    }

    /**
     * The entirety of the event hub authorization rule update.
     */
    @Beta(Beta.SinceVersion.V1_7_0)
    interface Update extends
            Appliable<EventHubAuthorizationRule>,
            UpdateStages.WithListenOrSendOrManage<EventHubAuthorizationRule.Update> {
    }
}
