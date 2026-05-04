package com.delivery.courierservice.dto;

import com.delivery.courierservice.enums.CourierStatus;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class CourierRequestDto {
    private String courierName;
    //private String courierPhone;
    // private double salary;
    // private LocalDateTime beginingDate;
    private CourierStatus courierStatus;

}
