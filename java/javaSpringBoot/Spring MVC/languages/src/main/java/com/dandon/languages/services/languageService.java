package com.dandon.languages.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandon.languages.models.language;
import com.dandon.languages.repositorys.languagerepositorys;

@Service
public class languageService {
    @Autowired
    private languagerepositorys languageRepository;

    public List<language> getAllLanguages() {
        return languageRepository.findAll();
    }

    public Optional<language> getLanguageById(Long id) {
        return languageRepository.findById(id);
    }

    public void saveLanguage(language language) {
        languageRepository.save(language);
    }

    public void deleteLanguage(Long id) {
        languageRepository.deleteById(id);
    }
}
