package com.bmagario.reactive;

import com.bmagario.models.JsonMockData;
import com.bmagario.models.Sommelier;
import com.bmagario.models.Wine;
import java.io.IOException;
import java.util.List;
import org.junit.jupiter.api.Test;
import reactor.core.publisher.Flux;
import reactor.util.function.Tuple2;

public class ZipExample {

    @Test
    public void zip() throws IOException {
        List<Sommelier> sommeliers = JsonMockData.getSommeliers();
        List<Wine> wines = JsonMockData.getWines();
        Flux<Sommelier> flux1 = Flux.fromIterable(sommeliers);
        Flux<Wine> flux2 = Flux.fromIterable(wines);

        Flux<Tuple2<Sommelier, Wine>> flux = Flux.zip(flux1, flux2);

        flux.subscribe(System.out::println);
    }
}
