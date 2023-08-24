@file:Suppress("unused")

package no.nav.bidrag.domain.enums

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty

enum class Rolletype(val beskrivelse: String) {
    @JsonProperty("BA")
    @JsonAlias("BARN")
    BARN("Barn"),

    @JsonProperty("BM")
    @JsonAlias("BIDRAGSMOTTAKER")
    BIDRAGSMOTTAKER("Bidragsmottaker"),

    @JsonProperty("BP")
    @JsonAlias("BIDRAGSPLIKTIG")
    BIDRAGSPLIKTIG("Bidragspliktig"),

    @JsonProperty("FR")
    @JsonAlias("FEILREGISTRERT")
    FEILREGISTRERT("Feilregistrert"),

    @JsonProperty("RM")
    @JsonAlias("REELMOTTAKER")
    REELMOTTAKER("Reellmottaker");
}
