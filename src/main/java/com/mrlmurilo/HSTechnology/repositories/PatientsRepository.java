package com.mrlmurilo.HSTechnology.repositories;

import com.mrlmurilo.HSTechnology.models.Patient;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepository extends JpaRepository<Patient, Long> {
 List<Patient> findByNameContainingIgnoreCase(String name);
}
