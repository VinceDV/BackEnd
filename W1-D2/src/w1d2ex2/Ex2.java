package w1d2ex2;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaSIM s1 = new CartaSIM("12345");	
	s1.ricaricaSIM(10);
	s1.effettuaChiamata(new Chiamata("2342239", 5));
	s1.effettuaChiamata(new Chiamata("2342238", 5));
	s1.effettuaChiamata(new Chiamata("2342237", 5));
	s1.effettuaChiamata(new Chiamata("2342236", 5));
	s1.effettuaChiamata(new Chiamata("2342235", 5));
	s1.effettuaChiamata(new Chiamata("2342234", 5));

	
	s1.stampaDatiSIM();

	}
	}
