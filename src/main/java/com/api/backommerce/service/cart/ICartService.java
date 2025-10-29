package com.api.backommerce.service.cart;

import java.math.BigDecimal;

import com.api.backommerce.model.Cart;
import com.api.backommerce.model.User;

public interface ICartService {
    Cart getCart(Long id);

    void clearCart(Long id);

    BigDecimal getTotalPrice(Long id);

    Cart initializeNewCart(User user);

    Cart getCartByUserId(Long userId);
}
