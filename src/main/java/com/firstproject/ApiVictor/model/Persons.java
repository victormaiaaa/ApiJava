package com.firstproject.ApiVictor.model;

import javax.persistence.*;
import java.util.Objects;

@Entity
public class Persons {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
//    @Column(nullable = false)

//    @Column(nullable = false)
    private String last_name;

//    @Column(nullable = false)
    private String first_name;

//    @Column(nullable = false)
    private int age;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getLastName() {
        return last_name;
    }

    public void setLastName(String lastName) {
        last_name = lastName;
    }

    public String getFirstName() {
        return first_name;
    }

    public void setFirstName(String firstName) {
        first_name = firstName;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Persons people = (Persons) o;
        return Objects.equals(id, people.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
