/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.appservice;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Application logs to Azure table storage configuration.
 */
public class AzureTableStorageApplicationLogsConfig {
    /**
     * Log level. Possible values include: 'Off', 'Verbose', 'Information',
     * 'Warning', 'Error'.
     */
    @JsonProperty(value = "level")
    private LogLevel level;

    /**
     * SAS URL to an Azure table with add/query/delete permissions.
     */
    @JsonProperty(value = "sasUrl", required = true)
    private String sasUrl;

    /**
     * Get log level. Possible values include: 'Off', 'Verbose', 'Information', 'Warning', 'Error'.
     *
     * @return the level value
     */
    public LogLevel level() {
        return this.level;
    }

    /**
     * Set log level. Possible values include: 'Off', 'Verbose', 'Information', 'Warning', 'Error'.
     *
     * @param level the level value to set
     * @return the AzureTableStorageApplicationLogsConfig object itself.
     */
    public AzureTableStorageApplicationLogsConfig withLevel(LogLevel level) {
        this.level = level;
        return this;
    }

    /**
     * Get sAS URL to an Azure table with add/query/delete permissions.
     *
     * @return the sasUrl value
     */
    public String sasUrl() {
        return this.sasUrl;
    }

    /**
     * Set sAS URL to an Azure table with add/query/delete permissions.
     *
     * @param sasUrl the sasUrl value to set
     * @return the AzureTableStorageApplicationLogsConfig object itself.
     */
    public AzureTableStorageApplicationLogsConfig withSasUrl(String sasUrl) {
        this.sasUrl = sasUrl;
        return this;
    }

}
