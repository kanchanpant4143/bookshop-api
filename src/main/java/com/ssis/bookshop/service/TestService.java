package com.ssis.bookshop.service;

import reactor.core.publisher.Flux;

import java.time.Duration;
import java.util.Scanner;

public class TestService {

    public static Flux<String> reactiveWordStream() {
        return Flux.just("Hello", "World", "Reactive", "Streams")
                .delayElements(Duration.ofMillis(1000))
                .repeat();
    }

    public static void main(String[] args) {
        reactiveWordStream().subscribe(System.out::println);

        Scanner scanner = new Scanner(System.in);
        scanner.nextLine();
        System.out.println("Finished");  // This line will never be printed because the main thread is blocked by the sleep() call.
    }

}
