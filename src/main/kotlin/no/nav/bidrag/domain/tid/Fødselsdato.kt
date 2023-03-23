@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

data class Fødselsdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>

class FødselsdatoReadingConverter : Converter<Date, Fødselsdato> {
    override fun convert(source: Date) = Fødselsdato(source.toLocalDate())
}

class FødselsdatoWritingConverter : Converter<Fødselsdato, Date> {
    override fun convert(source: Fødselsdato) = Date.valueOf(source.verdi)
}

class FødselsdatoConverter : AttributeConverter<Fødselsdato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { Fødselsdato(source) }
    override fun convertToDatabaseColumn(source: Fødselsdato?) = source?.verdi
}
