package com.example.artists.repository;

import com.example.artists.entity.Album;
import com.example.artists.entity.Artist;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;


public interface ArtistsRepository extends JpaRepository<Artist,Long>{

	List<Artist> findByNameContainingIgnoreCase (String name);
	
	Artist findByAlbums(Album album);
	
//	long countByNombreContaining(String name);
}
