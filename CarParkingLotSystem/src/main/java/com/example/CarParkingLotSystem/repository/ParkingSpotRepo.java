package com.example.CarParkingLotSystem.repository;

import com.example.CarParkingLotSystem.model.ParkingSpot;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotRepo extends JpaRepository<ParkingSpot,Long> {
}
