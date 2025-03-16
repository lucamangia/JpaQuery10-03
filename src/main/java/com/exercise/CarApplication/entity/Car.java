package com.exercise.CarApplication.entity;

import com.exercise.CarApplication.enumeration.CarColor;
import com.exercise.CarApplication.enumeration.CarType;
import jakarta.persistence.*;


@Entity
public class Car {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String modelName;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CarType type;
    @Enumerated(EnumType.STRING)
    @Column(nullable = false)
    private CarColor color;
    private String description;

    public Car() {}

    public Car(String modelName, CarType type, CarColor color, String description) {
        this.modelName = modelName;
        this.type = type;
        this.color = color;
        this.description = description;
    }

    public Long getId() {
        return id;
    }
    public String getModelName() {
        return modelName;
    }
    public CarType getType() {
        return type;
    }
    public CarColor getColor() {
        return color;
    }
    public String getDescription() {
        return description;
    }
    public void setType(CarType type) {
        this.type = type;
    }
}