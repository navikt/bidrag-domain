package no.nav.domain.saksbehandling

enum class Rolletype(val beskrivelse: String) {
  BA("Barn"),
  BM("Bidragsmottaker"),
  BP("Bidragspliktig"),
  FR("Feilregistrert"),
  RM("ReellMottaker");

}
