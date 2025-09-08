package com.example.CarParkingLotSystem.dtoFormatter;

import com.example.CarParkingLotSystem.dtos.ParkingLotDto;
import com.example.CarParkingLotSystem.model.ParkingLot;

public class ParkingLotDtoFormatter {

    public static ParkingLotDto toParkingLotDto(ParkingLot parkingLotEntity) {
        ParkingLotDto parkingLotDto = new ParkingLotDto();
        parkingLotDto.setId(parkingLotEntity.getId());
        parkingLotDto.setName(parkingLotEntity.getName());
        parkingLotDto.setContractorName(parkingLotEntity.getContractorName());
        return parkingLotDto;
    }

    public static ParkingLot toParkingLotEntity(ParkingLotDto parkingLotDto) {
        ParkingLot parkingLotEntity = new ParkingLot();
        parkingLotEntity.setId(parkingLotDto.getId());
        parkingLotEntity.setName(parkingLotDto.getName());
        parkingLotEntity.setContractorName(parkingLotDto.getContractorName());
        return parkingLotEntity;
    }
}
