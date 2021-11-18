package com.demo.repositary;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.Airport;
@Repository
public interface AirportRepositary extends JpaRepository<Airport, String> {

}
