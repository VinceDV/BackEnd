package com.example.model;

import java.util.List;

import com.example.utils.TipoPostazione;

import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OrderBy;

import lombok.Data;

@Data
@Entity
public class Postazione {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String codice;
	private String descrizione;
	private Integer numeroMassimoOccupanti;
	
	@Enumerated(EnumType.STRING)
	private TipoPostazione tipo;
	
	@ManyToOne
	private Edificio edificio;
	
//	@OneToMany(mappedBy = "postazione")
//	@OrderBy(value = "dataPrenotata")
//	private List<Prenotazione> listaPrenotazioni;
}
