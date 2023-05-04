package w1d2ex2;

public class Ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CartaSIM s1 = new CartaSIM("12345");	
	s1.ricaricaSIM(10);
	s1.effettuaChiamata("2342239", 5);
	s1.effettuaChiamata("23424339", 5);
	s1.effettuaChiamata("2342243449", 5);
	s1.effettuaChiamata("23422395534", 5);
	
	s1.stampaDatiSIM();

	}
	}
