package com.example.artists.controllers;

import java.util.StringJoiner;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import com.example.artists.entity.Artist;

public class ArtistForm {

    private Long id;

    @NotEmpty
    @Size(min = 2, max = 255)
    private String name;
	
	public ArtistForm() {
		
	}
	
	public ArtistForm(Artist artist) {
		this.id = artist.getId();
		this.name = artist.getName();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public boolean isNew() {
		return id == null;
	}

	@Override
	public String toString() {
		return new StringJoiner(", ", ArtistForm.class.getSimpleName() + "[", "]")
				.add("id" + id)
				.add("name" + name)
				.toString();
	}
	
	
	
}
