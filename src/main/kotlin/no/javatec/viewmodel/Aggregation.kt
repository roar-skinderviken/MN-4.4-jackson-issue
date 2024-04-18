package no.javatec.viewmodel

import com.fasterxml.jackson.annotation.JsonValue
import io.micronaut.core.annotation.Introspected

@Introspected
enum class Aggregation(@get:JsonValue val fieldName: String) {
    FIELD_1("SomeField1"),
    FIELD_2("SomeField2");
}