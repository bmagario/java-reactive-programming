package com.bmagario.reactive;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class ConcatExample {
    @Test
    public void concat() throws IOException {
        List<Sommelier> sommeliers1 = JsonMockData.getSommeliers();
        List<Sommelier> sommeliers2 = JsonMockData.getSommeliers();
        Flux<Sommelier> flux1 = Flux.fromIterable(sommeliers1);
        Flux<Sommelier> flux2 = Flux.fromIterable(sommeliers2);

        Flux<Sommelier> flux = Flux.concat(flux1, flux2);

        flux.subscribe(System.out::println);
    }
}
