package LettoreMultimediale;

public class Immagine extends ElementoMultimediale {
		private static final String TIPO = "Immagine";
		public int luminosita;
	
	public Immagine(String titolo, int luminosita) {
		super(TIPO, titolo);
		this.luminosita = luminosita;
	}
	public void show(String titolo, int luminosita) {
		if(luminosita > 0){
	        System.out.println("*");
	        show(titolo, luminosita-1);
	    }
	}
	@Override
	public String toString() {
		return super.toString() + ", luminosita: " + luminosita;
	}
}
