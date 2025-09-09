package com.example.CarParkingLotSystem.controller;

import com.example.CarParkingLotSystem.dtos.ParkingLotDto;
import com.example.CarParkingLotSystem.service.ParkingLotService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parkingLot")
public class ParkingLotController {

    @Autowired
    private ParkingLotService parkingLotService;

    @PostMapping("/createParkingLot")
    public ParkingLotDto createParkingLot(@RequestBody ParkingLotDto parkingLotDto){
        return parkingLotService.createParkingLot(parkingLotDto);
    }

    @PostMapping("/assignContractor/{id}")
    public ParkingLotDto assignContractor(@PathVariable Long id, @RequestBody ParkingLotDto parkingLotDto){
        return parkingLotService.assignContractor(id,parkingLotDto);
    }

}
