package com.dandon.DojosNinjas.repositories;

import com.dandon.DojosNinjas.models.NinjaModel;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NinjaRepository extends JpaRepository<NinjaModel, Long> {
    // Custom database queries can be added here, e.g., find ninjas by dojo
    List<NinjaModel> findByDojoId(Long dojoId);
}