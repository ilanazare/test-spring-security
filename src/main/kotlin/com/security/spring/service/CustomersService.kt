package com.security.spring.service

import com.security.spring.entity.Customers
import com.security.spring.repository.CustomerRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.stereotype.Service

@Service
class CustomersService(
    @Autowired
    val customerRepository: CustomerRepository,
) {
    fun create(request: Customers): Customers = customerRepository.save(request)
}
