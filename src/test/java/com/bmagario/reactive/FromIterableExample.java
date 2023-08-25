package com.bmagario.reactive;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FromIterableExample {
    @Test
    public void fromIterable() throws IOException {
        List<Wine> wines = JsonMockData.getWines();
        Flux<Wine> flux = Flux.fromIterable(wines);

        flux.subscribe(System.out::println);
    }
}
