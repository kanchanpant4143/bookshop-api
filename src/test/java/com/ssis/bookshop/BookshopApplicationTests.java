package com.ssis.bookshop;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Scanner;

@SpringBootTest
class BookshopApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void reactiveWordStream() {
        Flux<String> fluxString = Flux.just("Hello", "World", "Reactive", "Streams").concatWithValues("AWS").log();
        fluxString.subscribe(System.out::println);
    }
}
