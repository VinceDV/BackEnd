package com.project.model;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="edifici")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Edificio {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false)
	private double longitudine;
	
	@Column(nullable = false)
	private double latitudine;

	public Edificio(double lon, double lat) {
		this.latitudine = lon;
		this.longitudine = lat;
	}
	
	
	
}