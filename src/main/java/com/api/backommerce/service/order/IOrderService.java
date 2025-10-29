package com.api.backommerce.service.order;

import java.util.List;

import com.api.backommerce.dto.OrderDto;
import com.api.backommerce.model.Order;

public interface IOrderService {
    Order placeOrder(Long userId);

    OrderDto getOrder(Long orderId);

    List<OrderDto> getUserOrders(Long userId);

    OrderDto convertToDto(Order order);
}
