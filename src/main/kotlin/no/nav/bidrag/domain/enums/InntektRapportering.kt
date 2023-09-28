package no.nav.bidrag.domain.enums

enum class InntektRapportering(
    val visningsnavn: String,
    val hentesAutomatisk: Boolean,
    val kanLeggesInnManuelt: Boolean,
    val inneholderInntektTypeListe: List<InntektType>,
    val brukesINyLøsning: Boolean,
    val brukesIGammelLøsning: Boolean
) {

    // Rapporteringer fra bidrag-inntekt

    AINNTEKT(
        visningsnavn = "Lønn og trekk",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    AINNTEKT_BEREGNET_3MND(
        visningsnavn = "Lønn og trekk siste 3 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    AINNTEKT_BEREGNET_12MND(
        visningsnavn = "Lønn og trekk siste 12 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    KAPITALINNTEKT(
        visningsnavn = "Sigrun kapitalinntekt (KAPS)",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.KAPITALINNTEKT
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    LIGNINGSINNTEKT(
        visningsnavn = "Sigrun ligningsinntekt (LIGS)",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    OVERGANGSSTØNAD(
        visningsnavn = "Overgangsstønad",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = true
    ),

    OVERGANGSSTØNAD_BEREGNET_3MND(
        visningsnavn = "Overgangsstønad siste 3 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    OVERGANGSSTØNAD_BEREGNET_12MND(
        visningsnavn = "Overgangsstønad siste 12 mnd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    // Rapporteringer fra bidrag-grunnlag

    KONTANTSTØTTE(
        visningsnavn = "Kontantstøtte",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.KONTANTSTØTTE
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = true
    ),

    SMÅBARNSTILLEGG(
        visningsnavn = "Småbarnstillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.SMÅBARNSTILLEGG
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = true
    ),

    UTVIDET_BARNETRYGD(
        visningsnavn = "Utvidet barnetrygd",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.UTVIDET_BARNETRYGD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = true
    ),

    // Manuelt registrerte rapporteringer

    PERSONINNTEKT_EGNE_OPPLYSNINGER(
        visningsnavn = "Personinntekt egne opplysninger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = listOf(
            InntektType.AAP,
            InntektType.DAGPENGER,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = true
    ),

    KAPITALINNTEKT_EGNE_OPPLYSNINGER(
        visningsnavn = "Kapitalinntekt egne opplysninger",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.KAPITALINNTEKT
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = true
    ),

    SAKSBEHANDLER_BEREGNET_INNTEKT(
        visningsnavn = "Saksbehandlers beregnede inntekt",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.AAP,
            InntektType.DAGPENGER,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.LØNNSINNTEKT,
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = true
    ),

    LØNN_MANUELT_BEREGNET(
        visningsnavn = "Lønn manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.LØNNSINNTEKT
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    NÆRINGSINNTEKT_MANUELT_BEREGNET(
        visningsnavn = "Næringsinntekt manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.NÆRINGSINNTEKT
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    YTELSE_FRA_OFFENTLIG_MANUELT_BEREGNET(
        visningsnavn = "Ytelse fra det offentlige manuelt beregnet",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = listOf(
            InntektType.AAP,
            InntektType.DAGPENGER,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.PENSJON,
            InntektType.SYKEPENGER,
            InntektType.OVERGANGSSTØNAD
        ),
        brukesINyLøsning = true,
        brukesIGammelLøsning = false
    ),

    // Rapporteringer brukt i Bisys/BBM

    AAP(
        visningsnavn = "AAP",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    AINNTEKT_KORRIGERT_BARNETILLEGG(
        visningsnavn = "A-inntekt korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    BARNETRYGD_MANUELL_VURDERING(
        visningsnavn = "Barnetrygd manuell vurdering",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    BARNS_SYKDOM(
        visningsnavn = "Barns sykdom",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    DAGPENGER(
        visningsnavn = "Dagpenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    DOKUMENTASJON_MANGLER_SKJØNN(
        visningsnavn = "Dokumentasjon mangler (skjønn)",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    FORDEL_SKATTEKLASSE2(
        visningsnavn = "Fordel skatteklasse 2",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    FORDEL_SÆRFRADRAG_ENSLIG_FORSØRGER(
        visningsnavn = "Fordel særfradrag enslig forsørger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    FØDSEL_ADOPSJON(
        visningsnavn = "Fødsels- og adopsjonspenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    INNTEKTSOPPLYSNINGER_ARBEIDSGIVER(
        visningsnavn = "Inntektsopplysninger fra arbeidsgiver",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    KAPITALINNTEKT_SKE(
        visningsnavn = "Kapitalinntekt fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    LIGNINGSOPPLYSNINGER_MANGLER(
        visningsnavn = "Ingen ligningsopplysninger finnes",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    LIGNING_SKE(
        visningsnavn = "Ligning fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    LØNN_SKE(
        visningsnavn = "Lønnsoppgave fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    LØNN_SKE_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Lønnsoppgave fra Skatteetaten korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    LØNN_TREKK(
        visningsnavn = "A-inntekt",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    MANGLENDE_BRUK_EVNE_SKJØNN(
        visningsnavn = "Manglende bruk av evne (skjønn)",
        hentesAutomatisk = false,
        kanLeggesInnManuelt = true,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    NETTO_KAPITALINNTEKT(
        visningsnavn = "Netto kapitalinntekt",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    PENSJON(
        visningsnavn = "Pensjon",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    PENSJON_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Pensjon korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    REHABILITERINGSPENGER(
        visningsnavn = "Rehabiliteringspenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    SKATTEGRUNNLAG_KORRIGERT_BARNETILLEGG(
        visningsnavn = "Skattegrunnlag korrigert for barnetillegg",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    SKATTEGRUNNLAG_SKE(
        visningsnavn = "Skattegrunnlag fra Skatteetaten",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    ),

    SYKEPENGER(
        visningsnavn = "Sykepenger",
        hentesAutomatisk = true,
        kanLeggesInnManuelt = false,
        inneholderInntektTypeListe = emptyList(),
        brukesINyLøsning = false,
        brukesIGammelLøsning = true
    );

    companion object {
        // Returnerer true hvis inneholderInntektTypeListe inneholder minst en lik type som tilsvarende liste i inntektRapportering2
        fun InntektRapportering.kanBrukesSammenMed(inntektRapportering2: InntektRapportering) =
            !(this.inneholderInntektTypeListe.any { inntektRapportering2.inneholderInntektTypeListe.contains(it) })
    }
}
