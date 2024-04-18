package no.javatec.viewmodel

interface StatsEntry {
    val shouldNotAppearInJson: MutableMap<Aggregation, Int>
}
