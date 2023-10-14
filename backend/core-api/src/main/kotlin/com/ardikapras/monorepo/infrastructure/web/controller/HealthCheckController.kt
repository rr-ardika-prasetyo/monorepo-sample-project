package com.ardikapras.monorepo.infrastructure.web.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api")
class HealthCheckController {
    @GetMapping("/ping")
    fun ping(): Map<String, String> {
        return mapOf("status" to "up")
    }
}
