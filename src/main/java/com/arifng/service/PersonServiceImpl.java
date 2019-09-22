package com.arifng.service;

import com.arifng.model.Person;
import com.arifng.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;
import reactor.core.scheduler.Scheduler;

/**
 * Created by Rana on 2019-09-22.
 */
@Service
public class PersonServiceImpl implements PersonService {
    @Autowired
    private PersonRepository personRepository;

    @Autowired
    private Scheduler scheduler;

    @Override
    public Flux<Person> findAllPersons() {
        return Flux.defer(() -> Flux.fromIterable(personRepository.findAll()))
                .subscribeOn(scheduler);
    }

    @Override
    public Mono<Person> findById(Long id) {
        return Mono.defer(() -> Mono.justOrEmpty(personRepository.findById(id)))
                .subscribeOn(scheduler);
    }
}
