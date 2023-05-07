package LettoreMultimediale;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		riproduzione();
	}
		
        
		public static void riproduzione() {
			
			ElementoMultimediale[] arrElem = new ElementoMultimediale[5];
			
			Immagine obj0 = new Immagine("Gatto", 3);
			Video obj1 = new Video("Perro", 2 ,3 ,4);
			Audio obj2 = new Audio("Audione", 4, 3);
			Video obj3 = new Video("Perro", 2 ,1 ,4);
			Audio obj4 = new Audio("Audione2", 6, 7);
	        
	  	
			arrElem[0] = obj0;
			arrElem[1] = obj1;
			arrElem[2] = obj2;
			arrElem[3] = obj3;
			arrElem[4] = obj4;
		
		
		boolean inputCor = true;
		do {
			System.out.println("Benvenuto nel lettore multimediale! Inserisci un numero da 0 a 4 per cominciare!"); 
			Scanner st = new Scanner(System.in);
			int numeroElem = st.nextInt();
		if (numeroElem >= 0 && numeroElem <= 4) {
			if (arrElem[numeroElem] instanceof Audio) {
				Audio a = (Audio) arrElem[numeroElem];
	    		System.out.println(a);        
	    		a.play(a.durata, a.titolo, a.volume);
			}
			else if(arrElem[numeroElem] instanceof Video) {
				Video b = (Video) arrElem[numeroElem];
	    		System.out.println(b);        
	    		b.play(b.durata, b.titolo, b.volume, b.luminosita);
			}
			else if (arrElem[numeroElem] instanceof Immagine) {
				Immagine c = (Immagine) arrElem[numeroElem];
	    		System.out.println(c);        
	    		c.show(c.titolo, c.luminosita);
			}
			} 
		else {
				System.out.println("Devi inserire un numero da 0 a 4!");
				inputCor = true;
			}
		} while (!inputCor);
		ripeti();
		};

		public static void ripeti() {
			boolean conferma = true;
			do {
			System.out.println("Vuoi riprodurre qualcos'altro? 'S' per confermare 'N' per uscire.");        
			Scanner st = new Scanner(System.in);
			String risposta = st.nextLine().toUpperCase();
			switch (risposta) {
			case "S":riproduzione();
			conferma = false;
					break;
			case "N": 
				System.out.println("Arrivederci!");
				conferma = false;
				break;
			default:
				System.out.println("Inserisci una risposta corretta!");
				continue;
			}
			}while (conferma);
			}
		}

// Prof so che non sono riuscito a implementare la funzione di creazione ma questa e' tutta farina del mio sacco
// NO ChatGPT, NO aiuti esterni
// e sono contento del risultato tutto sommato.
// Buona giornata!

