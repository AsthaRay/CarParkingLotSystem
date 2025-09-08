package com.example.CarParkingLotSystem.service;

import com.example.CarParkingLotSystem.repository.ParkingLotFloorsRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ParkingLotFloorsService {
    @Autowired
    private ParkingLotFloorsRepo parkingLotFloorsRepo;
}
