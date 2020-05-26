// Copyright (c) Microsoft Corporation. All rights reserved.
// Licensed under the MIT License.

package com.azure.search.documents.models;

import com.azure.core.util.ExpandableStringEnum;
import com.fasterxml.jackson.annotation.JsonCreator;
import java.util.Collection;

/**
 * Defines values for TextTranslationSkillLanguage.
 */
public final class TextTranslationSkillLanguage extends ExpandableStringEnum<TextTranslationSkillLanguage> {
    /**
     * Static value af for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage AF = fromString("af");

    /**
     * Static value ar for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage AR = fromString("ar");

    /**
     * Static value bn for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage BN = fromString("bn");

    /**
     * Static value bs for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage BS = fromString("bs");

    /**
     * Static value bg for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage BG = fromString("bg");

    /**
     * Static value yue for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage YUE = fromString("yue");

    /**
     * Static value ca for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage CA = fromString("ca");

    /**
     * Static value zh-Hans for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage ZH_HANS = fromString("zh-Hans");

    /**
     * Static value zh-Hant for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage ZH_HANT = fromString("zh-Hant");

    /**
     * Static value hr for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage HR = fromString("hr");

    /**
     * Static value cs for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage CS = fromString("cs");

    /**
     * Static value da for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage DA = fromString("da");

    /**
     * Static value nl for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage NL = fromString("nl");

    /**
     * Static value en for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage EN = fromString("en");

    /**
     * Static value et for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage ET = fromString("et");

    /**
     * Static value fj for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage FJ = fromString("fj");

    /**
     * Static value fil for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage FIL = fromString("fil");

    /**
     * Static value fi for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage FI = fromString("fi");

    /**
     * Static value fr for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage FR = fromString("fr");

    /**
     * Static value de for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage DE = fromString("de");

    /**
     * Static value el for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage EL = fromString("el");

    /**
     * Static value ht for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage HT = fromString("ht");

    /**
     * Static value he for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage HE = fromString("he");

    /**
     * Static value hi for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage HI = fromString("hi");

    /**
     * Static value mww for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage MWW = fromString("mww");

    /**
     * Static value hu for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage HU = fromString("hu");

    /**
     * Static value is for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage IS = fromString("is");

    /**
     * Static value id for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage ID = fromString("id");

    /**
     * Static value it for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage IT = fromString("it");

    /**
     * Static value ja for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage JA = fromString("ja");

    /**
     * Static value sw for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage SW = fromString("sw");

    /**
     * Static value tlh for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage TLH = fromString("tlh");

    /**
     * Static value ko for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage KO = fromString("ko");

    /**
     * Static value lv for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage LV = fromString("lv");

    /**
     * Static value lt for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage LT = fromString("lt");

    /**
     * Static value mg for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage MG = fromString("mg");

    /**
     * Static value ms for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage MS = fromString("ms");

    /**
     * Static value mt for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage MT = fromString("mt");

    /**
     * Static value nb for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage NB = fromString("nb");

    /**
     * Static value fa for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage FA = fromString("fa");

    /**
     * Static value pl for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage PL = fromString("pl");

    /**
     * Static value pt for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage PT = fromString("pt");

    /**
     * Static value otq for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage OTQ = fromString("otq");

    /**
     * Static value ro for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage RO = fromString("ro");

    /**
     * Static value ru for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage RU = fromString("ru");

    /**
     * Static value sm for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage SM = fromString("sm");

    /**
     * Static value sr-Cyrl for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage SR_CYRL = fromString("sr-Cyrl");

    /**
     * Static value sr-Latn for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage SR_LATN = fromString("sr-Latn");

    /**
     * Static value sk for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage SK = fromString("sk");

    /**
     * Static value sl for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage SL = fromString("sl");

    /**
     * Static value es for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage ES = fromString("es");

    /**
     * Static value sv for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage SV = fromString("sv");

    /**
     * Static value ty for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage TY = fromString("ty");

    /**
     * Static value ta for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage TA = fromString("ta");

    /**
     * Static value te for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage TE = fromString("te");

    /**
     * Static value th for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage TH = fromString("th");

    /**
     * Static value to for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage TO = fromString("to");

    /**
     * Static value tr for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage TR = fromString("tr");

    /**
     * Static value uk for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage UK = fromString("uk");

    /**
     * Static value ur for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage UR = fromString("ur");

    /**
     * Static value vi for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage VI = fromString("vi");

    /**
     * Static value cy for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage CY = fromString("cy");

    /**
     * Static value yua for TextTranslationSkillLanguage.
     */
    public static final TextTranslationSkillLanguage YUA = fromString("yua");

    /**
     * Creates or finds a TextTranslationSkillLanguage from its string representation.
     *
     * @param name a name to look for.
     * @return the corresponding TextTranslationSkillLanguage.
     */
    @JsonCreator
    public static TextTranslationSkillLanguage fromString(String name) {
        return fromString(name, TextTranslationSkillLanguage.class);
    }

    /**
     * @return known TextTranslationSkillLanguage values.
     */
    public static Collection<TextTranslationSkillLanguage> values() {
        return values(TextTranslationSkillLanguage.class);
    }
}
