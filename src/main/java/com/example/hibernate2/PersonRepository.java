package com.example.hibernate2;

import com.example.hibernate2.entity.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PersonRepository extends JpaRepository<Persons, Long> {
    @Query("SELECT p FROM Persons p WHERE p.cityOfLiving = :city")
    List<Persons> findByCityOfLiving(String city);
    @Query("SELECT p FROM Persons p WHERE p.age < :age ORDER BY p.age ASC")
    List<Persons> findByAgeLessThanOrderByAgeAsc(int age);
    @Query("SELECT p FROM Persons p WHERE p.name = :name AND p.surname = :surname")
    List<Persons> findByNameAndSurname(String name, String surname);


}
