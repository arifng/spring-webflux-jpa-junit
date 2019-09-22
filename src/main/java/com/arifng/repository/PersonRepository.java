package com.arifng.repository;

import com.arifng.model.Person;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 * Created by Rana on 2019-09-22.
 */
@Repository
public interface PersonRepository extends JpaRepository<Person, Long> {
}
