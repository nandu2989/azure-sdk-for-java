// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.
package com.azure.search.documents.test.environment.models;

import com.azure.search.documents.indexes.SearchableFieldProperty;
import com.azure.search.documents.indexes.SimpleFieldProperty;
import com.fasterxml.jackson.annotation.JsonProperty;

public class HotelAddress {
    @SimpleFieldProperty(isFacetable = true)
    @JsonProperty(value = "StreetAddress")
    private String streetAddress;

    @SearchableFieldProperty(isFilterable = true)
    @JsonProperty(value = "City")
    private String city;

    @SearchableFieldProperty
    @JsonProperty(value = "StateProvince")
    private String stateProvince;

    @SearchableFieldProperty(synonymMapNames = {"fieldbuilder"})
    @JsonProperty(value = "Country")
    private String country;

    @SimpleFieldProperty
    @JsonProperty(value = "PostalCode")
    private String postalCode;


    public String streetAddress() {
        return this.streetAddress;
    }

    public HotelAddress streetAddress(String streetAddress) {
        this.streetAddress = streetAddress;
        return this;
    }

    public String city() {
        return this.city;
    }

    public HotelAddress city(String city) {
        this.city = city;
        return this;
    }

    public String stateProvince() {
        return this.stateProvince;
    }

    public HotelAddress stateProvince(String stateProvince) {
        this.stateProvince = stateProvince;
        return this;
    }

    public String country() {
        return this.country;
    }

    public HotelAddress country(String country) {
        this.country = country;
        return this;
    }

    public String postalCode() {
        return this.postalCode;
    }

    public HotelAddress postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
}
