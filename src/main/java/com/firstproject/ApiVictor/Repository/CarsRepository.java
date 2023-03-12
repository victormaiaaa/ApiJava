package com.firstproject.ApiVictor.Repository;

import com.firstproject.ApiVictor.model.Cars;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CarsRepository extends JpaRepository<Cars, String> {
    Cars findByPlate(String plate);
}
