package com.example.artists.controllers;

import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.inject.Inject;
import javax.validation.Valid;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

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
	
	@RequestMapping("/{artistId}")
	public ModelAndView viewArtist(@PathVariable("artistId") long artistId) {
		Optional<Artist> artist = artistsService.findId(artistId);
		Map<String, Object> model = Collections.singletonMap("artist", artist.orElse(null));
		return new ModelAndView("artist-view", model);	
	}
	
	@RequestMapping("/new")
	public String newArtist(Model model) {
		model.addAttribute("artistForm", new ArtistForm());
		return "artist-edition";
	}
	
	@RequestMapping(value = "/new", method = RequestMethod.POST)
	public String newArtist(@ModelAttribute("artistForm") @Valid ArtistForm artistForm, BindingResult result) {
        if (result.hasErrors()) {
            return "artist-edition";
        }

        Artist artist = new Artist();
        artist.setName(artistForm.getName());
        //album y songs quedara vacia, se insertara desde su controlador
        artistsService.insert(artist);

        return "redirect:/artists/" + artist.getId();
	}
	
}