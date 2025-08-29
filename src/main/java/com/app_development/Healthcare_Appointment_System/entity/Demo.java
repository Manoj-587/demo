package com.app_development.Healthcare_Appointment_System.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Demo {
    @Id
    private Long id;
    private String name;
    private int age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public int getAge() {
        return age;
    }
    public void setAge(int age) {
        this.age = age;
    }
    public Long getId() {

        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }

}
