package com.example.traveltek_tech_test.repositories;

import com.example.traveltek_tech_test.models.Flight;
import org.springframework.data.jpa.repository.JpaRepository;

public interface FlightRepository extends JpaRepository<Flight, Long> {
}
