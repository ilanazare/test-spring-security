package com.security.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/loans")
class LoansController {
    @GetMapping
    fun loans(): String = "Here are the loans details from the DB"
}
