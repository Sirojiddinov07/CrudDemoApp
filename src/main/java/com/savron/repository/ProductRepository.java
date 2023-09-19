package com.savron.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.savron.entity.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
    Product findByName(String name);

}
