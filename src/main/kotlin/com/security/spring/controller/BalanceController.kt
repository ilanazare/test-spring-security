package com.security.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/balance")
class BalanceController {
    @GetMapping
    fun balance(): String = "Here are the balance details from the DB"
}
