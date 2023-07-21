package com.paulomarchon.service;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Mono;

@RestController
public class HomeController {

    @GetMapping("home")
    public Mono<String> home(){
        return Mono.just("Welcome to Home!");
    }

    @GetMapping("fallback")
    public Mono<String> fallBack(){
        return Mono.just("Fallback!");
    }
}
