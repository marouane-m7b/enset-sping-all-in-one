package com.elmakaoui.springmvc.repository;

import com.elmakaoui.springmvc.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
