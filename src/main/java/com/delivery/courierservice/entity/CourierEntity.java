package com.delivery.courierservice.entity;

import com.delivery.courierservice.enums.CourierStatus;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.stereotype.Repository;

import java.time.LocalDateTime;
import java.util.Date;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Table(name = "couriers")

public class CourierEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "courier_id")
    private Long courierId;

    @Column(name = "courier_name")
    private String courierName;

    @Column(name = "status")
    private CourierStatus courierStatus;


}
