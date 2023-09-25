package no.nav.bidrag.domain.enums

enum class InntektGruppe {
    PERSONINNTEKT, //Personinntekter som har avhengigheter til andre inntekter innenfor samme gruppe
    KAPITALINNTEKT, //Kapitalinntekter som har avhengigheter til andre inntekter innenfor samme gruppe
    INGEN, //Inntekter som ikke har avhengigheter til andre inntekter innenfor samme gruppe
    UKJENT //Inntekter som ikke har fått tildelt noen gruppe fordi det ikke er relevant
}
