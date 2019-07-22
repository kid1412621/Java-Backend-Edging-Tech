package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.Optional;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@RestController
public class WebFluxController {
    @Autowired
    private UserDao userDao;

    Mono<ServerResponse> addOne(ServerRequest request) {
        TUser user = userDao.save(TUser.builder().username("haha").email("xxx").mobile("343").gender(1).build());
        return ok().build();
    }

    Mono<ServerResponse> getOne(ServerRequest request) {
        long id = Long.parseLong(request.pathVariable("id"));
//                .orElseThrow(() -> new IllegalArgumentException("参数错误")));
        Optional<TUser> user = userDao.findById(id);
        return ok().body(Mono.just(user.get()), TUser.class);
    }

    Mono<ServerResponse> getAll(ServerRequest request) {
        Page<TUser> users = userDao.findAll(PageRequest.of(0, 5));
        return ok().body(Mono.just(users), Page.class);
    }


}
