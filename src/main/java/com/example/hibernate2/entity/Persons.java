package com.example.hibernate2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(schema = "joins")
@IdClass(PersonId.class)
public class Persons {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    @Column(name = "phone_number")
    private String phoneNumber;
    @Column(name = "city_of_living")
    private String cityOfLiving;

}
