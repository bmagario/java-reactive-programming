package com.bmagario.reactive;

import java.time.Duration;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class IntervalExample {

    @Test
    public void interval() {
        Flux<Long> flux = Flux.interval(Duration.ofSeconds(1));

        flux.subscribe(number -> System.out.println(number));
    }
}
