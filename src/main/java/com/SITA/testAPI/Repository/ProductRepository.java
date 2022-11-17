package com.SITA.testAPI.Repository;

import com.SITA.testAPI.Entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Integer> {
}