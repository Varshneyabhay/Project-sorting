package com.epam.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.epam.model.Coordinate;

public interface CoordinateRepository extends JpaRepository<Coordinate, Long>{

}
