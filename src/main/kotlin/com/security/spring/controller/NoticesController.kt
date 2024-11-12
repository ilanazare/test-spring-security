package com.security.spring.controller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/welcome")
class NoticesController  {
    @GetMapping
    fun notices(): String = "Welcome to Spring Application with security"
}
