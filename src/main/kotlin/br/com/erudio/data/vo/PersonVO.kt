package br.com.erudio.data.vo

import com.fasterxml.jackson.annotation.JsonIgnore
import com.fasterxml.jackson.annotation.JsonProperty
import com.fasterxml.jackson.annotation.JsonPropertyOrder

@JsonPropertyOrder("id", "address", "firstName", "lastName", "gender")
data class PersonVO (
    var id: Long = 0,

    @field:JsonProperty("firstName")
    var firstName: String = "",

    @field:JsonProperty("lastName")
    var lastName: String = "",

    var address: String = "",

    var gender: String = ""
)