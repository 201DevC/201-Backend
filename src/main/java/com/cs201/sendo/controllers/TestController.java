package com.cs201.sendo.controllers;

import com.cs201.sendo.models.Person;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/test")
public class TestController {

    @GetMapping
    public Person getTestString() {
        Person person = new Person();
        person.setName("Chau Van Cuong");
        return person;
    }
}
