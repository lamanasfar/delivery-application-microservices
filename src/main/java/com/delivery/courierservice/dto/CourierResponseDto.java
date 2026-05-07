package com.delivery.courierservice.dto;

import com.delivery.courierservice.enums.CourierStatus;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourierResponseDto {
    private Long courierId;
    private String courierName;
    private CourierStatus courierStatus;
}
