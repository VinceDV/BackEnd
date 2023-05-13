package Archivio;

import Archivio.MainProject.Periodicita;

public class Rivista extends ElementiLibreria{
	
	protected Periodicita periodicita;
	
	public Rivista(String titolo, int anno, int pagine, Periodicita periodicita) {
		super(titolo, anno, pagine);
	    this.periodicita = periodicita;
	}
	
	@Override
	public String toString() {
		return "Codice ISBN: " + ISBN + ", Titolo: " + titolo + ", Anno di pubblicazione: " + anno
				+ ", Numero di pagine: " + pagine + ", Periodicita: " + periodicita + ".";
	}
	public Periodicita getPeriodicita() {
	    return periodicita;
	  }
}
