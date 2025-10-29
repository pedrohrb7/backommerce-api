package com.api.backommerce.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.backommerce.model.Image;

public interface ImageRepository extends JpaRepository<Image, Long> {
    List<Image> findByProductId(Long id);
}
