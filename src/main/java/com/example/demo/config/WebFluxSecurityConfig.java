package com.example.demo.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.reactive.EnableWebFluxSecurity;
import org.springframework.security.config.web.server.ServerHttpSecurity;
import org.springframework.security.web.server.SecurityWebFilterChain;

//@Configuration
@EnableWebFluxSecurity
@EnableGlobalMethodSecurity(securedEnabled = true, prePostEnabled = true)
public class WebFluxSecurityConfig {


    @Bean
    public SecurityWebFilterChain springSecurityFilterChain(
            ServerHttpSecurity http) {
        http.csrf().disable()
                .authorizeExchange()
//                .pathMatchers("/mvc/**").hasRole("ADMIN")
                .pathMatchers("/**", "/user/**").permitAll()
                .and()
                .httpBasic();
        return http.build();
    }
}
