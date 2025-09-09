package com.example.CarParkingLotSystem.model;

import jakarta.persistence.*;
import lombok.Data;

import java.util.List;

@Entity
@Data
public class ParkingLot {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String contractorName;

    @OneToMany(mappedBy = "parkinglot", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ParkingLotFloors> floors;

}
