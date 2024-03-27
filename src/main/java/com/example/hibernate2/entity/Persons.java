package com.example.hibernate2.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "joins")
public class Persons {
    @Id
    private String name;
    @Id
    private String surname;
    @Id
    private int age;
    @Column(name = "phone_number")
    private String phone_number;
    @Column(name = "city_of_living")
    private String city_of_living;

}
