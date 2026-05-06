package com.delivery.courierservice.controller;

import com.delivery.courierservice.dto.CourierRequestDto;
import com.delivery.courierservice.dto.CourierResponseDto;
import com.delivery.courierservice.repository.CourierRepository;
import com.delivery.courierservice.service.CourierService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/couriers")
public class CourierController {
    private final CourierService courierService;

    @GetMapping("/availiable")
    public List<CourierResponseDto> getAvailiableCouriers() {
        return courierService.getCouriersAvaliable();
    }
    @GetMapping("/all")
    public List<CourierResponseDto> getAllCouriers() {
        return courierService.getCouriers();
    }
    @PostMapping()
    public void addCourier(@RequestBody CourierRequestDto courierRequestDto) {
        courierService.addCourier(courierRequestDto);
    }

}
