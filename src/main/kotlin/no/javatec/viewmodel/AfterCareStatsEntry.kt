package no.javatec.viewmodel

import io.micronaut.core.annotation.Introspected

@Introspected
data class AfterCareStatsEntry(
    override val values: MutableMap<Aggregation, Int> = AggregationUtils.buildInitialValues(AFTERCARE_AGGREGATIONS)
) : StatsEntry {
    companion object {
        val AFTERCARE_AGGREGATIONS = listOf(
            Aggregation.FIELD_1,
            Aggregation.FIELD_2
        )
    }
}
