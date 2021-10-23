package com.example.artists.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.artists.entity.Album;
import com.example.artists.entity.Artist;
import com.example.artists.entity.Song;

public interface SongsRepository extends JpaRepository<Song, Long>{

	List<Song> findByNameContainsIgnoreCase (String name);
	
	List<Song> findByArtist(Artist artist);
	
	List<Song> findByAlbum(Album album);
	
}
