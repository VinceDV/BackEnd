package LettoreMultimediale;

public class Video extends ElementoMultimediale implements Riproducibile, Modificabile{
	private static final String TIPO = "Video";
	public int volume;
	public int durata;
	public int luminosita;
	
	public Video(String titolo, int volume, int durata, int luminosita) {
		super(TIPO, titolo);
		this.volume = volume;
		this.durata = durata;
		this.luminosita = luminosita;
		
	}
	public String getTitolo() {
		return titolo;
	}
	public void setTitolo(String titolo) {
		this.titolo = titolo;
	}
	
	public void alzaLuminosita(int x, int luminosita) {
	}

	
	public void abbassaLuminosita(int x, int luminosita) {
	}

	public void play(int durata, String titolo, int volume, int luminosita) {
		titoloStampa(titolo, durata);
		volumeStampa(volume);
		luminositaStampa(luminosita);
	}
	public void volumeStampa (int volume) {
		if(volume > 0){
	        System.out.println("!");
	        volumeStampa(volume-1);
	    }	
	};
	public void titoloStampa(String titolo, int durata) {
		if(durata > 0){
	        System.out.println(titolo);
	        titoloStampa(titolo, durata-1);
	    }
	};
	public void luminositaStampa(int luminosita) {
		if(luminosita > 0){
	        System.out.println("*");
	        luminositaStampa(luminosita-1);
	    }
	};

	public void alzaVolume(int x) {
		this.volume = volume + x;
	}

	public void abbassaVolume(int x) {
		this.volume = volume - x;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", volume: " + volume + ", durata: " + durata + ", luminosita: " + luminosita;
	}
}
