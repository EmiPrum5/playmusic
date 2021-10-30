package com.example.artists.controllers;

import java.util.List;

import javax.inject.Inject;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.artists.entity.Artist;
import com.example.artists.services.ArtistsService;





@Controller
@RequestMapping("/artists")
public class ArtistsController {

	private final ArtistsService artistsService;
	
	@Inject
	public ArtistsController(ArtistsService artistsService) {
		this.artistsService = artistsService;
	}
	
	
	@RequestMapping("")
	public String artists(Model model) {
		List<Artist> artists = artistsService.getAllByMostRecent();
		model.addAttribute("artists", artists);		
		return "artists";
	}
	
}