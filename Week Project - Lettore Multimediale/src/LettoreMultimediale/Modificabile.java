package LettoreMultimediale;

public interface Modificabile {
	
	public static void abbassaLuminosita(int x, int luminosita) {
		luminosita = luminosita - x;
	};
	public static void alzaLuminosita(int x, int luminosita) {
		luminosita = luminosita + x;
	};

}
