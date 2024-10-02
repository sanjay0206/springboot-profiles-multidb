package com.spring.multidatasource.repository;


import com.spring.multidatasource.entity.Flight;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FlightRepository extends JpaRepository<Flight, Long> {
    // Custom query methods if needed
}
