package no.nav.domain.ident

import no.nav.domain.felles.Verdiobjekt

data class SamhandlerId(override val verdi: String) : Verdiobjekt<String> {

    init {
        require(verdi.matches(SAMHANDLER_ID_REGEX)) { "$verdi tilfredstiller ikke kravet til en gyldig samahandlerId" }
    }

    companion object {
        private val SAMHANDLER_ID_REGEX = Regex("^[89]\\d{10}$")
    }
}
