package com.example.hibernate2.controller;

import com.example.hibernate2.HibernateRepository;
import com.example.hibernate2.OrdersRepository;
import com.example.hibernate2.PersonRepository;
import com.example.hibernate2.entity.Persons;
import jakarta.annotation.security.RolesAllowed;
import lombok.AllArgsConstructor;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PreAuthorize;
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
    @Secured("ROLE_READ")
    public List<Persons> getPersons(@RequestParam String city) {
        return personRepository.findByCityOfLiving(city);


    }

    @GetMapping("/products/fetch-product")
    @PreAuthorize("hasRole('ROLE_WRITE') or hasRole('ROLE_DELETE')")
    public List<String> featchProduct(@RequestParam String name) {
        return ordersRepository.findByProductNameByCustomerNameIgnoreCase(name);
    }


    @GetMapping("/persons/age")
    @PreAuthorize("authentication.principal.username == 'admin'")
    public List<Persons> getPersonsAge(@RequestParam int age) {
        return personRepository.findByAgeLessThanOrderByAgeAsc(age);


    }

    @GetMapping("/persons/nameandsurname")
    @Secured("ROLE_READ")
    public List<Persons> getPersonsNameAndSurname(@RequestParam String name, String surname) {
        return personRepository.findByNameAndSurname(name, surname);


    }
}

