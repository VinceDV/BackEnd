package com.project.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.model.Allarme;
import com.project.model.Edificio;
import com.project.model.GestioneSonda;
import com.project.model.ProcessoSonda;
import com.project.model.ProcessoSondaC;
import com.project.model.Segnalazione;
import com.project.model.Sonda;
import com.project.repository.AllarmeRepo;
import com.project.repository.EdificioRepo;
import com.project.repository.SegnalazioneRepo;
import com.project.repository.SondaRepo;

import jakarta.persistence.EntityExistsException;
import jakarta.persistence.EntityNotFoundException;

@Service
public class SegnalazioneService {
	
	@Autowired SegnalazioneRepo db;
	@Autowired AllarmeService dbAllarme;
	

	
	public Segnalazione salvaSegnalazioni(Segnalazione s) {
		if(segnalazioneEsistente(s)) {
			throw new EntityExistsException("ERRORE!! La segnalazione già esiste!!"); 
		}else {
			GestioneSonda gPS=new GestioneSonda();
			ProcessoSonda p1= new ProcessoSondaC();
			gPS.aggiungiProcesso(p1);
			Segnalazione segnalazione = db.save(s);
			
			return segnalazione;
		}
	}
	
	public Segnalazione modificaSegnalazione(Segnalazione s) {
		if(!segnalazioneEsistenteConId(s.getId())) {
			throw new EntityNotFoundException("ERRORE!! La segnalazione non esiste!!"); 
		}else {
			GestioneSonda gPS=new GestioneSonda();
			ProcessoSonda p1= new ProcessoSondaC();
			gPS.aggiungiProcesso(p1);
			Segnalazione segnalazione=db.save(s);
			return segnalazione;			
		}
	}
	
	
	
	public List<Segnalazione> trovaTutteSegnalazioni(){
		return db.findAll();
	}

	public Segnalazione trovaSegnalazione(Long id){
		Segnalazione s=db.findById(id).get();
		if(s!=null) {
			return s;			
		}else {			
			throw new EntityNotFoundException("ERRORE!! La segnalazione cercata non esiste!!"); 
		}
			
	}
	boolean esiste;
	public boolean segnalazioneEsistente(Segnalazione s) {
		esiste=false;
		db.findAll().forEach(segna->{
			if(segna.getDataOraSegnalazione().equals(s.getDataOraSegnalazione()) && segna.getLatitudine()==s.getLatitudine() && segna.getLongitudine()==s.getLongitudine() && segna.getLivelloFumo()==s.getLivelloFumo() && segna.getSonda().equals(s.getSonda())  ){
				esiste=true;
			}
		});
		if(esiste) {
			return true;
		}else
		return false;
		
	}
	
	public boolean segnalazioneEsistenteConId(Long id) {
		if (db.existsById(id)){
			return true;	
		}else
		return false;
	}
	

}