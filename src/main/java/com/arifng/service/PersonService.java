package com.arifng.service;

import com.arifng.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Rana on 2019-09-22.
 */
public interface PersonService {
    Flux<Person> findAllPersons();

    Mono<Person> findById(Long id);
}
