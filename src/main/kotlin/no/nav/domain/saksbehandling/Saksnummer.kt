package no.nav.domain.saksbehandling

import no.nav.domain.felles.Verdiobjekt

class Saksnummer(override val verdi: String) : Verdiobjekt<String> {

    init {
        require(verdi.matches(SEVEN_DIGITS_REGEX)) { "$verdi tilfredstiller ikke kravet til et gyldig saksnummer" }
    }

    companion object {
        private val SEVEN_DIGITS_REGEX = Regex("^\\d{7}$")
    }
}
