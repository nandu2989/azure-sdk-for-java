// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.annotation.Fluent;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonTypeInfo;
import com.fasterxml.jackson.annotation.JsonTypeName;

/**
 * Language specific stemming filter. This token filter is implemented using
 * Apache Lucene.
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.PROPERTY, property = "@odata.type")
@JsonTypeName("#Microsoft.Azure.Search.StemmerTokenFilter")
@Fluent
public final class StemmerTokenFilter extends TokenFilter {
    /*
     * The language to use. Possible values include: 'Arabic', 'Armenian',
     * 'Basque', 'Brazilian', 'Bulgarian', 'Catalan', 'Czech', 'Danish',
     * 'Dutch', 'DutchKp', 'English', 'LightEnglish', 'MinimalEnglish',
     * 'PossessiveEnglish', 'Porter2', 'Lovins', 'Finnish', 'LightFinnish',
     * 'French', 'LightFrench', 'MinimalFrench', 'Galician', 'MinimalGalician',
     * 'German', 'German2', 'LightGerman', 'MinimalGerman', 'Greek', 'Hindi',
     * 'Hungarian', 'LightHungarian', 'Indonesian', 'Irish', 'Italian',
     * 'LightItalian', 'Sorani', 'Latvian', 'Norwegian', 'LightNorwegian',
     * 'MinimalNorwegian', 'LightNynorsk', 'MinimalNynorsk', 'Portuguese',
     * 'LightPortuguese', 'MinimalPortuguese', 'PortugueseRslp', 'Romanian',
     * 'Russian', 'LightRussian', 'Spanish', 'LightSpanish', 'Swedish',
     * 'LightSwedish', 'Turkish'
     */
    @JsonProperty(value = "language", required = true)
    private StemmerTokenFilterLanguage language;

    /**
     * Get the language property: The language to use. Possible values include:
     * 'Arabic', 'Armenian', 'Basque', 'Brazilian', 'Bulgarian', 'Catalan',
     * 'Czech', 'Danish', 'Dutch', 'DutchKp', 'English', 'LightEnglish',
     * 'MinimalEnglish', 'PossessiveEnglish', 'Porter2', 'Lovins', 'Finnish',
     * 'LightFinnish', 'French', 'LightFrench', 'MinimalFrench', 'Galician',
     * 'MinimalGalician', 'German', 'German2', 'LightGerman', 'MinimalGerman',
     * 'Greek', 'Hindi', 'Hungarian', 'LightHungarian', 'Indonesian', 'Irish',
     * 'Italian', 'LightItalian', 'Sorani', 'Latvian', 'Norwegian',
     * 'LightNorwegian', 'MinimalNorwegian', 'LightNynorsk', 'MinimalNynorsk',
     * 'Portuguese', 'LightPortuguese', 'MinimalPortuguese', 'PortugueseRslp',
     * 'Romanian', 'Russian', 'LightRussian', 'Spanish', 'LightSpanish',
     * 'Swedish', 'LightSwedish', 'Turkish'.
     *
     * @return the language value.
     */
    public StemmerTokenFilterLanguage getLanguage() {
        return this.language;
    }

    /**
     * Set the language property: The language to use. Possible values include:
     * 'Arabic', 'Armenian', 'Basque', 'Brazilian', 'Bulgarian', 'Catalan',
     * 'Czech', 'Danish', 'Dutch', 'DutchKp', 'English', 'LightEnglish',
     * 'MinimalEnglish', 'PossessiveEnglish', 'Porter2', 'Lovins', 'Finnish',
     * 'LightFinnish', 'French', 'LightFrench', 'MinimalFrench', 'Galician',
     * 'MinimalGalician', 'German', 'German2', 'LightGerman', 'MinimalGerman',
     * 'Greek', 'Hindi', 'Hungarian', 'LightHungarian', 'Indonesian', 'Irish',
     * 'Italian', 'LightItalian', 'Sorani', 'Latvian', 'Norwegian',
     * 'LightNorwegian', 'MinimalNorwegian', 'LightNynorsk', 'MinimalNynorsk',
     * 'Portuguese', 'LightPortuguese', 'MinimalPortuguese', 'PortugueseRslp',
     * 'Romanian', 'Russian', 'LightRussian', 'Spanish', 'LightSpanish',
     * 'Swedish', 'LightSwedish', 'Turkish'.
     *
     * @param language the language value to set.
     * @return the StemmerTokenFilter object itself.
     */
    public StemmerTokenFilter setLanguage(StemmerTokenFilterLanguage language) {
        this.language = language;
        return this;
    }
}
