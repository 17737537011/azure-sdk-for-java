/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.monitor.v2018_09_01;

import com.microsoft.azure.arm.model.HasInner;
import com.microsoft.azure.arm.resources.models.HasManager;
import com.microsoft.azure.management.monitor.v2018_09_01.implementation.MonitorManager;
import com.microsoft.azure.management.monitor.v2018_09_01.implementation.BaselineResponseInner;
import com.microsoft.azure.management.monitor.v2018_09_01.implementation.BaselineInner;
import java.util.List;
import org.joda.time.Period;
import org.joda.time.DateTime;

/**
 * Type representing BaselineResponse.
 */
public interface BaselineResponse extends HasInner<BaselineResponseInner>, HasManager<MonitorManager> {
    /**
     * @return the aggregation value.
     */
    String aggregation();

    /**
     * @return the baseline value.
     */
    List<BaselineInner> baseline();

    /**
     * @return the id value.
     */
    String id();

    /**
     * @return the interval value.
     */
    Period interval();

    /**
     * @return the metadata value.
     */
    List<BaselineMetadataValue> metadata();

    /**
     * @return the name value.
     */
    LocalizableString name();

    /**
     * @return the timespan value.
     */
    String timespan();

    /**
     * @return the timestamps value.
     */
    List<DateTime> timestamps();

    /**
     * @return the type value.
     */
    String type();

}