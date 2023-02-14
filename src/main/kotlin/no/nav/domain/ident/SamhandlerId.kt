package no.nav.domain.ident

import no.nav.domain.felles.Verdiobjekt

data class SamhandlerId(override val verdi: String) : Verdiobjekt<String> {

    override fun gyldig(): Boolean {
        return verdi.matches(SAMHANDLER_ID_REGEX)
    }

    companion object {
        private val SAMHANDLER_ID_REGEX = Regex("^[89]\\d{10}$")
    }
}
