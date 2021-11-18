package com.demo.repositary;

import java.math.BigInteger;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.demo.pojo.ScheduleFlight;

@Repository
public interface ScheduleFlightRepository extends JpaRepository<ScheduleFlight, BigInteger> {

}
