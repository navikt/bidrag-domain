package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

data class Enhet(override val verdi: String) : Verdiobjekt<String> {

    override fun gyldig() = verdi.matches(ENHET_REGEX)

    companion object {
        private val ENHET_REGEX = Regex("^\\d{4}$")
    }
}

class EnhetReadingConverter : Converter<String, Enhet> {
    override fun convert(source: String) = Enhet(source)
}

class EnhetWritingConverter : Converter<Enhet, String> {
    override fun convert(source: Enhet) = source.verdi
}

class EnhetConverter : AttributeConverter<Enhet, String> {
    override fun convertToEntityAttribute(source: String?) = source?.let { Enhet(source) }
    override fun convertToDatabaseColumn(source: Enhet?) = source?.verdi
}
