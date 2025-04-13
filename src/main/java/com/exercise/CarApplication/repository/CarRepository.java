package com.exercise.CarApplication.repository;

import com.exercise.CarApplication.entity.Car;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;

@Repository
public interface CarRepository extends JpaRepository<Car, Long> {
    Page<Car> findAll(Pageable pageable);
}
