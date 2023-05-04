package w1d2ex2;

public class CartaSIM {
	
	public static double costoMinutoChiamata = 0.20;
	public String telefono;
	public double credito;
	public Chiamata[] chiamateEffettuate;

	public CartaSIM(String telefono) {
		this.telefono = telefono;
		this.credito = 0;
		this.chiamateEffettuate = new Chiamata[5];
	};
	
	public void ricaricaSIM(double importo) {
		this.credito += importo;
	}
	
	public void effettuaChiamata(String numero, int minuti) {
		if(this.credito > 0) {
			Chiamata c = new Chiamata(numero, minuti);
			System.out.println("Chiamata effettuata sul num. " + c.numeroChiamato + " min." + c.durataMinuti);
			this.credito -= minuti*costoMinutoChiamata;
			for (int i = 0; i < chiamateEffettuate.length; i++) {
				if(chiamateEffettuate[i] == null) {
					chiamateEffettuate[i] = c;
					break;
				}
			}
		} else {
			System.out.println("Non hai Credito disponibile, ricarica per effettuare una chiamata.");
		}
	}
	public void stampaDatiSIM() {
		System.out.println("SIM numero: " + this.telefono);
		System.out.println("Credito Disponibile: " + this.credito);
		System.out.println("Lista Ultime 5 chiamte: ");
		for (int i = 0; i < chiamateEffettuate.length; i++) {
			Chiamata c = chiamateEffettuate[i];
			if(c != null) {
				System.out.println(c.numeroChiamato + " min: " + c.durataMinuti);
			}
		}
	}
	
}
