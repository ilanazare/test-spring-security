package com.security.spring.entity

import jakarta.persistence.Column
import jakarta.persistence.Entity
import jakarta.persistence.Id
import jakarta.persistence.Table
import lombok.Data

@Entity
@Table(name = "customers")
@Data
data class Customers(
    @Id
    @Column(name = "name", unique = true)
    val name: String,
    val email: String,
    val pwd: String,
    @Column(name = "role")
    val role: String,
)
