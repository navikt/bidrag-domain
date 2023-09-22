package no.nav.bidrag.domain.enums

enum class InntektKategori(
    val visningsnavn: String,
    val inntektTypeListe: List<InntektType>
) {
    AINNTEKT_BEREGNET_3MND(
        "Lønn og trekk siste 3 mnd",
        listOf(InntektType.ALOYSE, InntektType.ATTFORING_AAP, InntektType.PENSJON, InntektType.SYKEPENGER)
    ),
    AINNTEKT_BEREGNET_12MND(
        "Lønn og trekk siste 12 mnd",
        listOf(InntektType.ALOYSE, InntektType.ATTFORING_AAP, InntektType.PENSJON, InntektType.SYKEPENGER)
    ),
    AINNTEKT("Lønn og trekk", listOf(InntektType.ALOYSE, InntektType.ATTFORING_AAP, InntektType.PENSJON, InntektType.SYKEPENGER)),
    LIGNINGSINNTEKT("Sigrun ligningsinntekt (LIGS)", listOf(InntektType.LIGNING_SKE)),
    KAPITALINNTEKT("Sigrun kapitalinntekt (KAPS)", listOf(InntektType.KAPITALINNTEKT_SKE)),
    OVERGANGSSTØNAD("Overgangsstønad", listOf(InntektType.OVERGANGSSTONAD)),
    OVERGANGSSTØNAD_BEREGNET_3MND("Overgangsstønad siste 3 mnd", listOf(InntektType.OVERGANGSSTONAD)),
    OVERGANGSSTØNAD_BEREGNET_12MND("Overgangsstønad siste 12 mnd", listOf(InntektType.OVERGANGSSTONAD));

    companion object {
        fun finnInntektkategorierSomInneholderInntektType(inntektType: InntektType) =
            InntektKategori.values().filter { inntektType in it.inntektTypeListe }
    }
}
