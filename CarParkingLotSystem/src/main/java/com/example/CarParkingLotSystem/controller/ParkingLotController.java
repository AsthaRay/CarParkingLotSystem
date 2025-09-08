package com.example.CarParkingLotSystem.controller;

import com.example.CarParkingLotSystem.dtos.ParkingLotDto;
import com.example.CarParkingLotSystem.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/parkingLot")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping
    public ParkingLotDto createParkingLot(@RequestBody ParkingLotDto parkingLotDto){
        ParkingLotDto parkingLotDto1 = new ParkingLotDto();
        return parkingLotService.createParkingLot(parkingLotDto1);
    }

}
