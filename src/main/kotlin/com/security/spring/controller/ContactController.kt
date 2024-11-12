package com.security.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/contact")
class ContactController {
    @GetMapping
    fun contact(): String = "Inquiry details are saved to the DB"
}
