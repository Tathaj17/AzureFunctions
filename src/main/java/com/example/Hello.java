package com.example;

import java.util.function.Function;

import org.springframework.stereotype.Component;

import com.example.model.Greeting;
import com.example.model.TokenDetail;

import reactor.core.publisher.Mono;

@Component
public class Hello implements Function<Mono<TokenDetail>, Mono<Greeting>> {

    public Mono<Greeting> apply(Mono<TokenDetail> mono) {
        return mono.map(token -> new Greeting("Token Hearder \n" + token.getHeader() + "Token Payload \n"+ token.getPayload()));
    }
}
