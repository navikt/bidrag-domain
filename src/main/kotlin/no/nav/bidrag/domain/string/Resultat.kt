package no.nav.bidrag.domain.string

import jakarta.persistence.AttributeConverter
import no.nav.bidrag.domain.felles.Verdiobjekt
import org.springframework.core.convert.converter.Converter

data class Resultat(override val verdi: String) : Verdiobjekt<String>

class ResultatReadingConverter : Converter<String, Resultat> {
    override fun convert(source: String) = Resultat(source)
}

class ResultatWritingConverter : Converter<Resultat, String> {
    override fun convert(source: Resultat) = source.verdi
}

class ResultatConverter : AttributeConverter<Resultat, String> {
    override fun convertToEntityAttribute(source: String?) = source?.let { Resultat(source) }
    override fun convertToDatabaseColumn(source: Resultat?) = source?.verdi
}
