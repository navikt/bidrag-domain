package no.nav.bidrag.domain.enum

import io.kotest.matchers.shouldBe
import no.nav.bidrag.domain.enums.InntektRapportering
import no.nav.bidrag.domain.enums.InntektRapportering.Companion.kanBrukesSammenMed
import org.junit.jupiter.api.Test

class InntektRapporteringTest {

    @Test
    fun `skal sjekke om to inntektsrapporteringer kan opptre samtidig`() {
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.AINNTEKT_BEREGNET_3MND) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.AINNTEKT_BEREGNET_12MND) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.LIGNINGSINNTEKT) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.OVERGANGSSTØNAD) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.OVERGANGSSTØNAD_BEREGNET_3MND) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.OVERGANGSSTØNAD_BEREGNET_12MND) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.KONTANTSTØTTE) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.SMÅBARNSTILLEGG) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.UTVIDET_BARNETRYGD) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.LØNN_MANUELT_BEREGNET) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.KAPITALINNTEKT_EGNE_OPPLYSNINGER) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.NÆRINGSINNTEKT_MANUELT_BEREGNET) shouldBe true
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.PERSONINNTEKT_EGNE_OPPLYSNINGER) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.SAKSBEHANDLER_BEREGNET_INNTEKT) shouldBe false
        InntektRapportering.AINNTEKT.kanBrukesSammenMed(InntektRapportering.YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET) shouldBe false
    }
}
