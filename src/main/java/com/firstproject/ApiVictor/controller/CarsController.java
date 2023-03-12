package com.firstproject.ApiVictor.controller;

import com.firstproject.ApiVictor.Repository.CarsRepository;
import com.firstproject.ApiVictor.model.Cars;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/cars")
public class CarsController {

    @Autowired
    private CarsRepository carsRepository;

    @PostMapping
    public Cars createCar (@RequestBody Cars cars) {
        return carsRepository.save(cars);
    }

    @GetMapping
    public List<Cars> listAllCars () {
        return carsRepository.findAll();
    }

    @GetMapping("/{plate}")
    public Cars listAllCars (@PathVariable String plate) {
        return carsRepository.findByPlate(plate);
    }
}
