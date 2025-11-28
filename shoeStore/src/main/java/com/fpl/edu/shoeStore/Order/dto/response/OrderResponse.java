package com.fpl.edu.shoeStore.Order.dto.response;

import lombok.Builder;
import lombok.Data;

import java.time.LocalDateTime;

@Data
@Builder
public class OrderResponse {
    private Long orderId;
    private Long userId;
    private Double totalPrice;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
