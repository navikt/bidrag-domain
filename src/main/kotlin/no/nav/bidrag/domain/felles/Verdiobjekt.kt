@file:Suppress("unused")

package no.nav.bidrag.domain.felles

import com.fasterxml.jackson.annotation.JsonValue
import kotlin.contracts.ExperimentalContracts
import kotlin.contracts.contract

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
        if (other == null) return false
        if (other !is Verdiobjekt<*>)
            throw IllegalArgumentException("Programmeringsfeil: ${this::class} kan ikke sammenlignes med ${other::class}.")
        if (verdi::class != other.verdi::class)
            throw IllegalArgumentException("Programmeringsfeil: Verditype ${verdi::class} kan ikke smmanlignes med ${other.verdi::class}.")
        return verdi == other.verdi
    }

    override fun hashCode(): Int {
        return verdi.hashCode()
    }
}

@OptIn(ExperimentalContracts::class)
fun <T : Comparable<T>> Verdiobjekt<T>?.ikkeNullOgGyldig(): Boolean {
    contract {
        returns(true) implies (this@ikkeNullOgGyldig != null)
    }
    return this != null && this.gyldig()
}

@OptIn(ExperimentalContracts::class)
fun <T : Comparable<T>> Verdiobjekt<T>?.erNullEllerUgyldig(): Boolean {
    contract {
        returns(false) implies (this@erNullEllerUgyldig != null)
    }
    return this == null || !this.gyldig()
}

fun <T : Comparable<T>> Set<Verdiobjekt<T>>.verdier() = this.map { it.verdi }.toSet()
fun <T : Comparable<T>> List<Verdiobjekt<T>>.verdier() = this.map { it.verdi }
