package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter
import java.util.UUID

data class NavCallId(override val verdi: UUID) : Verdiobjekt<UUID>

class NavCallIdReadingConverter : Converter<String, NavCallId> {
    override fun convert(source: String) = NavCallId(UUID.fromString(source))
}

class NavCallIdWritingConverter : Converter<NavCallId, String> {
    override fun convert(source: NavCallId) = source.verdi.toString()
}

class NavCallIdConverter : AttributeConverter<NavCallId, UUID> {
    override fun convertToEntityAttribute(source: UUID?) = source?.let { NavCallId(source) }
    override fun convertToDatabaseColumn(source: NavCallId?) = source?.verdi
}
