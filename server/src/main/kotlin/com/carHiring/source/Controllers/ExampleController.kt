package com.carHiring.source.Controlles

import org.springframework.web.bind.annotation.RestController
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.beans.factory.annotation.Autowired

@RestController
class ExampleController @Autowired constructor(private val exampleService: ExampleService) {
    @GetMapping("/api/hello", produces = ["application/json"])
    fun example() = exampleService.getSomeValue()
}