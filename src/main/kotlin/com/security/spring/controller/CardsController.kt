package com.security.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/cards")
class CardsController {
    @GetMapping
    fun cards(): String = "Here are the card details from the DB"
}
