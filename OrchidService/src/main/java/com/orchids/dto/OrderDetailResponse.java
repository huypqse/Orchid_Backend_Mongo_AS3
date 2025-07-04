package com.orchids.dto;

import lombok.Data;

@Data
public class OrderDetailResponse {
    private String id;
    private String productId; // or orchidId, depending on your model
    private String orchidName;
    private String orchidUrl;
    private Integer quantity;
    private Double price;
}