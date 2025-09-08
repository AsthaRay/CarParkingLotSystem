package com.example.CarParkingLotSystem.repository;

import com.example.CarParkingLotSystem.model.ParkingLot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotRepo extends JpaRepository<ParkingLot,Long> {
}
