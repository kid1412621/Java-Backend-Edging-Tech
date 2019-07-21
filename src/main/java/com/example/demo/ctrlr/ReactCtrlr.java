package com.example.demo.ctrlr;

import com.example.demo.dao.UserDao;
import com.example.demo.model.TUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.*;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.server.ServerRequest;
import org.springframework.web.reactive.function.server.ServerResponse;
import reactor.core.publisher.Mono;

import java.util.List;
import java.util.Optional;

import static org.springframework.web.reactive.function.server.ServerResponse.ok;

@RestController
public class ReactCtrlr {
    @Autowired
    private UserDao userDao;

    Mono<ServerResponse> getOne(ServerRequest request) {
        long id = Long.parseLong(request.queryParam("id").orElseThrow(() -> new IllegalArgumentException("参数错误")));
        Optional<TUser> user = userDao.findById(id);
        return ok().body(Mono.just(user.get()), TUser.class);
    }

    Mono<ServerResponse> getAll(ServerRequest request) {
//        long id = Long.parseLong(request.queryParam("id").orElseThrow(() -> new IllegalArgumentException("参数错误")));
        Page<TUser> users = userDao.findAll(PageRequest.of(0, 5), Sort.by(Sort.Direction.ASC, "id"));
        return ok().body(Mono.just(users), Page.class);
    }

    // example 不支持嵌套条件
    Mono<ServerResponse> getWithExample(ServerRequest request) {
        TUser person = TUser.builder().nickName("Fidelity").build();

        ExampleMatcher matcher = ExampleMatcher.matching()
                .withIgnorePaths("lastname")
                .withIncludeNullValues();
        Example<TUser> example = Example.of(person, matcher);
        List<TUser> users = userDao.findAll(example);
        return ok().body(Mono.just(users), List.class);
    }

//    Mono<ServerResponse> getWithSpecification(ServerRequest request) {
//userDao.count()
//        return ok().body(Mono.just(users), Page.class);
//}


}
