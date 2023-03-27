@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

data class Bekreftelsesdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>

class BekreftelsesdatoReadingConverter : Converter<Date, Bekreftelsesdato> {
    override fun convert(source: Date) = Bekreftelsesdato(source.toLocalDate())
}

class BekreftelsesdatoWritingConverter : Converter<Bekreftelsesdato, Date> {
    override fun convert(source: Bekreftelsesdato) = Date.valueOf(source.verdi)
}

class BekreftelsesdatoConverter : AttributeConverter<Bekreftelsesdato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { Bekreftelsesdato(source) }
    override fun convertToDatabaseColumn(source: Bekreftelsesdato?) = source?.verdi
}
