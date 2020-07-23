package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarDAO extends JpaRepository<Car,Integer> {
}
