package com.bmagario.reactive;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class JustExample {

    @Test
    public void just() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();
        Flux<Sommelier> flux = Flux.just(sommeliers.get(0));

        flux.subscribe(System.out::println);
    }
}