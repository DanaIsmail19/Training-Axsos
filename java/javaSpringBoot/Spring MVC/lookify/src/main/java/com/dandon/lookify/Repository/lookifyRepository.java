package com.dandon.lookify.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.dandon.lookify.models.lookify;

public interface  lookifyRepository extends JpaRepository<lookify, Long> {

	List<lookify> findTop10ByOrderByRatingDesc();
	List<lookify> findByArtistContaining (String artist);
}
