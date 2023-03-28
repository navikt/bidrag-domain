@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

class Enhet(override val verdi: String) : Verdiobjekt<String>() {

    override fun gyldig() = verdi.matches(ENHET_REGEX)

    companion object {
        private val ENHET_REGEX = Regex("^\\d{4}$")
    }
}

class EnhetReadingConverter : Converter<String, Enhet> {
    override fun convert(source: String) = source.trimToNull()?.let { Enhet(source) }
}

class EnhetWritingConverter : Converter<Enhet, String> {
    override fun convert(source: Enhet) = source.verdi.trimToNull()
}

class EnhetConverter : AttributeConverter<Enhet, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Enhet(source) }
    override fun convertToDatabaseColumn(source: Enhet?) = source?.verdi.trimToNull()
}
