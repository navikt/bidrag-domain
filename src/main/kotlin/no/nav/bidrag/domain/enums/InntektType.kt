package no.nav.bidrag.domain.enums

enum class InntektType {
    AAP, // Ytelse fra offentlig
    DAGPENGER, // Ytelse fra offentlig
    FØDSEL_ADOPSJON, // Ytelse fra offentlig
    PENSJON, // Ytelse fra offentlig
    SYKEPENGER, // Ytelse fra offentlig
    LØNNSINNTEKT,
    NÆRINGSINNTEKT,
    KAPITALINNTEKT,
    OVERGANGSSTØNAD,
    KONTANTSTØTTE,
    UTVIDET_BARNETRYGD,
    SMÅBARNSTILLEGG;

    companion object {
        // Lister opp alle inntektRapporteringer som inneholder en gitt inntektType
        fun InntektType.inngårIInntektRapporteringer() =
            InntektRapportering.values().filter { this in it.inneholderInntektTypeListe }
    }
}
