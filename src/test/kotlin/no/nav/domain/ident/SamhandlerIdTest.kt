package no.nav.domain.ident

import io.kotest.assertions.throwables.shouldNotThrow
import io.kotest.assertions.throwables.shouldThrow
import org.junit.jupiter.api.Test

class SamhandlerIdTest {


    @Test
    fun `samhandlerId godtar kun 11 siffer`() {
        shouldThrow<IllegalArgumentException> {  SamhandlerId("987654321987") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("9876543210") }
        shouldNotThrow<Exception> {  SamhandlerId("98765432101") }
    }

    @Test
    fun `samhandlerId må begynne med 8 eller 9`() {
        shouldThrow<IllegalArgumentException> {  SamhandlerId("08765432101") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("18765432101") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("28765432101") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("38765432101") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("48765432101") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("58765432101") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("68765432101") }
        shouldThrow<IllegalArgumentException> {  SamhandlerId("78765432101") }
        shouldNotThrow<Exception> {  SamhandlerId("98765432101") }
        shouldNotThrow<Exception> {  SamhandlerId("89765432101") }
    }


}
