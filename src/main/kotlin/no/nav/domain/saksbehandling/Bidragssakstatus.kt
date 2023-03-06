package no.nav.domain.saksbehandling

enum class Bidragssakstatus(val beskrivelse: String) {
    AK("Aktiv"),
    IN("Inaktiv"),
    NY("Journalsak"),
    SA("Sanert"),
    SO("Åpensøknad")
}
