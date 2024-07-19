package com.dailycodebuffer.example.service;

import com.dailycodebuffer.example.collection.Person;

import java.util.List;

public interface PersonService {
    Person addPerson(Person person);

    List<Person> findPersonByFirstName(String firstName);

    List<Person> findAll();

    List<Person> findByAge(Integer min, Integer max);
}
