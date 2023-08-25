package com.bmagario.reactive;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class MergeExample {
    @Test
    public void merge() throws IOException {
        List<Wine> wines1 = JsonMockData.getWines();
        List<Wine> wines2 = JsonMockData.getWines();
        Flux<Wine> flux1 = Flux.fromIterable(wines1);
        Flux<Wine> flux2 = Flux.fromIterable(wines2);

        Flux<Wine> flux = Flux.merge(flux1, flux2);

        flux.subscribe(System.out::println);
    }
}
