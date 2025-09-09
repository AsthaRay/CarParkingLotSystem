package com.example.CarParkingLotSystem.dtos;

import com.example.CarParkingLotSystem.model.ParkingSpot;
import jakarta.persistence.CascadeType;
import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class ParkingFloorDto {

    private Long id;
    private String floorNo;
    private List<ParkingSpot> spots;

}
