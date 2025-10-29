package com.api.backommerce.data;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.backommerce.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByName(String role);
}
