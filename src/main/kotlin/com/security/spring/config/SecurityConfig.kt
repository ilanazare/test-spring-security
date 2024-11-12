package com.security.spring.config

import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.security.config.Customizer.withDefaults
import org.springframework.security.config.annotation.web.builders.HttpSecurity
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity
import org.springframework.security.web.SecurityFilterChain

@Configuration
@EnableWebSecurity
class SecurityConfig {
    @Bean
    fun filterChain(http: HttpSecurity): SecurityFilterChain {
        http
            .authorizeHttpRequests { authorize ->
                authorize
                    .requestMatchers(
                        "/v2/api-docs",
                        "/configuration/ui",
                        "/swagger-resources/**",
                        "/configuration/security",
                        "/swagger-ui.html/**",
                        "/webjars/**",
                    ).authenticated()
                    .requestMatchers(
                        "/customer",
                        "/accounts",
                        "/balance",
                        "/loans",
                        "/cards",
                    ).authenticated()
                    .requestMatchers("/notices", "/contact")
                    .permitAll()
            }.formLogin(withDefaults())
            .formLogin(withDefaults())
        return http.build()
    }
}
