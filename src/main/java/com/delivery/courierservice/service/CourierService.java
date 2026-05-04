package com.delivery.courierservice.service;


import com.delivery.courierservice.dto.CourierRequestDto;
import com.delivery.courierservice.dto.CourierResponseDto;
import com.delivery.courierservice.enums.CourierStatus;
import com.delivery.courierservice.mapper.CourierMapper;
import com.delivery.courierservice.repository.CourierRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CourierService {
    private final CourierRepository courierRepository;
    public void addCourier(CourierRequestDto courierRequestDto) {
        courierRepository.save(CourierMapper.mapToCourierToEntity(courierRequestDto));
    }


    public List<CourierResponseDto> getCouriersAvaliable() {
        return courierRepository.findAll()
                .stream()
                .filter(couriers ->couriers.getCourierStatus().equals(CourierStatus.FREE))
                .map(courier ->CourierMapper.mapToCourierToDto(courier))
                .toList();

    }
    public List<CourierResponseDto> getCouriers() {
        return courierRepository.findAll()
                .stream()
                .map(courier ->CourierMapper.mapToCourierToDto(courier))
                .toList();
    }
}
