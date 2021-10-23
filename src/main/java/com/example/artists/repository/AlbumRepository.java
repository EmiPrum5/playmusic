package com.example.artists.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.artists.entity.Album;

public interface AlbumRepository extends JpaRepository<Album, Long>{

	List<Album> findByNameContainingIgnoreCase(String name);
	
}
