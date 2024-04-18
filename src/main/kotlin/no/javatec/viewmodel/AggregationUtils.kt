package no.javatec.viewmodel

object AggregationUtils {
    fun buildInitialValues(items: Collection<Aggregation>) = items
        .associateWith { 0 }
        .toMutableMap()
}
