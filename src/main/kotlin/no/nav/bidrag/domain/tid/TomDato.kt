package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

data class TomDato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>

class TomDatoReadingConverter : Converter<Date, TomDato> {
    override fun convert(source: Date) = TomDato(source.toLocalDate())
}

class TomDatoWritingConverter : Converter<TomDato, Date> {
    override fun convert(source: TomDato) = Date.valueOf(source.verdi)
}

class TomDatoConverter : AttributeConverter<TomDato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { TomDato(source) }
    override fun convertToDatabaseColumn(source: TomDato?) = source?.verdi
}
