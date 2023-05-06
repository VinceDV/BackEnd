package LettoreMultimediale;

public class Audio extends ElementoMultimediale implements Riproducibile{
	private static final String TIPO = "Audio";
	public int volume;
	public int durata;
	
	public Audio(String titolo, int volume, int durata) {
		super(TIPO, titolo);
		this.volume = volume;
		this.durata = durata;
		// TODO Auto-generated constructor stub
	}

	public void play(int durata, String titolo, int volume) {
		titoloStampa(titolo, durata);
		volumeStampa(volume);
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

	public void alzaVolume(int x) {
	}

	public void abbassaVolume(int x) {
		this.volume = volume - x;
	}
	
	@Override
	public String toString() {
		return super.toString() + ", volume: " + volume + ", durata: " + durata;
	}
}
