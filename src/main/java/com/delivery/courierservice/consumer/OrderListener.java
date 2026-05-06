package com.delivery.courierservice.consumer;

import com.delivery.courierservice.enums.CourierStatus;
import com.delivery.courierservice.enums.OrderStatus;
import com.delivery.courierservice.model.OrderEvent;
import com.delivery.courierservice.service.CourierService;
import lombok.RequiredArgsConstructor;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class OrderListener {
    public final CourierService courierService;


    @RabbitListener(queues = "order_queue")
    public void receiveOrder(OrderEvent orderEvent) {
        System.out.println("Received Order Event: " + orderEvent);

        if(OrderStatus.ASSIGNED.equals(orderEvent.getStatus())){
            courierService.updateCourierStatus( CourierStatus.BUSY,orderEvent.getCourierId());

        }
    }
}
