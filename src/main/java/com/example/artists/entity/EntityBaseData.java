package com.example.artists.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import org.springframework.data.annotation.CreatedDate;

import lombok.Getter;
import lombok.Setter;

@MappedSuperclass
@Getter
@Setter
public class EntityBaseData {
	
	
	@Id
	@Column(name="id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;	
	
	
	@Column(name = "dateofcreation")
	@CreatedDate
	private Date date;
		
	
}
