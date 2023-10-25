@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import java.time.temporal.Temporal

sealed class Periode<T> : Comparable<Periode<T>> where T : Comparable<T>, T : Temporal {

    abstract val fom: T
    abstract val tom: T?
    protected fun validate() {
        require(tomEllerMax() >= fom) { "Til-og-med før fra-og-med: $fom > $tom" }
    }

    abstract fun tomEllerMax(): T
    infix fun inneholder(dato: T): Boolean {
        return dato in fom..tomEllerMax()
    }

    infix fun inneholder(annen: Periode<T>): Boolean {
        return annen.fom >= this.fom && annen.tomEllerMax() <= this.tomEllerMax()
    }

    infix fun omsluttesAv(annen: Periode<T>): Boolean {
        return annen.fom <= fom && annen.tomEllerMax() >= tomEllerMax()
    }

    infix fun overlapper(other: Periode<T>): Boolean {
        return inneholder(other.fom) || inneholder(other.tomEllerMax()) || other.inneholder(fom)
    }

    open infix fun snitt(annen: Periode<T>): Periode<T>? {
        return if (!overlapper(annen)) {
            null
        } else if (this == annen) {
            this
        } else {
            lagPeriode(
                maxOf(fom, annen.fom),
                if (tom == null && annen.tom == null) null else minOf(tomEllerMax(), annen.tomEllerMax()),
            )
        }
    }

    open infix fun union(annen: Periode<T>): Periode<T> {
        return if (overlapper(annen) || this.påfølgesAv(annen) || annen.påfølgesAv(this)) {
            lagPeriode(
                minOf(fom, annen.fom),
                if (tom == null || annen.tom == null) null else maxOf(tomEllerMax(), annen.tomEllerMax()),
            )
        } else {
            error("Kan ikke lage union av perioder som $this og $annen som ikke overlapper eller direkte følger hverandre.")
        }
    }

    infix fun overlapperKunIStartenAv(annen: Periode<T>) =
        annen.fom in fom..tomEllerMax() && tomEllerMax() < annen.tomEllerMax()

    infix fun overlapperKunISluttenAv(annen: Periode<T>) =
        annen.tomEllerMax() in fom..tomEllerMax() && fom > annen.fom

    abstract infix fun påfølgesAv(påfølgende: Periode<T>): Boolean

    abstract fun lengdeIHeleMåneder(): Long

    override fun compareTo(other: Periode<T>): Int {
        return Comparator.comparing(Periode<T>::fom).thenComparing(Periode<T>::tomEllerMax).compare(this, other)
    }

    abstract fun lagPeriode(fom: T, tom: T?): Periode<T>
}

fun <T> List<Periode<T>>.erSammenhengende(): Boolean where T : Comparable<T>, T : Temporal =
    this.sorted().foldIndexed(true) { index, acc, periode ->
        if (index == 0) {
            acc
        } else {
            val forrigePeriode = this[index - 1]
            when {
                forrigePeriode.påfølgesAv(periode) -> acc
                else -> false
            }
        }
    }

fun <T> List<Periode<T>>.harOverlappende(): Boolean where T : Comparable<T>, T : Temporal =
    this.sorted().zipWithNext { a, b ->
        a.overlapper(b)
    }.any { it }
