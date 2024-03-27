package com.example.hibernate2;

import com.example.hibernate2.entity.Persons;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository

public class HibernateRepository {
    @PersistenceContext
    private EntityManager entityManager;


    public List<Persons> getPersons(String city) {
        return entityManager.createQuery("select p from Persons p where p.city_of_living =" +
                ":city order by p.city_of_living", Persons.class).setParameter("city", city).getResultList();

    }

    public List<Persons> getProductName(String name) {
        String jpql = "SELECT o.productName FROM Orders o " +
                "JOIN o.customer c " +
                "WHERE LOWER(c.name) = LOWER(:name)";
        return entityManager.createQuery(jpql, Persons.class)
                .setParameter("name", name)
                .getResultList();
    }
}
