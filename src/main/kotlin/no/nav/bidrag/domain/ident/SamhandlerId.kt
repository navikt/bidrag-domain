package no.nav.bidrag.domain.ident

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

data class SamhandlerId(override val verdi: String) : Verdiobjekt<String> {

    override fun gyldig(): Boolean {
        return verdi.matches(SAMHANDLER_ID_REGEX)
    }

    companion object {
        private val SAMHANDLER_ID_REGEX = Regex("^[89]\\d{10}$")
    }
}

class SamhandlerIdReadingConverter : Converter<String, SamhandlerId> {
    override fun convert(source: String) = SamhandlerId(source)
}

class SamhandlerIdWritingConverter : Converter<SamhandlerId, String> {

    override fun convert(source: SamhandlerId) = source.verdi
}

class SamhandlerIdConverter : AttributeConverter<SamhandlerId, String> {
    override fun convertToEntityAttribute(source: String?) = source?.let { SamhandlerId(source) }
    override fun convertToDatabaseColumn(source: SamhandlerId?) = source?.verdi
}
