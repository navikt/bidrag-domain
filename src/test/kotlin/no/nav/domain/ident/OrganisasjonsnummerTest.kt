package no.nav.domain.ident

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import org.junit.jupiter.api.Test

class OrganisasjonsnummerTest {

    @Test
    fun `organisasjonsnummer kaster feil ved lengder ulik 9`() {
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("9") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("98") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("987") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("9876") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("98765") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("987654") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("9876543") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("98765432") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("9876543210") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("98765432109") }
    }

    @Test
    fun `organisasjonsnummer kaster feil ved feilet modulo 11-sjekk`() {
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("826506932") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("913067386") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("925603320") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("926354751") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("927393373") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("922124212") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("925817926") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("930489103") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("928807449") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("924846123") }
        shouldThrow<IllegalArgumentException> { Organisasjonsnummer("924345460") }
    }

    @Test
    fun `organisasjonsnummer godtar gyldige verdier`() {
        shouldNotThrow<Exception> { Organisasjonsnummer("826606932") }
        shouldNotThrow<Exception> { Organisasjonsnummer("913068386") }
        shouldNotThrow<Exception> { Organisasjonsnummer("921603320") }
        shouldNotThrow<Exception> { Organisasjonsnummer("926357751") }
        shouldNotThrow<Exception> { Organisasjonsnummer("927493373") }
        shouldNotThrow<Exception> { Organisasjonsnummer("922124612") }
        shouldNotThrow<Exception> { Organisasjonsnummer("925317926") }
        shouldNotThrow<Exception> { Organisasjonsnummer("930489603") }
        shouldNotThrow<Exception> { Organisasjonsnummer("928907449") }
        shouldNotThrow<Exception> { Organisasjonsnummer("924847123") }
        shouldNotThrow<Exception> { Organisasjonsnummer("929345460") }
    }
}
