package com.example.CarParkingLotSystem.repository;

import com.example.CarParkingLotSystem.model.ParkingLot;
import com.example.CarParkingLotSystem.model.ParkingLotFloors;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ParkingLotFloorsRepo extends JpaRepository<ParkingLotFloors,Long> {
}
