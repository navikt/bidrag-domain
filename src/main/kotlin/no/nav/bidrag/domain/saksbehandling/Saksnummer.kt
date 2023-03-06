package no.nav.bidrag.domain.saksbehandling

import no.nav.bidrag.domain.felles.Verdiobjekt

data class Saksnummer(override val verdi: String) : Verdiobjekt<String> {
    override fun gyldig() = verdi.matches(SEVEN_DIGITS_REGEX)

    companion object {
        private val SEVEN_DIGITS_REGEX = Regex("^\\d{7}$")
    }
}
