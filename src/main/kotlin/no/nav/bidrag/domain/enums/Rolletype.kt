package no.nav.bidrag.domain.enums

enum class Rolletype(val beskrivelse: String) {
    BA("Barn"),
    BM("Bidragsmottaker"),
    BP("Bidragspliktig"),
    FR("Feilregistrert"),
    RM("ReellMottaker");
}
