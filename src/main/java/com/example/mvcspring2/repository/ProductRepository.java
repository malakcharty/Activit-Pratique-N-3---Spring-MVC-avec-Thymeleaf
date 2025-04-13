package com.example.mvcspring2.repository;

import com.example.mvcspring2.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product,Long> {

}
