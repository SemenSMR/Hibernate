package com.example.hibernate2.entity;

import jakarta.persistence.Table;
import lombok.*;

import java.io.Serializable;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode
    @Table(schema = "joins")
    public class PersonId implements Serializable {
        private String name;
        private String surname;
        private int age;
    }

