package com.security.spring.repository

import com.security.spring.entity.Customers
import org.springframework.data.repository.CrudRepository

interface CustomerRepository : CrudRepository<Customers, String> {
    fun findCustomersByName(name: String): Customers = findCustomersByName(name)
}
