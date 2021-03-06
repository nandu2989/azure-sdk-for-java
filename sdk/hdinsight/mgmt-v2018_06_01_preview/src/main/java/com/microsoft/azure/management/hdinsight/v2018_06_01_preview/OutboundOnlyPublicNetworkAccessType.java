/**
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See License.txt in the project root for
 * license information.
 *
 * Code generated by Microsoft (R) AutoRest Code Generator.
 */

package com.microsoft.azure.management.hdinsight.v2018_06_01_preview;

import java.util.Collection;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.microsoft.rest.ExpandableStringEnum;

/**
 * Defines values for OutboundOnlyPublicNetworkAccessType.
 */
public final class OutboundOnlyPublicNetworkAccessType extends ExpandableStringEnum<OutboundOnlyPublicNetworkAccessType> {
    /** Static value PublicLoadBalancer for OutboundOnlyPublicNetworkAccessType. */
    public static final OutboundOnlyPublicNetworkAccessType PUBLIC_LOAD_BALANCER = fromString("PublicLoadBalancer");

    /** Static value UDR for OutboundOnlyPublicNetworkAccessType. */
    public static final OutboundOnlyPublicNetworkAccessType UDR = fromString("UDR");

    /**
     * Creates or finds a OutboundOnlyPublicNetworkAccessType from its string representation.
     * @param name a name to look for
     * @return the corresponding OutboundOnlyPublicNetworkAccessType
     */
    @JsonCreator
    public static OutboundOnlyPublicNetworkAccessType fromString(String name) {
        return fromString(name, OutboundOnlyPublicNetworkAccessType.class);
    }

    /**
     * @return known OutboundOnlyPublicNetworkAccessType values
     */
    public static Collection<OutboundOnlyPublicNetworkAccessType> values() {
        return values(OutboundOnlyPublicNetworkAccessType.class);
    }
}
