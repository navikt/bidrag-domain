package no.nav.bidrag.domain.felles

import com.fasterxml.jackson.annotation.JsonValue

interface Verdiobjekt<T : Comparable<T>> : Comparable<Verdiobjekt<T>> {

    @get:JsonValue
    val verdi: T

    fun gyldig(): Boolean = true

    override operator fun compareTo(other: Verdiobjekt<T>): Int {
        return this.verdi.compareTo(other.verdi)
    }
}

fun <T : Comparable<T>> Set<Verdiobjekt<T>>.verdier() = this.map { it.verdi }.toSet()
fun <T : Comparable<T>> List<Verdiobjekt<T>>.verdier() = this.map { it.verdi }
