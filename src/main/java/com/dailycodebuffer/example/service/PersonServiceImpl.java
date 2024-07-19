package com.dailycodebuffer.example.service;

import com.dailycodebuffer.example.collection.Person;
import com.dailycodebuffer.example.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PersonServiceImpl implements PersonService{

    @Autowired
    private PersonRepository personRepository;

    @Override
    public Person addPerson(Person person) {
        return personRepository.save(person);
    }

    @Override
    public List<Person> findPersonByFirstName(String firstName) {
        return personRepository.findByFirstnameStartsWith(firstName);
    }

    @Override
    public List<Person> findAll() {
        return personRepository.findAll();
    }

    @Override
    public List<Person> findByAge(Integer min, Integer max) {
        return personRepository.findPersonByAgeBetween(min,max);
    }
}
