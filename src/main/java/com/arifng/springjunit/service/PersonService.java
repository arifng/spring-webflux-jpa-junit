package com.arifng.springjunit.service;

import com.arifng.springjunit.model.Person;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Rana on 2019-09-22.
 */
public interface PersonService {
    Flux<Person> findAllPersons();

    Mono<Person> findById(Long id);
}
