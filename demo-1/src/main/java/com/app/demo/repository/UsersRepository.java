package com.app.demo.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.app.demo.model.Category;
import com.app.demo.model.Users;

public interface UsersRepository extends JpaRepository<Users, Long> {
	Category findByName(String name);
}
