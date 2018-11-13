package com.kitvision.workflow.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kitvision.workflow.model.User;

public interface UserJpaRepository extends JpaRepository<User, Integer> {

	Optional<User> findByUsername(String username);
}
