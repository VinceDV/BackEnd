package LettoreMultimediale;

public class ElementoMultimediale {
	protected String TIPO;
	protected String titolo;
	
	public ElementoMultimediale(String TIPO, String titolo) {
		this.TIPO = TIPO;
		this.titolo = titolo;
	}
	
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public String getTIPO(String TIPO) {
		return TIPO;
	}
	public void setTIPO(String TIPO) {
		this.TIPO = TIPO;
	}
	@Override
	public String toString() {
		return "TIPO: " + TIPO + ", titolo: " + titolo;
	}
}
