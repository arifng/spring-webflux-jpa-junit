package com.arifng.springjunit.controller;

import com.arifng.springjunit.model.Person;
import com.arifng.springjunit.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * Created by Rana on 2019-09-22.
 */
@RestController
public class PersonController {
    @Autowired
    private PersonService personService;

    @GetMapping("/persons")
    public Flux<Person> getAllPerson() {
        return personService.findAllPersons();
    }

    @GetMapping("/persons/{id}")
    public Mono<Person> getPersonById(@PathVariable(value = "id") Long id) {
        return personService.findById(id);
    }
}
