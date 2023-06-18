package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Edificio;
import com.project.repository.EdificioRepo;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class EdificioService {
	
	@Autowired EdificioRepo edR;
	
	public Edificio salvaEdificio(Edificio e) {
		if(edificioEsistente(e)) {
			throw new EntityExistsException("L'edificio già esiste nel DB!!");
		}else
		return edR.save(e);
	}
	
	public Edificio modificaEdificio(Edificio e) {
		if(!edificioEsistenteConId(e.getId())) {
			throw new EntityExistsException("L'edificio non esiste nel DB!!");
		}else 
		return edR.save(e);
	}
	
	public List<Edificio> trovaTuttiEdifici(){
		return edR.findAll();
	}

	public Edificio trovaEdificio(Long id){
		Edificio e=edR.findById(id).get();
		if(e!=null) {
			return e;			
		}else {	
			throw new EntityNotFoundException("ERRORE!! L'edificio cercato non esiste!!"); 
		}
			
	}
	
	
	
	boolean esiste;
	public boolean edificioEsistente(Edificio ed) {
		esiste=false;
		edR.findAll().forEach(e->{
			if(e.getId()==ed.getId() && e.getLatitudine()==ed.getLatitudine() && e.getLongitudine()==ed.getLongitudine()) {
				esiste=true;
			}
		});
		if(esiste) {
			return true;
		}else 
			return false;
	}
	

	public boolean edificioEsistenteConId(Long id) {
		if (edR.existsById(id)){
			return true;	
		}else
		return false;
	}


}
