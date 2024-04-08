package com.example.hibernate2.controller;

import com.example.hibernate2.HibernateRepository;
import com.example.hibernate2.OrdersRepository;
import com.example.hibernate2.PersonRepository;
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
    private final PersonRepository personRepository;
    private final OrdersRepository ordersRepository;


    @GetMapping("/persons/by-city")

    public List<Persons> getPersons(@RequestParam String city) {
        return personRepository.findByCityOfLiving(city);


    }

    @GetMapping("/products/fetch-product")
    public List<String> featchProduct(@RequestParam String name) {
        return ordersRepository.findByProductNameByCustomerNameIgnoreCase(name);
    }


    @GetMapping("/persons/age")
    public List<Persons> getPersonsAge(@RequestParam int age) {
        return personRepository.findByAgeLessThanOrderByAgeAsc(age);


    }

    @GetMapping("/persons/nameandsurname")

    public List<Persons> getPersonsNameAndSurname(@RequestParam String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);


    }
}

