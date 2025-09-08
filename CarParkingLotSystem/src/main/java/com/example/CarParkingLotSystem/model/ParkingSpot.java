package com.example.CarParkingLotSystem.model;

import jakarta.persistence.*;
import lombok.Data;

@Entity
@Data
public class ParkingSpot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    @JoinColumn(name = "floor_id")
    private ParkingLotFloors parkingFloor;
}
