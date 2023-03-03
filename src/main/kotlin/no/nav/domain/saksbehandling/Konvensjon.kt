package no.nav.domain.saksbehandling;

enum class Konvensjon(private val beskrivelse: String, val gyldig: Boolean) {
  AiS("Annet - iSupport", true),
  HiS("Haag 2007 - iSupport", true),
  H5("Haag", true),
  L("Lugano", true),
  NI("Nordisk innkreving", true),
  NY("New York", true),
  US("USA-avtalen", true),
  H73("Haag 1973", true),
  INGEN("Ingen", true);

  override fun toString(): String {
    return beskrivelse
  }
}
