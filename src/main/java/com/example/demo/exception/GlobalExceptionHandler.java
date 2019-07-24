package com.example.demo.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@ControllerAdvice
public class GlobalExceptionHandler {
    /**
     * handle app exception
     */
    @ExceptionHandler(ApplicationException.class)
    public Mono<ServerResponse> handleApplicationException(Exception ex) {
        // do something
        return ok().build();
    }

    /**
     * handle other exception
     */
    @ExceptionHandler(Exception.class)
    public Mono<ServerResponse> handleException(Exception ex) {
        ex.printStackTrace();
        // do something
        return ok().build();
    }
}
