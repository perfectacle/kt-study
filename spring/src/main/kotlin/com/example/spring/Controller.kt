package com.example.spring

import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RestController
import javax.validation.Valid

@RestController
class Controller {
    @PostMapping
    fun test(@RequestBody @Valid requestBody: DTO3): DTO3 {
        println()
        return requestBody
    }

    @PostMapping("/date")
    fun test2(@RequestBody requestBody: LocalDateTimeDTO): LocalDateTimeDTO {
        println()
        return requestBody
    }

    @PostMapping("/zoned")
    fun test3(@RequestBody requestBody: ZonedDateTimeDTO3): ZonedDateTimeDTO3 {
        println()
        return requestBody
    }
}