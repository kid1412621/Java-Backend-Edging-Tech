package com.example.demo.ctrlr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.reactive.function.server.RouterFunction;
import org.springframework.web.reactive.function.server.RouterFunctions;
import org.springframework.web.reactive.function.server.ServerResponse;

@Configuration
public class Route {

    @Autowired
    private ReactCtrlr reactCtrlr;

    @Bean
    public RouterFunction routerFunctionA() {
        RouterFunction<ServerResponse> router =
                RouterFunctions.route()
                        .POST("/all", req -> reactCtrlr.getAll(req))
                        .GET("/one", req -> reactCtrlr.getOne(req))
                        .build();
        return router;
    }
}
