package com.example.demo.ctrlr;

import org.springframework.http.MediaType;
import org.springframework.security.access.annotation.Secured;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

@RestController
@RequestMapping("/t")
public class TstCtrlr {
    @GetMapping(value = "/2", produces = MediaType.APPLICATION_STREAM_JSON_VALUE)
//    @Secured("ROLE_USER")
    public Mono<String> oj8k() {
        return Mono.just("oj8k");
    }


}
