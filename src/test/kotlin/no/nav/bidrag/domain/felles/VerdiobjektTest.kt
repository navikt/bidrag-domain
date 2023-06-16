package no.nav.bidrag.domain.felles

import io.kotest.assertions.throwables.shouldThrowWithMessage
import io.kotest.matchers.collections.shouldHaveSize
import io.kotest.matchers.shouldBe
import no.nav.bidrag.domain.string.Saksnummer
import no.nav.bidrag.domain.tid.FomDato
import no.nav.bidrag.domain.tid.TomDato
import org.junit.jupiter.api.Test

class VerdiobjektTest {

    @Test
    fun `verdier() for et set av verdiobjekter returnerer et sett med verdier`() {
        val saksnumre = setOf(Saksnummer("1234567"), Saksnummer("7654321"), Saksnummer("7142589"))

        val verdier = saksnumre.verdier()

        verdier::class shouldBe LinkedHashSet::class
        verdier shouldHaveSize 3
        val first = verdier.first()
        first::class shouldBe String::class
    }

    @Test
    fun `verdier() for en liste med verdiobjekter returnerer en liste med verdier`() {
        val saksnumre = listOf(Saksnummer("1234567"), Saksnummer("7654321"), Saksnummer("7142589"))

        val verdier = saksnumre.verdier()

        verdier::class shouldBe ArrayList::class
        verdier shouldHaveSize 3
        val first = verdier.first()
        first::class shouldBe String::class
    }

    @Suppress("KotlinConstantConditions")
    @Test
    fun `equals() returnerer true for identiske objekter`() {
        val saksnummer = Saksnummer("3216547")

        (saksnummer == saksnummer) shouldBe true
    }

    @Test
    fun `equals() returnerer true for like objekter`() {
        val saksnummer = Saksnummer("3216547")
        val annetSaksnummerObjekt = Saksnummer("3216547")

        (saksnummer == annetSaksnummerObjekt) shouldBe true
    }

    @Test
    fun `equals() returnerer true for forskjellige verdiobjekter med likt innhold`() {
        val fomDato = FomDato.of(2020, 12, 16)
        val tomDato = TomDato.of(2020, 12, 16)

        (fomDato.equals(tomDato)) shouldBe true
    }

    @Test
    fun `equals() kaster exception ved sammenligning mot noe annet enn verdiobjekt`() {
        val fomDato = FomDato.of(2020, 12, 16)

        shouldThrowWithMessage<IllegalArgumentException>(
            "Programmeringsfeil: class no.nav.bidrag.domain.tid.FomDato kan ikke sammenlignes med class kotlin.String."
        ) {
            (fomDato.equals("654321"))
        }
    }

    @Test
    fun `equals() kaster exception ved sammenligning mot et verdiobjekt med annen verditype`() {
        val fomDato = FomDato.of(2020, 12, 16)
        val saksnummer = Saksnummer("6549771")

        shouldThrowWithMessage<IllegalArgumentException>(
            "Programmeringsfeil: Verditype class java.time.LocalDate kan ikke smmanlignes med class kotlin.String."
        ) {
            (fomDato.equals(saksnummer))
        }
    }
}
