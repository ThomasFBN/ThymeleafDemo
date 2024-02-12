package com.example.demo;

import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;
@Repository
public class PersonRepository {
    Person person1 = new Person("Jens", 23);
    Person person2 = new Person("Joakim", 42);
    Person person3 = new Person("Thomas", 16);
    Person person4 = new Person("August", 13);
    List<Person> personListe = new ArrayList<>(List.of(person1, person2, person3, person4));

    public List<Person> findAll(){
        return personListe;

    }

}
