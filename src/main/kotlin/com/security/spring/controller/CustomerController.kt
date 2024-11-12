package com.security.spring.controller

import com.security.spring.entity.Customers
import com.security.spring.service.CustomersService
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/customer")
class CustomerController(
    val customersService: CustomersService,
) {
    @PostMapping
    fun create(
        @RequestBody request: Customers,
    ): Customers = customersService.create(request)
}
