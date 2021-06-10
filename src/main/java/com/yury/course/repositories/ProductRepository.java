package com.yury.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yury.course.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {

}
