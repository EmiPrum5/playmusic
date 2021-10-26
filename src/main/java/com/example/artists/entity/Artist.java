package com.example.artists.entity;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import org.hibernate.annotations.NaturalId;

import lombok.Getter;
import lombok.Setter;


@Entity
@Table(name= "artist")
@Getter
@Setter
public class Artist extends EntityBaseData implements Serializable{
	
	private static final long serialVersionUID = 1L;

	
	@Column(name="name")
	@NaturalId
	//Esto limitando a que las bandas no deberian tener el mismo nombre
	@NotEmpty
	@Size(min = 2, max = 255)
	private String name;	
	
	@OneToMany(mappedBy = "artist")
	List<Album> Albums = new ArrayList<Album>(); 
	
	
}
