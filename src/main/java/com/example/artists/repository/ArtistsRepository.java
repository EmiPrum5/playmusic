package com.example.artists.repository;

import com.example.artists.entity.Artist;
import com.example.artists.entity.Song;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistsRepository extends JpaRepository<Artist,Long>{

	List<Artist> findByNameContainingIgnoreCase (String name);
	
//	Artist findBySong(Song song);
	
//	long countByNombreContaining(String name);
}
