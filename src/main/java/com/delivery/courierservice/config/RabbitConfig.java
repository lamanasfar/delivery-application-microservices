package com.delivery.courierservice.config;

import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitConfig {
    public static final String ORDER_QUEUE = "order_queue";



    @Bean
    public Queue orderQueue() {
        return new Queue(ORDER_QUEUE);
    }
}