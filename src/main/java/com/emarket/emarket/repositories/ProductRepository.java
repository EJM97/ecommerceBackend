package com.emarket.emarket.repositories;


import com.emarket.emarket.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
//    Optional<List<Product>> getAll(); //SQL generated based on method name and parameters

}