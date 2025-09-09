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
        if(parkingLotRequestDto.getName()==null || parkingLotRequestDto.getName().isEmpty()){
            throw new RuntimeException("parkingLot name is mandatory");
        }
        ParkingLot parkingLotEntity = ParkingLotDtoFormatter.toParkingLotEntity(parkingLotRequestDto);
        ParkingLot savedParkingLot = parkingLotRepo.save(parkingLotEntity);
        ParkingLotDto parkingLotResponseDto = ParkingLotDtoFormatter.toParkingLotDto(savedParkingLot);
        return parkingLotResponseDto;
    }

    public ParkingLotDto assignContractor(Long id,ParkingLotDto parkingLotRequestDto){
        ParkingLot parkingLotEntity = parkingLotRepo.findById(id)
                .orElseThrow(() -> new RuntimeException("not Available"));
        parkingLotEntity.setContractorName(parkingLotRequestDto.getContractorName());
        ParkingLot savedParkingLot = parkingLotRepo.save(parkingLotEntity);
        ParkingLotDto parkingLotResponseDto = ParkingLotDtoFormatter.toParkingLotDto(savedParkingLot);
        return parkingLotResponseDto;
    }

}
