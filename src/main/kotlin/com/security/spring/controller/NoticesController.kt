package com.security.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/notices")
class NoticesController {
    @GetMapping
    fun notices(): String = "Here are the notices details from the DB"
}
