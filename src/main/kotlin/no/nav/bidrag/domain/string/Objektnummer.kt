package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

data class Objektnummer(override val verdi: String) : Verdiobjekt<String> {

    override fun gyldig() = verdi.matches(OBJEKTNUMMER_REGEX)

    companion object {
        private val OBJEKTNUMMER_REGEX = Regex("^\\d{2}$")
    }
}

class ObjektnummerReadingConverter : Converter<String, Objektnummer> {
    override fun convert(source: String) = Objektnummer(source)
}

class ObjektnummerWritingConverter : Converter<Objektnummer, String> {
    override fun convert(source: Objektnummer) = source.verdi
}

class ObjektnummerConverter : AttributeConverter<Objektnummer, String> {
    override fun convertToEntityAttribute(source: String?) = source?.let { Objektnummer(source) }
    override fun convertToDatabaseColumn(source: Objektnummer?) = source?.verdi
}
