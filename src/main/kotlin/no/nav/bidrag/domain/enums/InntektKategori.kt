package no.nav.bidrag.domain.enums

enum class InntektKategori(
    val visningsnavn: String,
    val bestårAvInntektTypeListe: List<InntektType>,
    val tilhørerInntektGruppe: InntektGruppe
) {
    AINNTEKT(
        visningsnavn = "Lønn og trekk",
        bestårAvInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.LØNN_TREKK,
            InntektType.PENSJON,
            InntektType.SYKEPENGER
        ),
        tilhørerInntektGruppe = InntektGruppe.PERSONINNTEKT
    ),

    AINNTEKT_BEREGNET_3MND(
        visningsnavn = "Lønn og trekk siste 3 mnd",
        bestårAvInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.LØNN_TREKK,
            InntektType.PENSJON,
            InntektType.SYKEPENGER
        ),
        tilhørerInntektGruppe = InntektGruppe.PERSONINNTEKT
    ),

    AINNTEKT_BEREGNET_12MND(
        visningsnavn = "Lønn og trekk siste 12 mnd",
        bestårAvInntektTypeListe = listOf(
            InntektType.DAGPENGER,
            InntektType.AAP,
            InntektType.FØDSEL_ADOPSJON,
            InntektType.LØNN_TREKK,
            InntektType.PENSJON,
            InntektType.SYKEPENGER
        ),
        tilhørerInntektGruppe = InntektGruppe.PERSONINNTEKT
    ),

    LIGNINGSINNTEKT(
        visningsnavn = "Sigrun ligningsinntekt (LIGS)",
        bestårAvInntektTypeListe = listOf(InntektType.SKATTEGRUNNLAG_SKE),
        tilhørerInntektGruppe = InntektGruppe.PERSONINNTEKT
    ),

    KAPITALINNTEKT(
        visningsnavn = "Sigrun kapitalinntekt (KAPS)",
        bestårAvInntektTypeListe = listOf(InntektType.KAPITALINNTEKT_SKE),
        tilhørerInntektGruppe = InntektGruppe.KAPITALINNTEKT
    ),

    OVERGANGSSTØNAD(
        visningsnavn = "Overgangsstønad",
        bestårAvInntektTypeListe = listOf(InntektType.OVERGANGSSTØNAD),
        tilhørerInntektGruppe = InntektGruppe.INGEN
    ),

    OVERGANGSSTØNAD_BEREGNET_3MND(
        visningsnavn = "Overgangsstønad siste 3 mnd",
        bestårAvInntektTypeListe = listOf(InntektType.OVERGANGSSTØNAD),
        tilhørerInntektGruppe = InntektGruppe.INGEN
    ),

    OVERGANGSSTØNAD_BEREGNET_12MND(
        visningsnavn = "Overgangsstønad siste 12 mnd",
        bestårAvInntektTypeListe = listOf(InntektType.OVERGANGSSTØNAD),
        tilhørerInntektGruppe = InntektGruppe.INGEN
    );
}
