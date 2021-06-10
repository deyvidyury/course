package com.yury.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yury.course.entities.OrderItem;

public interface OrderItemRepository extends JpaRepository<OrderItem, Long> {

}
