package no.nav.domain.saksbehandling;

enum class Bidragssakstatus(val beskrivelse: String, val gyldig: Boolean) {
  AK("Aktiv", true),
  IN("Inaktiv", true),
  NY("Journalsak", true),
  SA("Sanert", true),
  SO("Åpensøknad", true)
}
