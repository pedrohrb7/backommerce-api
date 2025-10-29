package com.api.backommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.backommerce.model.User;

public interface UserRepository extends JpaRepository<User, Long> {
    boolean existsByEmail(String email);

    User findByEmail(String email);
}
