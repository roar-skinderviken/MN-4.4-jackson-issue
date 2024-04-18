package no.javatec.viewmodel

import io.micronaut.core.annotation.Introspected

@Introspected
data class MainAggregationVm(
    val afterCare: List<ClassificationAndStats<AfterCareStatsEntry>>
)
