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
                                .GET("/add", req -> ctrlr1.addOne(req))
                                .GET("/one/{id}", req -> ctrlr1.getOne(req))
                                .GET("/oneByEmail", req -> ctrlr1.getOneByEmail(req))
                                .POST("/oneByUsername", req -> ctrlr1.getOneByUsername(req))
                                .GET("/editGenderByUsername", req -> ctrlr1.updateGenderByUsername(req))
                                .GET("/addByUsername", req -> ctrlr1.addByUsername(req))
                                .POST("/all", req -> ctrlr1.getAll(req))
                                .GET("/find", req -> ctrlr1.find(req))
                        )
                )
                .build();
    }
}
