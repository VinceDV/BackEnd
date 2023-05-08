package Ex2;

import java.util.InputMismatchException;
import java.util.Scanner;

import Ex1.MyException;

public class Principale2 {

	public static void main(String[] args) {
		creazione();
	}
	
	public static void creazione(){
		
		boolean end = false;
		
		do {
			try {
				int km = chiediKM();
				int litri = chiediLitri();
				double distanza = (km/litri)*100;
				System.out.println(distanza);
				
				
				boolean secondEnd = true;
			    do {
			    	Scanner sc = new Scanner(System.in);  
				    System.out.println("Riprovi? S/N");
				    String risp = sc.nextLine();
				    switch(risp.toUpperCase()) {
				    case "S": creazione(); secondEnd = false; break;
				    case "N": end = true; secondEnd = false; break;
				    default: System.out.println("Seleziona una risposta corretta.");
				    }
			    } while (secondEnd);
//			    if (risp.toUpperCase() == "S") {
//					creazione();
//				}
//				else if (risp.toUpperCase() == "N"){
//					end = true;
//				}
//				else {
//				    System.out.println("Seleziona una risposta corretta.");
//				    end = true;
//				}
			} catch (ArithmeticException e) {
				System.out.println("Errore di divisione per 0");
			}
			catch (NumberFormatException e) {
				System.out.println("Errore numero non valido!!");  
			} 	
			catch (InputMismatchException e) {
			System.out.println("Errore! Inserisci un numero!");
			}
		}
		while (!end);
		
	}
	
	public static int chiediKM(){
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Inserisci il numero di km: ");
	    int km = sc.nextInt();
		return km;
	}

	public static int chiediLitri(){
		
		Scanner sc = new Scanner(System.in);  
        System.out.println("Inserisci il numero di litri: ");
        int litri = sc.nextInt();
		return litri;
	}
}
