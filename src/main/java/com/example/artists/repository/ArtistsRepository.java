package com.example.artists.repository;

import com.example.artists.entity.Artist;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ArtistsRepository extends JpaRepository<Artist,Long>{

	
	
	
}
