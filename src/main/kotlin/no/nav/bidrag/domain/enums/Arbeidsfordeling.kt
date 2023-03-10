package no.nav.bidrag.domain.enums

enum class Arbeidsfordeling(
    private val beskrivelse: String,
    val behandlingstema: String?
) {

    BBF("Barnebortføring", "ab0323"),
    EEN("Eierenhet", null),
    EFS("Ektefellesak", "ab0325"),
    FRS("Farskap", "ab0322"),
    INH("Settekontor", null),
    OPS("Oppfostringssak", "ab0324")
}
