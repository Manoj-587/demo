package com.app_development.Healthcare_Appointment_System.repository;

import com.app_development.Healthcare_Appointment_System.entity.Demo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DemoRepository extends JpaRepository< Demo,Long> {
}
