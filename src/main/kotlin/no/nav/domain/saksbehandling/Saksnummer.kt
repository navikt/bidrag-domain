package no.nav.domain.saksbehandling

class Saksnummer(val verdi: String) {

    init {
        require(verdi.matches(SEVEN_DIGITS_REGEX)) { "$verdi tilfredstiller ikke kravet til et gyldig saksnummer" }
    }

    companion object {
        private val SEVEN_DIGITS_REGEX = Regex("^\\d{7}$")
    }
}
