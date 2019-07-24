package com.example.demo.controller;

import com.example.demo.dao.UserDao;
import com.example.demo.model.TUser;
import com.example.demo.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.ExampleMatcher;
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
    @Autowired
    private UserService userService;

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


    Mono<ServerResponse> getOneByEmail(ServerRequest req) {
        Optional<TUser> user = userDao.findByEmail(req.queryParam("email").get());
        return ok().body(Mono.just(user.get()), TUser.class);
    }

    Mono<ServerResponse> getOneByUsername(ServerRequest req) {
        Optional<TUser> user = userDao.retrieveByUsername(req.queryParam("username").get());
        return ok().body(Mono.just(user.get()), TUser.class);
    }

    Mono<ServerResponse> updateGenderByUsername(ServerRequest req) {
        int c = userDao.updateGenderForName(Integer.valueOf(req.queryParam("gender").get()),
                req.queryParam("username").get());
        return ok().body(Mono.just(c), Integer.class);

    }

    Mono<ServerResponse> addByUsername(ServerRequest req) {
        userDao.insertUser("username", "12345");
        return ok().build();
    }

    Mono<ServerResponse> find(ServerRequest req) {
        Example<TUser> userExample = Example.of(TUser.builder().username("xXx").gender(1).build(),
                ExampleMatcher.matchingAll().withIgnoreCase());
        Optional<TUser> user = userDao.findOne(userExample);
        return ok().body(Mono.just(user.get()), TUser.class);
    }

    Mono<ServerResponse> testTx(ServerRequest req) {
        userService.editById(100L);
        userService.addTwo(Boolean.valueOf(req.queryParam("isTry").get()));
        userService.editById(99L);
        return ok().build();
    }
}
