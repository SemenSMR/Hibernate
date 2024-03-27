package com.example.hibernate2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;
import java.util.Date;

@Builder
@AllArgsConstructor
@NoArgsConstructor
@Data
@Entity
@Table(schema = "joins")
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Temporal(TemporalType.DATE)
    private Date date;
    @ManyToOne
    @JoinColumn(name = "customer_id", nullable = false)
    private Customers customer;
    @Column(name = "product_name")
    private String productName;

    private BigDecimal amount;
}
