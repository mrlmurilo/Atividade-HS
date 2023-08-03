package com.mrlmurilo.HSTechnology.repositories;

import com.mrlmurilo.HSTechnology.models.Exames;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ExamesRepository extends JpaRepository<Exames, Long> {
    List<Exames> findById_patientContaining(Long idPatient);
}
