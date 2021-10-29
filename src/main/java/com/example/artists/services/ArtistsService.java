package com.example.artists.services;

import java.util.List;

import javax.transaction.Transactional;

import com.example.artists.entity.Album;
import com.example.artists.entity.Artist;

public interface ArtistsService {
	
	List<Artist> getAllByMostRecent();

	List<Artist> findByName(String name);
	
	Artist findByAlbum(Album album);
	
	@Transactional
	void insert(Artist artist);
	
	@Transactional
	void delete(long idArtist);
	
	@Transactional
	void update(Artist artist);
}
