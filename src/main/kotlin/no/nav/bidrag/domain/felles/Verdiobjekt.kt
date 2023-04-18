@file:Suppress("unused")

package no.nav.bidrag.domain.felles

import com.fasterxml.jackson.annotation.JsonValue

abstract class Verdiobjekt<T : Comparable<T>> : Comparable<Verdiobjekt<T>> {

    @get:JsonValue
    abstract val verdi: T

    open fun gyldig(): Boolean = true

    override operator fun compareTo(other: Verdiobjekt<T>): Int {
        return this.verdi.compareTo(other.verdi)
    }

    override fun toString(): String = verdi.toString()

    override fun equals(other: Any?): Boolean {
        if (this === other) return true
        if (other !is Verdiobjekt<*>) return false

        if (verdi != other.verdi) return false

        return true
    }

    override fun hashCode(): Int {
        return verdi.hashCode()
    }
}

fun <T : Comparable<T>> Verdiobjekt<T>?.nonNullGyldig(): Boolean {
    return this != null && this.gyldig()
}

fun <T : Comparable<T>> Set<Verdiobjekt<T>>.verdier() = this.map { it.verdi }.toSet()
fun <T : Comparable<T>> List<Verdiobjekt<T>>.verdier() = this.map { it.verdi }
