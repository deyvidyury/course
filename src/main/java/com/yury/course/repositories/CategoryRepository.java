package com.yury.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yury.course.entities.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {

}
