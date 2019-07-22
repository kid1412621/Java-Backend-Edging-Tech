package com.example.demo.controller;

import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

/**
 * it's akin to spring webmvc,
 * but it actually is webflux reactive controller
 */
@RestController
@RequestMapping("/mvc")
public class MVCStyleController {
    @GetMapping(value = "/ok", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
//    @Secured("ROLE_USER")
    public Mono<String> oj8k() {
        return Mono.just("oj8k");
    }


}
