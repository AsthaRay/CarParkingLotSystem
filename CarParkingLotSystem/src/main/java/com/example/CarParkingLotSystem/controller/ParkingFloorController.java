package com.example.CarParkingLotSystem.controller;

import com.example.CarParkingLotSystem.dtos.ParkingFloorDto;
import com.example.CarParkingLotSystem.dtos.ParkingLotDto;
import com.example.CarParkingLotSystem.service.ParkingLotFloorsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/parkingFloor")
public class ParkingFloorController {

     @Autowired
     private ParkingLotFloorsService parkingLotFloorsService;

    @PostMapping("/addParkingFloor/{id}/{noOfFloors}")
    public ParkingFloorDto addParkingFloor(@PathVariable Long id,@PathVariable int noOfFloors, @RequestBody ParkingFloorDto parkingFloorDto){
        return parkingLotFloorsService.addParkingFloor(id,noOfFloors,parkingFloorDto);
    }
}
