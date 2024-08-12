package com.dandon.DojosNinjas.Services;

import com.dandon.DojosNinjas.models.NinjaModel;
import com.dandon.DojosNinjas.repositories.NinjaRepository;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class NinjaService {
    private final NinjaRepository ninjaRepository;

 
    public NinjaService(NinjaRepository ninjaRepository) {
        this.ninjaRepository = ninjaRepository;
    }

    // Save or update a ninja
    public NinjaModel saveNinja(NinjaModel ninja) {
        return ninjaRepository.save(ninja);
    }

    // Find all ninjas
    public List<NinjaModel> findAllNinjas() {
        return ninjaRepository.findAll();
    }

    // Find ninjas by dojo
    public List<NinjaModel> findNinjasByDojoId(Long dojoId) {
        return ninjaRepository.findByDojoId(dojoId);
    }

}