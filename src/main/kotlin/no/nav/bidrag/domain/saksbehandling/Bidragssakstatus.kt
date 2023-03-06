package no.nav.bidrag.domain.saksbehandling

enum class Bidragssakstatus(val beskrivelse: String) {
    AK("Aktiv"),
    IN("Inaktiv"),
    NY("Journalsak"),
    SA("Sanert"),
    SO("Åpensøknad")
}
