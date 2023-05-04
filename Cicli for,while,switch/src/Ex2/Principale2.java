package Ex2;

public class Principale2 {

	public static void main(String[] args) {
		contaLettere(1);
		contaLettere(2);
		contaLettere(3);
		contaLettere(4);

	}
	public static void contaLettere(int x) {
		switch(x) {
			case 1: System.out.println("UNO"); break; 
			case 2: System.out.println("DUE"); break; 
			case 3: System.out.println("TRE"); break; 
			default: System.out.println("ERRORE"); break;
	}
		}
}
