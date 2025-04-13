package com.example.mvcspring2.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@AllArgsConstructor @Getter @Setter @ToString @Builder @NoArgsConstructor
public class Product {
    @Id @GeneratedValue
    private Long id;
    private String name;
    private  double price;
    private int quantity;
}
