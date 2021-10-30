package com.example.artists.services;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.stereotype.Service;

import com.example.artists.entity.Album;
import com.example.artists.entity.Artist;


@Service
public interface ArtistsService {
	
	List<Artist> getAllByMostRecent();

	List<Artist> findByName(String name);
	
	Artist findByAlbum(Album album);
	
	Optional<Artist> findId(long id);
	
	@Transactional
	void insert(Artist artist);
	
	@Transactional
	void delete(long idArtist);
	
	@Transactional
	void update(Artist artist);
}
