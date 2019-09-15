package com.example.spring

import com.fasterxml.jackson.annotation.JsonProperty

/**
 * deserialize from (request body)
 * {name: "name"}
 *
 * serialize to (response body)
 * {name: "name"}
 *
 * 1. non-null tpye이고, default value가 없는데 client에서 필드를 넘겨주지 않으면,
 * 2. non-null tpye이고, default value가 있는데 client에서 null을 넘기면 아래 오류가 남.
 * JSON property name due to missing (therefore NULL) value for creator parameter name which is a non-nullable type
 * */
data class DTO(val name: String?)

/**
 * deserialize from (request body)
 * {n: "name"}
 *
 * serialize to (response body)
 * {n: "name"}
 * */
data class DTO2(@JsonProperty("n") val name: String?)

/**
 * deserialize from (request body)
 * {n: "name"}
 *
 * serialize to (response body)
 * {names: "name"}
 * */
class DTO3(name: String?) {
    var name = name
        @JsonProperty(value = "names", access = JsonProperty.Access.READ_ONLY) get
        @JsonProperty(value = "n", access = JsonProperty.Access.WRITE_ONLY) set
}
