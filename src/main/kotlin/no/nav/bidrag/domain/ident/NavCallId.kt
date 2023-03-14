package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

data class NavCallId(override val verdi: String) : Verdiobjekt<String>

class NavCallIdReadingConverter : Converter<String, NavCallId> {
    override fun convert(source: String) = NavCallId(source)
}

class NavCallIdWritingConverter : Converter<NavCallId, String> {
    override fun convert(source: NavCallId) = source.verdi
}

class NavCallIdConverter : AttributeConverter<NavCallId, String> {
    override fun convertToEntityAttribute(source: String?) = source?.let { NavCallId(source) }
    override fun convertToDatabaseColumn(source: NavCallId?) = source?.verdi
}
