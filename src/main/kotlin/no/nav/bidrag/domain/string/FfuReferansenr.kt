package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

data class FfuReferansenr(override val verdi: String) : Verdiobjekt<String>

class FfuReferansenrReadingConverter : Converter<String, FfuReferansenr> {
    override fun convert(source: String) = FfuReferansenr(source)
}

class FfuReferansenrWritingConverter : Converter<FfuReferansenr, String> {
    override fun convert(source: FfuReferansenr) = source.verdi
}

class FfuReferansenrConverter : AttributeConverter<FfuReferansenr, String> {
    override fun convertToEntityAttribute(source: String?) = source?.let { FfuReferansenr(source) }
    override fun convertToDatabaseColumn(source: FfuReferansenr?) = source?.verdi
}
