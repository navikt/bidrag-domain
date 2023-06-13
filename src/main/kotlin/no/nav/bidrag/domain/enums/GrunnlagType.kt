package no.nav.bidrag.behandling.felles.enums

/**
 * Typer grunnlag som benyttes i beregning og vedtak
 */
enum class GrunnlagType(val value: String) {
    SAERFRADRAG(GrunnlagTypeConstants.SAERFRADRAG),
    SOKNADSBARN_INFO(GrunnlagTypeConstants.SOKNADSBARN_INFO),
    SKATTEKLASSE(GrunnlagTypeConstants.SKATTEKLASSE),
    BARN_I_HUSSTAND(GrunnlagTypeConstants.BARN_I_HUSSTAND),
    BOSTATUS(GrunnlagTypeConstants.BOSTATUS),
    BOSTATUS_BP(GrunnlagTypeConstants.BOSTATUS_BP),
    INNTEKT(GrunnlagTypeConstants.INNTEKT),
    INNTEKT_BARN(GrunnlagTypeConstants.INNTEKT_BARN),
    INNTEKT_UTVIDET_BARNETRYGD(GrunnlagTypeConstants.INNTEKT_UTVIDET_BARNETRYGD),
    NETTO_SAERTILSKUDD(GrunnlagTypeConstants.NETTO_SAERTILSKUDD),
    SAMVAERSKLASSE(GrunnlagTypeConstants.SAMVAERSKLASSE),
    BIDRAGSEVNE(GrunnlagTypeConstants.BIDRAGSEVNE),
    SAMVAERSFRADRAG(GrunnlagTypeConstants.SAMVAERSFRADRAG),
    SJABLON(GrunnlagTypeConstants.SJABLON),
    LOPENDE_BIDRAG(GrunnlagTypeConstants.LOPENDE_BIDRAG),
    FAKTISK_UTGIFT(GrunnlagTypeConstants.FAKTISK_UTGIFT),
    BARNETILSYN_MED_STONAD(GrunnlagTypeConstants.BARNETILSYN_MED_STONAD),
    FORPLEINING_UTGIFT(GrunnlagTypeConstants.FORPLEINING_UTGIFT),
    BARN(GrunnlagTypeConstants.BARN),
    SIVILSTAND(GrunnlagTypeConstants.SIVILSTAND),
    BARNETILLEGG(GrunnlagTypeConstants.BARNETILLEGG),
    BARNETILLEGG_FORSVARET(GrunnlagTypeConstants.BARNETILLEGG_FORSVARET),
    DELT_BOSTED(GrunnlagTypeConstants.DELT_BOSTED),
    NETTO_BARNETILSYN(GrunnlagTypeConstants.NETTO_BARNETILSYN),
    UNDERHOLDSKOSTNAD(GrunnlagTypeConstants.UNDERHOLDSKOSTNAD),
    BPS_ANDEL_UNDERHOLDSKOSTNAD(GrunnlagTypeConstants.BPS_ANDEL_UNDERHOLDSKOSTNAD),
    TILLEGGSBIDRAG(GrunnlagTypeConstants.TILLEGGSBIDRAG),
    MAKS_BIDRAG_PER_BARN(GrunnlagTypeConstants.MAKS_BIDRAG_PER_BARN),
    BPS_ANDEL_SAERTILSKUDD(GrunnlagTypeConstants.BPS_ANDEL_SAERTILSKUDD),
    MAKS_GRENSE_25_INNTEKT(GrunnlagTypeConstants.MAKS_GRENSE_25_INNTEKT),
    GEBYRFRITAK(GrunnlagTypeConstants.GEBYRFRITAK),
    SOKNAD_INFO(GrunnlagTypeConstants.SOKNAD_INFO),
    BARN_INFO(GrunnlagTypeConstants.BARN_INFO),
    PERSON_INFO(GrunnlagTypeConstants.PERSON_INFO),
    SAKSBEHANDLER_INFO(GrunnlagTypeConstants.SAKSBEHANDLER_INFO),
    VEDTAK_INFO(GrunnlagTypeConstants.VEDTAK_INFO),
    INNBETALT_BELOP(GrunnlagTypeConstants.INNBETALT_BELOP),
    FORHOLDSMESSIG_FORDELING(GrunnlagTypeConstants.FORHOLDSMESSIG_FORDELING),
    SLUTTBEREGNING_BBM(GrunnlagTypeConstants.SLUTTBEREGNING_BBM),
    KLAGE_STATISTIKK(GrunnlagTypeConstants.KLAGE_STATISTIKK);

    object GrunnlagTypeConstants {
        const val SAERFRADRAG = "SAERFRADRAG"
        const val SOKNADSBARN_INFO = "SOKNADSBARN_INFO"
        const val SKATTEKLASSE = "SKATTEKLASSE"
        const val BARN_I_HUSSTAND = "BARN_I_HUSSTAND"
        const val BOSTATUS = "BOSTATUS"
        const val BOSTATUS_BP = "BOSTATUS_BP"
        const val INNTEKT = "INNTEKT"
        const val INNTEKT_BARN = "INNTEKT_BARN"
        const val INNTEKT_UTVIDET_BARNETRYGD = "INNTEKT_UTVIDET_BARNETRYGD"
        const val NETTO_SAERTILSKUDD = "NETTO_SAERTILSKUDD"
        const val SAMVAERSKLASSE = "SAMVAERSKLASSE"
        const val BIDRAGSEVNE = "BIDRAGSEVNE"
        const val SAMVAERSFRADRAG = "SAMVAERSFRADRAG"
        const val SJABLON = "SJABLON"
        const val LOPENDE_BIDRAG = "LOPENDE_BIDRAG"
        const val FAKTISK_UTGIFT = "FAKTISK_UTGIFT"
        const val BARNETILSYN_MED_STONAD = "BARNETILSYN_MED_STONAD"
        const val FORPLEINING_UTGIFT = "FORPLEINING_UTGIFT"
        const val BARN = "BARN"
        const val SIVILSTAND = "SIVILSTAND"
        const val BARNETILLEGG = "BARNETILLEGG"
        const val BARNETILLEGG_FORSVARET = "BARNETILLEGG_FORSVARET"
        const val DELT_BOSTED = "DELT_BOSTED"
        const val NETTO_BARNETILSYN = "NETTO_BARNETILSYN"
        const val UNDERHOLDSKOSTNAD = "UNDERHOLDSKOSTNAD"
        const val BPS_ANDEL_UNDERHOLDSKOSTNAD = "BPS_ANDEL_UNDERHOLDSKOSTNAD"
        const val TILLEGGSBIDRAG = "TILLEGGSBIDRAG"
        const val MAKS_BIDRAG_PER_BARN = "MAKS_BIDRAG_PER_BARN"
        const val BPS_ANDEL_SAERTILSKUDD = "BPS_ANDEL_SAERTILSKUDD"
        const val MAKS_GRENSE_25_INNTEKT = "MAKS_GRENSE_25_INNTEKT"
        const val GEBYRFRITAK = "GEBYRFRITAK"
        const val SOKNAD_INFO = "SOKNAD_INFO"
        const val BARN_INFO = "BARN_INFO"
        const val PERSON_INFO = "PERSON_INFO"
        const val SAKSBEHANDLER_INFO = "SAKSBEHANDLER_INFO"
        const val VEDTAK_INFO = "VEDTAK_INFO"
        const val INNBETALT_BELOP = "INNBETALT_BELOP"
        const val FORHOLDSMESSIG_FORDELING = "FORHOLDSMESSIG_FORDELING"
        const val SLUTTBEREGNING_BBM = "SLUTTBEREGNING_BBM"
        const val KLAGE_STATISTIKK = "KLAGE_STATISTIKK"
    }
}
