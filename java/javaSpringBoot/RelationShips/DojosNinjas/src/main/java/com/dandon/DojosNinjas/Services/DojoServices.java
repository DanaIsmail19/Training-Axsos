package com.dandon.DojosNinjas.Services;

import com.dandon.DojosNinjas.models.DojoModel;
import com.dandon.DojosNinjas.repositories.DojoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DojoServices {
    private final DojoRepository dojoRepository;

    
    public DojoServices(DojoRepository dojoRepository) {
        this.dojoRepository = dojoRepository;
    }

    // Save or update a dojo
    public DojoModel saveDojo(DojoModel dojo) {
        return dojoRepository.save(dojo);
    }

    // Find all dojos
    public List<DojoModel> findAllDojos() {
        return dojoRepository.findAll();
    }

    // Find a Dojo by ID
    public Optional<DojoModel> findDojoById(Long id) {
        return dojoRepository.findById(id);
    }

   
}