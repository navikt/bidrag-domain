package no.nav.bidrag.domain.enums

enum class BehandlingsrefKilde {
    BISYS_SOKNAD, // Søknadsid fra Bisys
    BISYS_KLAGE_REF_SOKNAD // For klage: Bisys søknadsid til den opprinnelige søknaden det klages på
}
