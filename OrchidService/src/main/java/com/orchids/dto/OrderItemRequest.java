package com.orchids.dto;

import lombok.Data;
import java.time.LocalDateTime;
import java.util.List;

@Data
public class OrderItemRequest {
    private String orchidId;
    private LocalDateTime orderDate;
    private String orderStatus;
    private Double price;
    private Integer quantity;
    private String accountId;
    private List<OrderDetailRequest> orderDetails;
}