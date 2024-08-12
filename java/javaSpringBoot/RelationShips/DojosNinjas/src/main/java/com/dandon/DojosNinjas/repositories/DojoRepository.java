package com.dandon.DojosNinjas.repositories;

import com.dandon.DojosNinjas.models.DojoModel;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface DojoRepository extends JpaRepository<DojoModel, Long> {
    // Custom database queries can be added here
}