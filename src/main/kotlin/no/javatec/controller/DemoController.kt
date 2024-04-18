package no.javatec.controller

import io.micronaut.http.MediaType.APPLICATION_JSON
import io.micronaut.http.annotation.Controller
import io.micronaut.http.annotation.Get
import no.javatec.service.MainAggregationProvider

@Controller
class DemoController(
    private val mainAggregationProvider: MainAggregationProvider
) {

    @Get("/get-aggregation", produces = [APPLICATION_JSON])
    fun getAggregation() = mainAggregationProvider.getMainAggregation()
}