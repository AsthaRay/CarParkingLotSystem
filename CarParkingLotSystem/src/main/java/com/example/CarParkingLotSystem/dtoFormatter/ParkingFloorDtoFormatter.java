package com.example.CarParkingLotSystem.dtoFormatter;

import com.example.CarParkingLotSystem.dtos.ParkingFloorDto;
import com.example.CarParkingLotSystem.dtos.ParkingLotDto;
import com.example.CarParkingLotSystem.model.ParkingLot;
import com.example.CarParkingLotSystem.model.ParkingLotFloors;

public class ParkingFloorDtoFormatter {

    public static ParkingFloorDto toParkingFloorDto(ParkingLotFloors parkingLotFloorsEntity){
        ParkingFloorDto parkingFloorDto = new ParkingFloorDto();
        parkingFloorDto.setId(parkingLotFloorsEntity.getId());
        parkingFloorDto.setFloorNo(parkingLotFloorsEntity.getFloorNo());
        parkingFloorDto.setSpots(parkingLotFloorsEntity.getSpots());
        return parkingFloorDto;
    }

    public static ParkingLotFloors toParkingFloorEntity(ParkingFloorDto parkingFloorDto){
        ParkingLotFloors parkingLotFloors = new ParkingLotFloors();
        parkingLotFloors.setId(parkingFloorDto.getId());
        parkingLotFloors.setFloorNo(parkingFloorDto.getFloorNo());
        parkingLotFloors.setSpots(parkingFloorDto.getSpots());
        return parkingLotFloors;
    }
}
