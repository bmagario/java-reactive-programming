package com.bmagario.reactive;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;

public class FilterExample {
    @Test
    public void filter() throws IOException {
        List<Wine> wines = JsonMockData.getWines();
        Flux<Wine> flux = Flux.fromIterable(wines);

        flux.filter(wine -> wine.getPrice() > 100).subscribe(System.out::println);
    }
}
