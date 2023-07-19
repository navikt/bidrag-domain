package no.nav.bidrag.domain.enums

enum class InntektBeskrivelse(verdi: String) {
    AINNTEKT_BEREGNET_3MND("Ainntekt beregnet inntekt siste 3 mnd"),
    AINNTEKT_BEREGNET_12MND("Ainntekt beregnet inntekt siste 12 mnd"),
    AINNTEKT("Ainntekt"),
    LIGNINGSINNTEKT("Sigrun ligningsinntekt (LIGS)"),
    KAPITALINNTEKT("Sigrun kapitalinntekt (KAPS)"),
    UTVIDET_BARNETRYGD("Utvidet barnetrygd"),
    SMÅBARNSTILLEGG("Småbarnstillegg"),
    KONTANTSTØTTE("Kontantstøtte"),
    OVERGANGSSTØNAD("Overgangsstønad"),
    OVERGANGSSTØNAD_BEREGNET_3MND("Overgangsstønad beregnet inntekt siste 3 mnd"),
    OVERGANGSSTØNAD_BEREGNET_12MND("Overgangsstønad beregnet inntekt siste 12 mnd")
}