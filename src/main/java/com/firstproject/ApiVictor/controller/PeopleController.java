package com.firstproject.ApiVictor.controller;

import com.firstproject.ApiVictor.Repository.PersonRepository;
import com.firstproject.ApiVictor.model.Persons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/person")
public class PeopleController {

    @Autowired
    private PersonRepository personRepository;

    @PostMapping
    private Persons createPeople (@RequestBody Persons persons) {
        return personRepository.save(persons);
    }

    @GetMapping
    private List<Persons> listAllPeople () {
        return personRepository.findAll();
    }

    @GetMapping("/{id}")
    private Optional<Persons> getPeople (@PathVariable Long id) {
            return personRepository.findById(id);
    }
}
