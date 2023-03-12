package com.firstproject.ApiVictor.Repository;

import com.firstproject.ApiVictor.model.Persons;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PersonRepository extends JpaRepository<Persons, Long> {
}
