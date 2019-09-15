package com.example.spring

import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.MethodArgumentNotValidException
import org.springframework.web.bind.annotation.ControllerAdvice
import org.springframework.web.bind.annotation.ExceptionHandler


@ControllerAdvice
class GlobalExceptionHandler {
    @ExceptionHandler(MethodArgumentNotValidException::class)
    fun handleValidationException(pe: MethodArgumentNotValidException): ResponseEntity<Map<String, Any?>> {
        val body: Map<String, Any?> = mapOf(
            "rejectedValue" to pe.bindingResult.fieldError?.rejectedValue,
            "message" to pe.bindingResult.fieldError?.defaultMessage
        )
        return ResponseEntity(body, HttpStatus.BAD_REQUEST)
    }
}