package Archivio;

import javax.persistence.*;

import utils.Periodicita;

@Entity
@Table(name="riviste")
public class Rivista extends ElementiLibreria {

	@Enumerated(EnumType.STRING)
	@Column(nullable = false)
	private Periodicita periodicita;
	
	
	public Rivista() {
	}

	public Rivista(String titolo, int annoPubblicazione, int numeroPagine, Periodicita periodicita) {
		super(titolo, annoPubblicazione, numeroPagine);
		this.periodicita=periodicita;
	}

	public Periodicita getPeriodicita() {
		return periodicita;
	}

	public void setPeriodicita(Periodicita periodicita) {
		this.periodicita = periodicita;
	}

	@Override
	public String toString() {
		return  "Rivista [periodicita=" + periodicita + super.toString();
	}
	
	

}
