package com.example.CarParkingLotSystem.repository;

import com.example.CarParkingLotSystem.model.ParkingSpotArea;
import com.example.CarParkingLotSystem.service.ParkingSpotAreaService;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingSpotAreaRepo extends JpaRepository<ParkingSpotArea,Long> {
}
