@file:Suppress("unused")

package no.nav.bidrag.domain.enums

import com.fasterxml.jackson.annotation.JsonAlias
import com.fasterxml.jackson.annotation.JsonProperty

enum class Rolletype(val beskrivelse: String) {
    @Deprecated("Bruk BARN istedenfor", replaceWith = ReplaceWith("BARN"))
    BA("Barn"),

    @Deprecated("Bruk BIDRAGSMOTTAKER istedenfor", replaceWith = ReplaceWith("BIDRAGSMOTTAKER"))
    BM("Bidragsmottaker"),

    @Deprecated("Bruk BIDRAGSPLIKTIG istedenfor", replaceWith = ReplaceWith("BIDRAGSPLIKTIG"))
    BP("Bidragspliktig"),

    @Deprecated("Bruk FEILREGISTRERT istedenfor", replaceWith = ReplaceWith("FEILREGISTRERT"))
    FR("Feilregistrert"),

    @Deprecated("Bruk REELMOTTAKER istedenfor", replaceWith = ReplaceWith("REELMOTTAKER"))
    RM("ReellMottaker"),

    @JsonProperty("BA", access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias("BARN")
    BARN("Barn"),

    @JsonProperty("BM", access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias("BIDRAGSMOTTAKER")
    BIDRAGSMOTTAKER("Bidragsmottaker"),

    @JsonProperty("BP", access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias("BIDRAGSPLIKTIG")
    BIDRAGSPLIKTIG("Bidragspliktig"),

    @JsonProperty("FR", access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias("FEILREGISTRERT")
    FEILREGISTRERT("Feilregistrert"),

    @JsonProperty("RM", access = JsonProperty.Access.WRITE_ONLY)
    @JsonAlias("REELMOTTAKER")
    REELMOTTAKER("Reellmottaker");
}
