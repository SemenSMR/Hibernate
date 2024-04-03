package com.example.hibernate2;

import com.example.hibernate2.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Persons,Long> {
    List<Persons> findByCityOfLiving(String city);
    List<Persons> findByAgeLessThanOrderByAgeAsc(int age);

    List<Persons>  findByNameAndSurname(String name, String surname);



}
