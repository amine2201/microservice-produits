package com.jaoui.microserviceproduits.dao;

import com.jaoui.microserviceproduits.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
