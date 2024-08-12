package com.dandon.lookify.services;


import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dandon.lookify.models.lookify;
import com.dandon.lookify.Repository.lookifyRepository;

@Service
public class lookifySevice {

    @Autowired
    private lookifyRepository songRepository;

    public List<lookify> allSongs() { 
        return songRepository.findAll();
    }

    public lookify createSong(lookify s) {
        return songRepository.save(s);
    }

    public lookify findSong(Long id) {
        Optional<lookify> optionalSong = songRepository.findById(id);
        return optionalSong.orElse(null);
    }

    public void deleteSong(Long id) {
        songRepository.deleteById(id);
    }

    public List<lookify> searchSongs(String artist) {
        return songRepository.findByArtistContaining(artist);
    }

    public List<lookify> topTenSongs() {
        return songRepository.findTop10ByOrderByRatingDesc();
    }
}