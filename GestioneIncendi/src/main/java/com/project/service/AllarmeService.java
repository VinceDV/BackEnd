package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Allarme;
import com.project.model.GestioneSonda;
import com.project.model.ProcessoSonda;
import com.project.model.ProcessoSondaC;
import com.project.repository.AllarmeRepo;
import jakarta.persistence.EntityNotFoundException;

@Service
public class AllarmeService {
	

	@Autowired AllarmeRepo db;
	
	public Allarme salvaAllarme(Allarme s) {
		Allarme allarme=db.save(s);
       
		return allarme;
		
	}
	
	public List<Allarme> trovaTuttiAllarmi(){
		return db.findAll();
	}

	public Allarme trovaAllarme(Long id){
		Allarme s=db.findById(id).get();
		if(s!=null) {
			return s;			
		}else {			
			throw new EntityNotFoundException("ERRORE!! La voce di allarme cercata non esiste!!"); 
		}
			
	}
	
}