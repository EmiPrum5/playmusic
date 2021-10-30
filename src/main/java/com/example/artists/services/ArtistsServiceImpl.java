package com.example.artists.services;

import java.util.List;
import java.util.Optional;

import javax.inject.Inject;
import javax.transaction.Transactional;

import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import com.example.artists.entity.Album;
import com.example.artists.entity.Artist;
import com.example.artists.repository.ArtistsRepository;

@Service
public class ArtistsServiceImpl implements ArtistsService{

	private final ArtistsRepository artistsRepository;
	
	@Inject
	public ArtistsServiceImpl(ArtistsRepository artistsRepository) {
		this.artistsRepository = artistsRepository;
	}
	
	@Override
	public List<Artist> getAllByMostRecent() {		
		return artistsRepository.findAll(Sort.by("date").descending());
	}
	
	@Override
	public List<Artist> findByName(String name) {
		return artistsRepository.findByNameContainingIgnoreCase(name);
	}

	@Override
	public Artist findByAlbum(Album album) {
		return artistsRepository.findByAlbums(album);
	}

	@Override
	@Transactional
	public void insert(Artist artist) {
		artistsRepository.save(artist);
	}

	@Override
	@Transactional
	public void delete(long idArtist) {
		artistsRepository.deleteById(idArtist); 
	}

	@Override
	@Transactional
	public void update(Artist artist) {
		 artistsRepository.save(artist);		
	}

	@Override
	public Optional<Artist> findId(long id) {
		return artistsRepository.findById(id);
	}
	
}
