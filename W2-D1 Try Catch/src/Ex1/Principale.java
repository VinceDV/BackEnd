package Ex1;

import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) throws MyException {
		creazione();

	}
public static void creazione() throws MyException {
		
		boolean end = false;
		int[] myArr = new int[5];
		Random rand = new Random();
		
		for (int i = 0; i < myArr.length; i++) {
			myArr[i] = rand.nextInt(10) + 1;
		};
		
		for (int i = 0; i < myArr.length; i++) {
            System.out.print(myArr[i] + " ");
		};
        System.out.println("");

		do {			
			try {
//			Scanner sc = new Scanner(System.in);  
//	        System.out.println("Inserisci un numero: ");
//	        int numero = sc.nextInt();
			int valore = chiediValore();
	        if (valore == 0) {
	        	end = true;
		        System.out.println("Ciao");
		        break;
	        }
//	        System.out.println("Inserisci una posizione: ");
//	        int posizione = sc.nextInt();
	        
	        int posizione = chiediPosizione();
	        
	        myArr[posizione] = valore;
	        
	        for (int i = 0; i < myArr.length; i++) {
	            System.out.print(myArr[i] + " ");
	        };
	        System.out.println("");
			}
			catch (NumberFormatException e) {
				System.out.println("Errore numero non valido!!");  
			} 	
			catch (InputMismatchException e) {
			System.out.println("Errore! Inserisci un numero!");
			}
			catch (MyException e) {
				System.out.println(e.getMessage());
			}
		} while (!end);
	}
	
	public static int chiediValore(){
		Scanner sc = new Scanner(System.in);  
	    System.out.println("Inserisci un numero oppure '0' per terminare: ");
	    int num = sc.nextInt();
		return num;
	}

	public static int chiediPosizione() throws MyException {
		Scanner sc = new Scanner(System.in);  
        System.out.println("Inserisci un numero: ");
        int num = sc.nextInt();
		if(num > 5) {
			throw new MyException("Il numero dev'essere maggiore di 5!!!");
		}
		return num;
	}
	
}
