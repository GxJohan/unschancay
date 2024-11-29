package com.chancay.chancay.repository;

import com.chancay.chancay.model.Trabajador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TrabajadorRepository extends JpaRepository <Trabajador, Integer> {
    
}
