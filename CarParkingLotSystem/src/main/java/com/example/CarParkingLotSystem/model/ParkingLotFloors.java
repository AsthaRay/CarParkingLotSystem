package com.example.CarParkingLotSystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Entity
@Data
public class ParkingLotFloors {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String floorNo;
    @OneToMany(mappedBy = "parkingFloor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ParkingSpot> spots;
    @ManyToOne
    @JoinColumn(name = "parking_id")
    private ParkingLot parkinglot;

}
