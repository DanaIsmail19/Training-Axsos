package com.dandon.saveTravels.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandon.saveTravels.models.TravelModel;
import com.dandon.saveTravels.repositorys.TravelRepositorys;

@Service
public class TravelService {
	@Autowired
	private TravelRepositorys travelRepository;
	
	public TravelModel save(TravelModel travel) {
        return travelRepository.save(travel);
    }
	
	  public List<TravelModel> findAllTravel() {
	        return travelRepository.findAll();
	    }

    public TravelModel findById(Long id) {
        return travelRepository.findById(id).orElse(null);
    }

    public void updateTravel(Long id, TravelModel updatedTravel) {
    	TravelModel existingTravel = travelRepository.findById(id).orElseThrow();
        travelRepository.save(existingTravel);
    }

    public void deleteTravel(Long id) {
        travelRepository.deleteById(id);
    }

}