package com.example.repository;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Citta;

public interface CittaRepository extends PagingAndSortingRepository<Citta, Long> {
	
	public Page<Citta> findByNome(String nome, Pageable pageable);

}
