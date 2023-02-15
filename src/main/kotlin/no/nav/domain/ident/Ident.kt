package no.nav.domain.ident

import no.nav.domain.felles.Verdiobjekt

data class Ident(override val verdi: String) : Verdiobjekt<String> {

    override fun gyldig(): Boolean {
        return Organisasjonsnummer(verdi).gyldig() ||
            PersonIdent(verdi).gyldig() ||
            SamhandlerId(verdi).gyldig()
    }

    fun erOrganisasjonsnummer() = Organisasjonsnummer(verdi).gyldig()

    fun erPersonIdent() = PersonIdent(verdi).gyldig()

    fun erSamhandlerId() = SamhandlerId(verdi).gyldig()

    fun type() =
        when {
            Organisasjonsnummer(verdi).gyldig() -> Identtype.Organisasjonsnummer
            PersonIdent(verdi).gyldig() -> Identtype.PersonIdent
            SamhandlerId(verdi).gyldig() -> Identtype.SamhandlerId
            else -> Identtype.Ukjent
        }
}

enum class Identtype {
    PersonIdent, // Fødselsnummer, D-nummer, Nav-syntetisk, Skatt-syntetisk
    Organisasjonsnummer,
    SamhandlerId,
    Ukjent
}
