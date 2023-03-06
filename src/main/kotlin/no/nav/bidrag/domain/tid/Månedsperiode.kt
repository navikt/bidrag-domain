package no.nav.bidrag.domain.tid

import java.time.LocalDate
import java.time.YearMonth

data class Månedsperiode(override val fom: YearMonth, override val tom: YearMonth?) : Periode<YearMonth>() {

    init {
        validate()
    }

    val fomDato: LocalDate get() = fom.atDay(1)
    val tomDato: LocalDate? get() = tom?.atEndOfMonth()

    constructor(fom: LocalDate, tom: LocalDate?) : this(YearMonth.from(fom), tom?.let { YearMonth.from(tom) })

    constructor(måned: YearMonth) : this(måned, måned)
    constructor(måned: String) : this(YearMonth.parse(måned))
    constructor(fom: String, tom: String) : this(YearMonth.parse(fom), YearMonth.parse(tom))
    constructor(periode: Pair<String, String>) : this(periode.first, periode.second)

    override fun lagPeriode(fom: YearMonth, tom: YearMonth?): Månedsperiode {
        return Månedsperiode(fom, tom)
    }

    override infix fun union(annen: Periode<YearMonth>): Månedsperiode {
        return super.union(annen) as Månedsperiode
    }

    override infix fun snitt(annen: Periode<YearMonth>): Månedsperiode? {
        return super.snitt(annen) as Månedsperiode?
    }

    override infix fun påfølgesAv(påfølgende: Periode<YearMonth>): Boolean {
        return this.tom?.plusMonths(1) == påfølgende.fom
    }

    override fun tomEllerMax(): YearMonth {
        return tom ?: YearMonth.from(LocalDate.MAX)
    }

    override fun lengdeIHeleMåneder(): Long {
        return (tomEllerMax().year * 12 + tomEllerMax().monthValue) - (fom.year * 12 + fom.monthValue) + 1L
    }

    fun toDatoperiode() = Datoperiode(fomDato, tomDato)
}
