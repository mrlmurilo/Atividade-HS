package com.mrlmurilo.HSTechnology.repositories;

import com.mrlmurilo.HSTechnology.models.Login;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoginRepo extends JpaRepository<Login, Long>{
    
}
