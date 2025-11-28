package com.fpl.edu.shoeStore.Order.dto.request;

import lombok.Data;

@Data
public class OrderRequest {
    private Long userId;
    private Double totalPrice;
}

