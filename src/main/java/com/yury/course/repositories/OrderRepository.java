package com.yury.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yury.course.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {

}
