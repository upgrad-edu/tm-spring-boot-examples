package com.upgrad.mtb.daos;

import com.upgrad.mtb.beans.Car;
import com.upgrad.mtb.beans.Engine;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EngineDAO extends JpaRepository<Engine,Integer> {
}
