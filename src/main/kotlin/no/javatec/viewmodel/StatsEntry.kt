package no.javatec.viewmodel

interface StatsEntry {
    val values: MutableMap<Aggregation, Int>
}
