package Archivio;

public class ElementiLibreria {
	private static int counter = 0;
	protected int ISBN;
	protected String titolo;
	protected int anno;
	protected int pagine;
	
	public ElementiLibreria(String titolo, int anno, int pagine) {
		this.ISBN = counter++;
		this.titolo = titolo;
		this.anno = anno;
		this.pagine = pagine;
	}

	
}
