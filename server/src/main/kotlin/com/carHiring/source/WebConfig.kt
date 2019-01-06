package com.carHiring.source

import org.springframework.boot.autoconfigure.*;
import org.springframework.context.annotation.*;

@Configuration
class WebConfig {

    @Bean
    fun webServerFactory() : CongirurableServletWebServerFactory {
        val factory = TomcatServletServerFactory()
        factory.errorPages.add(ErrorPage(HttpStatus.NOT_FOUND, "/"))
        return factory
    }
}