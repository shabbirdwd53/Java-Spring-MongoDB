package com.dailycodebuffer.example.controller;

import com.dailycodebuffer.example.collection.Person;
import com.dailycodebuffer.example.service.PersonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/person")
public class PersonController {
    @Autowired
    private PersonService personService;

    @PostMapping
    public Person addPerson(@RequestBody Person person) {
            return personService.addPerson(person);
        }

        @GetMapping("/search")
    public List<Person> findPersonByFirstName(@RequestParam("name") String firstName) {
        return personService.findPersonByFirstName(firstName);
    }

    @GetMapping
    public List<Person> findAllPerson() {
        return personService.findAll();
    }

    @GetMapping("/age")
    public List<Person> findByAge(@RequestParam("min") Integer min,
                                  @RequestParam("max") Integer max) {
        return personService.findByAge(min, max);
    }
}
