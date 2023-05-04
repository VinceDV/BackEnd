package Ex3;
import java.util.Scanner;

public class Principale3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		suddividi();
	}
	
	public static void suddividi () {
		String prima;
		do {
			Scanner sc = new Scanner(System.in);
			System.out.print("Inserisci una stringa: ");
			prima = sc.nextLine();
			if (!prima.equals(":q")) {
			String[] caratteri = prima.split("");
            
            StringBuilder risultato = new StringBuilder();

            for (int i = 0; i < caratteri.length; i++) {
                risultato.append(caratteri[i]);
                if (i != caratteri.length - 1) {
                    risultato.append(", ");
                }
            };
            System.out.println("Risultato: " + risultato.toString());
			
		} 
	} while (!prima.equals(":q"));
}
	}
