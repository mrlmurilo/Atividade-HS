package com.mrlmurilo.HSTechnology.repositories;

import com.mrlmurilo.HSTechnology.models.Patient;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PatientsRepo extends JpaRepository<Patient, Long> {

}
