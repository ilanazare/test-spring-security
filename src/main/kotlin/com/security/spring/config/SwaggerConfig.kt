package com.security.spring.config

import org.springframework.context.annotation.Configuration
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer
import springfox.documentation.builders.ApiInfoBuilder
import springfox.documentation.builders.PathSelectors
import springfox.documentation.builders.RequestHandlerSelectors
import springfox.documentation.service.ApiInfo
import springfox.documentation.spi.DocumentationType
import springfox.documentation.spring.web.plugins.Docket

@Configuration
class SwaggerConfig : WebMvcConfigurer {
//    @Bean
//    fun apiV1(): GroupedOpenApi =
//        GroupedOpenApi
//            .builder()
//            .group("v1")
//            .addOpenApiCustomizer {
//                OpenApiCustomizer { it.info(Info().title("gold and pay rest api").version("1")) }
//            }.packagesToScan("com.security.spring.controller")
//            .build()
    fun apiV1(): Docket =
        Docket(DocumentationType.SWAGGER_2)
            .apiInfo(apiInfo())
            .select()
            .apis(RequestHandlerSelectors.basePackage("com.security.spring.controller"))
            .paths(PathSelectors.any())
            .build()

    private fun apiInfo(): ApiInfo =
        ApiInfoBuilder()
            .title("security test")
            .description("test for security test")
            .version("1.0")
            .build()
}
