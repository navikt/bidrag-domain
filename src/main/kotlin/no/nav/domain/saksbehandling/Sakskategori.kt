package no.nav.domain.saksbehandling;

enum class Sakskategori(
  private val beskrivelse: String,
  val gyldig: Boolean,
  private val behandlingstypeForvaltning: String?,
  private val behandlingstypeKlage: String,
  private val behandlingstypeSøknad: String,
  val behandlingstype: String
) {
  N("Nasjonal", true, null, "ae0058", "ae0003", "ae0118"),
  U("Utland", true, "ae0106", "ae0108", "ae0110", "ae0106");

  override fun toString(): String {
    return beskrivelse
  }

  fun finnBehandlingstypekode(behandlingstype: Behandlingstype): String? {
    return when (behandlingstype) {
      Behandlingstype.FORVALTNING -> this.behandlingstypeForvaltning
      Behandlingstype.KLAGE -> this.behandlingstypeKlage
      Behandlingstype.SØKNAD -> this.behandlingstypeSøknad
    }
  }

}
