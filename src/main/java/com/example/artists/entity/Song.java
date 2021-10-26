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
@Table(name = "song")
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
	
	
	//luego se pueden agregar co-artistas o featuring
	
	
	
	@JoinColumn(name = "id_album", referencedColumnName = "id")
	@ManyToOne(cascade = {CascadeType.PERSIST, CascadeType.MERGE}, optional = true, fetch = FetchType.EAGER)
	private Album album;	
	
}
