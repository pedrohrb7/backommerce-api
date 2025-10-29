package com.api.backommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.backommerce.model.Category;

public interface CategoryRepository extends JpaRepository<Category, Long> {
    Category findByName(String name);

    boolean existsByName(String name);
}
