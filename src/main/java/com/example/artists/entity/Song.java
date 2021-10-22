package com.example.artists.entity;

import java.io.Serializable;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

@Entity
@Table(name = "songs")
public class Song extends EntityBaseData implements Serializable{
	
	private static final long serialVersionUID = 1L;


	@Column(name = "name")
	@NotEmpty
	@Size(min = 2, max = 255)
	private String name; 
	
	
	@Column(name = "duration")
	@Min(30)
	private int duration;
	//duracion dada en segundos
	
	/*
	 * Falta parte del media
	 */
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = false, fetch = FetchType.EAGER)	
	@JoinColumn(name = "id_autor", referencedColumnName = "id")
	private Artist artist;
	
	//luego se pueden agregar co-artistas o featuring
	
	
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = true, fetch = FetchType.EAGER)
	@JoinColumn(name = "id_album", referencedColumnName = "id")
	private Album album;	
	
}
