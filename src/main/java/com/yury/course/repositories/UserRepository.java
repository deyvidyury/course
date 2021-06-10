package com.yury.course.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.yury.course.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
