package com.example.CarParkingLotSystem.service;

import com.example.CarParkingLotSystem.dtoFormatter.ParkingLotDtoFormatter;
import com.example.CarParkingLotSystem.dtos.ParkingLotDto;
import com.example.CarParkingLotSystem.model.ParkingLot;
import com.example.CarParkingLotSystem.repository.ParkingLotRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

@Service
public class ParkingLotService {
    @Autowired
    private ParkingLotRepo parkingLotRepo;

    public ParkingLotDto createParkingLot( ParkingLotDto parkingLotRequestDto){
        ParkingLot parkingLotEntity = ParkingLotDtoFormatter.toParkingLotEntity(parkingLotRequestDto);
        ParkingLot savedParkingLot = parkingLotRepo.save(parkingLotEntity);
        ParkingLotDto parkingLotResponseDto = ParkingLotDtoFormatter.toParkingLotDto(savedParkingLot);
        if(parkingLotResponseDto.getName()==null || parkingLotResponseDto.getName().isEmpty()){
            throw new RuntimeException("parkingLot name is mandatory");
        }
        return parkingLotResponseDto;
    }

}
