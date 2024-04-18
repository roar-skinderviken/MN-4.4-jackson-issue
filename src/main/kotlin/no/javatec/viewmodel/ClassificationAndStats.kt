package no.javatec.viewmodel

import com.fasterxml.jackson.annotation.JsonGetter
import com.fasterxml.jackson.annotation.JsonIgnore
import io.micronaut.core.annotation.Introspected

@Introspected
data class ClassificationAndStats<out T : StatsEntry>(
    val klassifisering: ClassificationVars,
    /** Ignore field to avoid double wrapping of values in resulting JSON */
    @JsonIgnore
    val stats: T
) {
    @JsonGetter("stats")
    fun getValues(): Map<Aggregation, Int> = stats.shouldNotAppearInJson
}
