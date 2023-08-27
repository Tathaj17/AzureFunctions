package com.example;

import java.util.logging.Logger;

import org.junit.jupiter.api.Test;
import org.springframework.cloud.function.adapter.azure.FunctionInvoker;

import com.example.model.Greeting;
import com.example.model.TokenDetail;
import com.microsoft.azure.functions.ExecutionContext;

import reactor.core.publisher.Mono;

public class HelloTest {

    @Test
    public void test() {
        Mono<Greeting> result = new Hello().apply(Mono.just(new TokenDetail("foo")));
       // assertThat(result.block().getMessage()).isEqualTo("Hello, foo!\n");
    }

    @Test
    public void start() {
        FunctionInvoker<TokenDetail, Greeting> handler = new FunctionInvoker<>(
                Hello.class);
        Greeting result = handler.handleRequest(new TokenDetail("foo"), new ExecutionContext() {
            @Override
            public Logger getLogger() {
                return Logger.getLogger(HelloTest.class.getName());
            }

            @Override
            public String getInvocationId() {
                return "id1";
            }

            @Override
            public String getFunctionName() {
                return "hello";
            }
        });
        handler.close();
       // assertThat(result.getMessage()).isEqualTo("token, foo!\n");
    }
}
