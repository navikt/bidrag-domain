@file:Suppress("unused")

package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import no.nav.bidrag.domain.util.trimToNull
import org.springframework.core.convert.converter.Converter

data class Iban(override val verdi: String) : Verdiobjekt<String>

class IbanReadingConverter : Converter<String, Iban> {
    override fun convert(source: String) = source.trimToNull()?.let { Iban(source) }
}

class IbanWritingConverter : Converter<Iban, String> {
    override fun convert(source: Iban) = source.verdi
}

class IbanConverter : AttributeConverter<Iban, String> {
    override fun convertToEntityAttribute(source: String?) = source?.trimToNull()?.let { Iban(source) }
    override fun convertToDatabaseColumn(source: Iban?) = source?.verdi.trimToNull()
}
