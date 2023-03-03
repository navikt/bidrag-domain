package no.nav.domain.saksbehandling;

enum class Arbeidsfordeling(
  private val beskrivelse: String,
  val gyldig: Boolean,
  val behandlingstema: String?
) {

  BBF("Barnebortføring", true, "ab0323"),
  EEN("Eierenhet", true, null),
  EFS("Ektefellesak", true, "ab0325"),
  FRS("Farskap", true, "ab0322"),
  INH("Settekontor", true, null),
  OPS("Oppfostringssak", true, "ab0324")

}
