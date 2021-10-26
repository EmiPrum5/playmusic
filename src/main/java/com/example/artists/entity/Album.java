package com.example.artists.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;


@Entity
@Table(name = "Album")
public class Album extends EntityBaseData implements Serializable{

	private static final long serialVersionUID = 1L;

	
	@Column(name="name")
	@Size(min = 2, max = 255)
	@NotEmpty
	private String name;
	
	@Column(name="qs")
	@Min(1)
	private int quantityOfSongs;
	
	@Column(name = "duration")
	@Min(30)
	private int duration;
	
	
	@OneToMany(mappedBy = "album")	
	private List<Song> songs = new ArrayList<Song>();
	
	@JoinColumn(name = "id_artist", referencedColumnName = "id")
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = true, fetch = FetchType.EAGER)
	private Artist artist;
	
}
