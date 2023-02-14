package no.nav.domain.felles

interface Verdiobjekt<T : Any?> {
    val verdi: T
    fun gyldig(): Boolean = true
}

fun <T> Set<Verdiobjekt<T>>.verdier() = this.map { it.verdi }.toSet()
fun <T> List<Verdiobjekt<T>>.verdier() = this.map { it.verdi }
