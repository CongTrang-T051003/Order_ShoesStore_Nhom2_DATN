package com.fpl.edu.shoeStore.Order.convert;

import com.fpl.edu.shoeStore.Order.dto.request.OrderRequest;
import com.fpl.edu.shoeStore.Order.dto.response.OrderResponse;
import com.fpl.edu.shoeStore.Order.entity.Order;
import org.springframework.stereotype.Component;

import java.time.LocalDateTime;

@Component
public class OrderConvert {

    public Order toEntity(OrderRequest request) {
        return Order.builder()
                .userId(request.getUserId())
                .totalPrice(request.getTotalPrice())
                .status("PENDING")
                .createdAt(LocalDateTime.now())
                .updatedAt(LocalDateTime.now())
                .build();
    }

    public OrderResponse toResponse(Order order) {
        return OrderResponse.builder()
                .orderId(order.getOrderId())
                .userId(order.getUserId())
                .totalPrice(order.getTotalPrice())
                .status(order.getStatus())
                .createdAt(order.getCreatedAt())
                .updatedAt(order.getUpdatedAt())
                .build();
    }
}
