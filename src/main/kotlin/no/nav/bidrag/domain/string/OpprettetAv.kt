package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

data class OpprettetAv(override val verdi: String) : Verdiobjekt<String>

class OpprettetAvReadingConverter : Converter<String, OpprettetAv> {
    override fun convert(source: String) = OpprettetAv(source)
}

class OpprettetAvWritingConverter : Converter<OpprettetAv, String> {
    override fun convert(source: OpprettetAv) = source.verdi
}

class OpprettetAvConverter : AttributeConverter<OpprettetAv, String> {
    override fun convertToEntityAttribute(source: String?) = source?.let { OpprettetAv(source) }
    override fun convertToDatabaseColumn(source: OpprettetAv?) = source?.verdi
}
