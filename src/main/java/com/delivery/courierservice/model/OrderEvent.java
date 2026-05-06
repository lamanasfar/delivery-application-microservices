package com.delivery.courierservice.model;

import com.delivery.courierservice.enums.OrderStatus;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class OrderEvent {
    private Long orderId;
    private OrderStatus status;
    private Long  courierId;

}