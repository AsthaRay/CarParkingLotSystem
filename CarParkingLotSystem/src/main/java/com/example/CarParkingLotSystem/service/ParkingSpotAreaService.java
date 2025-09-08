package com.example.CarParkingLotSystem.service;

import com.example.CarParkingLotSystem.repository.ParkingSpotAreaRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingSpotAreaService {
    @Autowired
    private ParkingSpotAreaRepo parkingSpotAreaRepo;
}
