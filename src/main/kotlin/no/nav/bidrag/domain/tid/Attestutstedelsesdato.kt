@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

data class Attestutstedelsesdato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>

class AttestutstedelsesdatoReadingConverter : Converter<Date, Attestutstedelsesdato> {
    override fun convert(source: Date) = Attestutstedelsesdato(source.toLocalDate())
}

class AttestutstedelsesdatoWritingConverter : Converter<Attestutstedelsesdato, Date> {
    override fun convert(source: Attestutstedelsesdato) = Date.valueOf(source.verdi)
}

class AttestutstedelsesdatoConverter : AttributeConverter<Attestutstedelsesdato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { Attestutstedelsesdato(source) }
    override fun convertToDatabaseColumn(source: Attestutstedelsesdato?) = source?.verdi
}
