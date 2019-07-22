package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;

import static org.springframework.http.MediaType.APPLICATION_JSON;
import static org.springframework.web.reactive.function.server.RequestPredicates.accept;

@Configuration
public class WebFluxRoute {

    @Autowired
    private WebFluxController ctrlr1;

    @Bean
    public RouterFunction routerFunction() {
        return RouterFunctions.route()
                .path("/user", builder -> builder
                        .nest(accept(APPLICATION_JSON), nb -> nb
                                .GET("/one/{id}", req -> ctrlr1.getOne(req))
                                .POST("/all", req -> ctrlr1.getAll(req))
                        )
                )
                .build();
    }
}
