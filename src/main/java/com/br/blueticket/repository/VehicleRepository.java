package com.br.blueticket.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.blueticket.model.Vehicle;

public interface VehicleRepository extends JpaRepository<Vehicle, Long>{

}
