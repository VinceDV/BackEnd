package com.project.runner;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import com.project.model.Edificio;
import com.project.model.GestioneSonda;
import com.project.model.ProcessoSonda;
import com.project.model.ProcessoSondaC;
import com.project.model.Segnalazione;
import com.project.model.Sonda;
import com.project.service.EdificioService;
import com.project.service.SegnalazioneService;
import com.project.service.SondaService;


@Component
public class GestioneIncendiRunner implements CommandLineRunner{

	@Autowired EdificioService edificioService;
	@Autowired SondaService sondaService;
	@Autowired SegnalazioneService segnalazioneService;
	
	
	@Override
	public void run(String... args) throws Exception {
    System.out.println("Runner Gestione Incendi...");
    
    	Edificio e = new Edificio(null, 10.53, 20.90);
    	edificioService.salvaEdificio(e);
    	
    	
    	List<Sonda> listaSonde=new ArrayList<Sonda>();
    	listaSonde.add(new Sonda(null, "atrio", e));
    	listaSonde.add(new Sonda(null, "sala", e));
    	listaSonde.add(new Sonda(null, "bagno" , e));
    	listaSonde.add(new Sonda(null, "corridoio2" ,e));
    	listaSonde.forEach(s->sondaService.salvaSonda(s));
    	
    	
    	List<Segnalazione> listaSegnalazioni=new ArrayList<Segnalazione>();
    	listaSegnalazioni.add(new Segnalazione(sondaService.trovaSonda(1l), 3,LocalDateTime.now()));
    	listaSegnalazioni.add(new Segnalazione(sondaService.trovaSonda(3l), 5,LocalDateTime.now()));
    	listaSegnalazioni.add(new Segnalazione(sondaService.trovaSonda(2l), 7,LocalDateTime.now()));
    	listaSegnalazioni.add(new Segnalazione(sondaService.trovaSonda(4l), 2,LocalDateTime.now()));
    	listaSegnalazioni.forEach(s->segnalazioneService.salvaSegnalazioni(s));
    	
    	

	}

}