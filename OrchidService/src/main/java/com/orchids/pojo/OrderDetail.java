package com.orchids.pojo;

import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.annotation.Id;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.math.BigDecimal;

@Document(collection = "order_details")
@Getter
@Setter
public class OrderDetail {
    @Id
    private String orderDetailId;
    private Order order;
    private Orchid orchid;
    private BigDecimal price;
    private Integer quantity;
}