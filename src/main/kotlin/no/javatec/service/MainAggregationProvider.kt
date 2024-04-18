package no.javatec.service

import jakarta.inject.Singleton
import no.javatec.viewmodel.AfterCareStatsEntry
import no.javatec.viewmodel.ClassificationAndStats
import no.javatec.viewmodel.ClassificationVars
import no.javatec.viewmodel.MainAggregationVm

@Singleton
class MainAggregationProvider {

    fun getMainAggregation(): MainAggregationVm = MainAggregationVm(
        afterCare = listOf(
            ClassificationAndStats(
                ClassificationVars("01"),
                AfterCareStatsEntry()
            )
        )
    )
}