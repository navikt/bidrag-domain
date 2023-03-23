@file:Suppress("unused")

package no.nav.bidrag.domain.tid

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.sql.Date
import java.time.LocalDate

data class OpprettetDato(override val verdi: LocalDate) : Verdiobjekt<LocalDate>

class OpprettetDatoReadingConverter : Converter<Date, OpprettetDato> {
    override fun convert(source: Date) = OpprettetDato(source.toLocalDate())
}

class OpprettetDatoWritingConverter : Converter<OpprettetDato, Date> {
    override fun convert(source: OpprettetDato) = Date.valueOf(source.verdi)
}

class OpprettetDatoConverter : AttributeConverter<OpprettetDato, LocalDate> {
    override fun convertToEntityAttribute(source: LocalDate?) = source?.let { OpprettetDato(source) }
    override fun convertToDatabaseColumn(source: OpprettetDato?) = source?.verdi
}
