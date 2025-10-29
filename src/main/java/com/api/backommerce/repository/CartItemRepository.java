package com.api.backommerce.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.api.backommerce.model.CartItem;

public interface CartItemRepository extends JpaRepository<CartItem, Long> {
    void deleteAllByCartId(Long id);
}
