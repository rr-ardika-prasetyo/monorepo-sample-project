package com.ardikapras.monorepo

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class MonorepoApplication

fun main(args: Array<String>) {
	runApplication<MonorepoApplication>(*args)
}
