package com.example.CarParkingLotSystem.service;

import com.example.CarParkingLotSystem.dtoFormatter.ParkingFloorDtoFormatter;
import com.example.CarParkingLotSystem.dtos.ParkingFloorDto;
import com.example.CarParkingLotSystem.dtos.ParkingLotDto;
import com.example.CarParkingLotSystem.model.ParkingLot;
import com.example.CarParkingLotSystem.model.ParkingLotFloors;
import com.example.CarParkingLotSystem.repository.ParkingLotFloorsRepo;
import com.example.CarParkingLotSystem.repository.ParkingLotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotFloorsService {
    @Autowired
    private ParkingLotFloorsRepo parkingLotFloorsRepo;

    @Autowired
    private ParkingLotRepo parkingLotRepo;

    public ParkingFloorDto addParkingFloor(Long id,int noOfFloor,ParkingFloorDto parkingFloorRequestDto){
        ParkingLot parkingLotEntity = parkingLotRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("not Available"));
        ParkingLotFloors parkingLotFloors = ParkingFloorDtoFormatter.toParkingFloorEntity(parkingFloorRequestDto);
        parkingLotFloors.setFloorNo(parkingFloorRequestDto.getFloorNo());
        ParkingLotFloors savedParkingFloor = parkingLotFloorsRepo.save(parkingLotFloors);
        ParkingFloorDto parkingFloorResponseDto = ParkingFloorDtoFormatter.toParkingFloorDto(savedParkingFloor);
        return parkingFloorResponseDto;
    }
}
