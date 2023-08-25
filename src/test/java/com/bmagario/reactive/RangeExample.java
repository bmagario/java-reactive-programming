package com.bmagario.reactive;

import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class RangeExample {

    @Test
    public void range() {
        Flux<Integer> flux = Flux.range(1, 10);

        flux.subscribe(number -> System.out.println(number));
    }
}
