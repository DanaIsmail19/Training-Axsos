package com.dandon.saveTravels.repositorys;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.dandon.saveTravels.models.TravelModel;

@Repository
public interface TravelRepositorys extends JpaRepository<TravelModel, Long>  {
 
}


