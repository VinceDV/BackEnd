package Archivio;

public class Libro extends ElementiLibreria {

	private String autore;
	private String genere;

	public Libro(String titolo, int anno, int pagine, String autore, String genere) {
		super(titolo, anno, pagine);
		this.autore = autore;
		this.genere = genere;
	}

	@Override
	public String toString() {
		return "Codice ISBN: " + ISBN + ", Titolo: " + titolo + ", Anno di pubblicazione: " + anno
				+ ", Numero di pagine: " + pagine + ", Autore: " + autore + ", Genere: " + genere + ".";
	}

	public Object getAutore() {

		return autore;
	}

}
