package com.workcode.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.workcode.model.Position;

public interface PositionRepository extends JpaRepository<Position, Long>{

}
