@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import java.time.LocalDate
import java.time.YearMonth

data class Datoperiode(override val fom: LocalDate, override val tom: LocalDate?) : Periode<LocalDate>() {

    init {
        validate()
    }

    val fomMåned get() = FomMåned(YearMonth.from(fom))
    val tomMåned get() = tom?.let { FomMåned(YearMonth.from(it)) }

    val fomDato get() = FomDato(fom)
    val tomDato get() = tom?.let { TomDato(it) }

    constructor(fom: YearMonth, tom: YearMonth?) : this(fom.atDay(1), tom?.atEndOfMonth())
    constructor(fom: String, tom: String) : this(LocalDate.parse(fom), LocalDate.parse(tom))
    constructor(periode: Pair<String, String>) : this(periode.first, periode.second)

    override fun lagPeriode(fom: LocalDate, tom: LocalDate?): Datoperiode {
        return Datoperiode(fom, tom)
    }

    override infix fun union(annen: Periode<LocalDate>): Datoperiode {
        return super.union(annen) as Datoperiode
    }

    override infix fun snitt(annen: Periode<LocalDate>): Datoperiode? {
        return super.snitt(annen) as Datoperiode?
    }

    override infix fun påfølgesAv(påfølgende: Periode<LocalDate>): Boolean {
        return this.tom?.plusDays(1) == påfølgende.fom
    }

    override fun tomEllerMax() = tom ?: LocalDate.MAX

    override fun lengdeIHeleMåneder(): Long {
        require(fom.dayOfMonth == 1 && tom == YearMonth.from(tomEllerMax()).atEndOfMonth()) {
            "Forsøk på å beregne lengde i hele måneder for en periode som ikke er hele måneder: $fom - $tom"
        }
        return (tomEllerMax().year * 12 + tomEllerMax().monthValue) - (fom.year * 12 + fom.monthValue) + 1L
    }

    fun toMånedsperiode() = Månedsperiode(fom, tom)
}
