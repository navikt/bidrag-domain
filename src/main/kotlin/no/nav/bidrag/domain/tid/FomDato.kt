package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

data class FomDato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>

class FomDatoReadingConverter : Converter<Date, FomDato> {
    override fun convert(source: Date) = FomDato(source.toLocalDate())
}

class FomDatoWritingConverter : Converter<FomDato, Date> {
    override fun convert(source: FomDato) = Date.valueOf(source.verdi)
}

class FomDatoConverter : AttributeConverter<FomDato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { FomDato(source) }
    override fun convertToDatabaseColumn(source: FomDato?) = source?.verdi
}
