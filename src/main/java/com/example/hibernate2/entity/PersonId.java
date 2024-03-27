package com.example.hibernate2.entity;

import lombok.*;

import java.io.Serializable;

    @NoArgsConstructor
    @AllArgsConstructor
    @Getter
    @Setter
    @EqualsAndHashCode
    public class PersonId implements Serializable {
        private String name;
        private String surname;
        private int age;
    }

