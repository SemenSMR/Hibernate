package com.example.hibernate2.controller;

import com.example.hibernate2.HibernateRepository;
import com.example.hibernate2.entity.Persons;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@AllArgsConstructor
@RestController
public class HibernetController {

    private final HibernateRepository hibernateRepository;


    @GetMapping("persons/by-city")
    public List<Persons> getPersons(@RequestParam String city){
        return hibernateRepository.getPersons(city);

    }
}
