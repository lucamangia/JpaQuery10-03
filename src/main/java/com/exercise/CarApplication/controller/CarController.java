package com.exercise.CarApplication.controller;


import com.exercise.CarApplication.entity.Car;
import com.exercise.CarApplication.enumeration.CarType;
import com.exercise.CarApplication.service.CarService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cars")
public class CarController {
    @Autowired
    private CarService carService;

    @PostMapping
    public Car createCar(@RequestBody Car car) {
        return carService.createCar(car);
    }

    @GetMapping
    public List<Car> getAllCars() {
        return carService.getAllCars();
    }

    @GetMapping("/{id}")
    public Car getCarById(@PathVariable Long id) {
        return carService.getCarById(id).orElseThrow(() -> new RuntimeException("Car not found"));
    }

    @PatchMapping("/{id}")
    public Car updateCarType(@PathVariable Long id, @RequestParam CarType type) {
        if (carService.existsById(id)) {
            throw new RuntimeException("Car not found");
        }
        Car car = carService.getCarById(id).get();
        car.setType(type);
        return carService.createCar(car);
    }

    @DeleteMapping("/{id}")
    public void deleteCar(@PathVariable Long id) {
        if (carService.existsById(id)) {
            throw new RuntimeException("Car not found");
        }
        carService.deleteCarById(id);
    }

    @DeleteMapping
    public void deleteAllCars() {
        carService.deleteAllCars();
    }
}

