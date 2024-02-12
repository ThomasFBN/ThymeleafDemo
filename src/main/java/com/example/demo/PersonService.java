package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.List;
@Service

public class PersonService {
    PersonRepository personRepository;
    public PersonService(PersonRepository personRepository){
        this.personRepository = personRepository;
    }
    public List<Person> findAll(){
        return personRepository.findAll();
    }
}
