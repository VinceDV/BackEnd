package com.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Citta;
import com.example.model.Edificio;

public interface EdificioRepository extends PagingAndSortingRepository<Edificio, Long> {
	
	Page<Edificio> findByCitta(Citta citta, Pageable pageable);
	
	Page<Edificio> findByNome(String nome, Pageable pageable);

}
