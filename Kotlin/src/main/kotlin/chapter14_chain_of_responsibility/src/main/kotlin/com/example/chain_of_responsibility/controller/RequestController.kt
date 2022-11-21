package com.example.chain_of_responsibility.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.RestController

@RestController
class RequestController {
    @GetMapping("/request")
    fun handleRequest(
        @RequestParam msg: String,
        @RequestParam userId: Long,
    ): String {
        return "ok"
    }
}