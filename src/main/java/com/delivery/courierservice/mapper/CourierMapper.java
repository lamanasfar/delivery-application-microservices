package com.delivery.courierservice.mapper;

import com.delivery.courierservice.dto.CourierRequestDto;
import com.delivery.courierservice.dto.CourierResponseDto;
import com.delivery.courierservice.entity.CourierEntity;
import com.delivery.courierservice.service.CourierService;

public class CourierMapper {
    public static CourierEntity mapToCourierToEntity(CourierRequestDto courierRequestDto){
        CourierEntity courierEntity = new CourierEntity();
        courierEntity.setCourierName(courierRequestDto.getCourierName());
        courierEntity.setCourierStatus(courierRequestDto.getCourierStatus());
        return courierEntity;

    }
    public static CourierResponseDto mapToCourierToDto(CourierEntity courierEntity){
        CourierResponseDto courierResponseDto = new CourierResponseDto();
        courierResponseDto.setCourierId(courierEntity.getCourierId());
        courierResponseDto.setCourierName(courierEntity.getCourierName());
        courierResponseDto.setCourierStatus(courierEntity.getCourierStatus());
        return courierResponseDto;
    }
}
