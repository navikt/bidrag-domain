package no.nav.bidrag.domain.enums

enum class InntektBeskrivelse(val visningsnavn: String) {
    AINNTEKT_BEREGNET_3MND("Lønn og trekk siste 3 mnd"),
    AINNTEKT_BEREGNET_12MND("Lønn og trekk siste 12 mnd"),
    AINNTEKT("Lønn og trekk"),
    LIGNINGSINNTEKT("Sigrun ligningsinntekt (LIGS)"),
    KAPITALINNTEKT("Sigrun kapitalinntekt (KAPS)"),
    UTVIDET_BARNETRYGD("Utvidet barnetrygd"),
    SMÅBARNSTILLEGG("Småbarnstillegg"),
    KONTANTSTØTTE("Kontantstøtte"),
    OVERGANGSSTØNAD("Overgangsstønad"),
    OVERGANGSSTØNAD_BEREGNET_3MND("Overgangsstønad siste 3 mnd"),
    OVERGANGSSTØNAD_BEREGNET_12MND("Overgangsstønad siste 12 mnd"),
}
