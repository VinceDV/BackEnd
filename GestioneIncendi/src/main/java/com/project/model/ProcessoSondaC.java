package com.project.model;

public class ProcessoSondaC implements ProcessoSonda{

	public void update(Segnalazione s) {
		System.out.println("Codice segnalazione:"+ s.getId() + ". Partito l'allarme nell'edificio con coordinate latitudine: " + s.getLatitudine()+" longetudine: "+s.getLongitudine()+" livello pericolosità: "+s.getLivelloFumo());
		
	}
}
