package com.fpl.edu.shoeStore.Order.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

import java.time.LocalDateTime;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "order")

public class Order {
    @Id
    private Long orderId;
    private Long userId;
    private Double totalPrice;
    private String status;
    private LocalDateTime createdAt;
    private LocalDateTime updatedAt;
}
