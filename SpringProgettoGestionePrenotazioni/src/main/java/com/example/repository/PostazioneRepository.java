package com.example.repository;

import java.time.LocalDate;

import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.PagingAndSortingRepository;

import com.example.model.Citta;
import com.example.model.Postazione;
import com.example.utils.TipoPostazione;

public interface PostazioneRepository extends PagingAndSortingRepository<Postazione, Long> {

	@Query("SELECT post FROM Postazione post where"
			+ " post.edificio.citta = :citta AND post.tipo = :tipo"
			+ " AND post.id NOT IN (SELECT pre.postazione.id FROM Prenotazione pre where pre.dataPrenotata <> :dataRichiesta)")
	public Page<Postazione> findLibereByCitta(Citta citta, TipoPostazione tipo,  LocalDate dataRichiesta, Pageable pageable);
	
	public Page<Postazione> findByEdificioCittaAndTipo(Citta citta, TipoPostazione tipoPostazione, Pageable pageable);

	public Page<Postazione> findByCodice(String codice, Pageable pageable);

}
