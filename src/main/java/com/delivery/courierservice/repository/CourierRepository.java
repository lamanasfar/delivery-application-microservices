package com.delivery.courierservice.repository;

import com.delivery.courierservice.entity.CourierEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CourierRepository extends JpaRepository<CourierEntity,Long> {
}
