package LettoreMultimediale;
import java.util.*;

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
			System.out.println("Benvenuto nel lettore multimediale!");
			int numeroElem = 0;
			numeroInput(numeroElem);
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
		
		public static void numeroInput(int y) {
			Scanner st = new Scanner(System.in);
			y = 0;
			System.out.println("Inserisci un numero da 0 a 4!");
			if (!st.hasNextInt()){
				System.out.println("Devi inserire un numero!");
				numeroInput(y);
				} else {
			String z = st.next();
			y = Integer.parseInt(z);
			if (y < 0 || y > 4) {
				System.out.println("Il numero deve essere compreso tra 0 e 4!");
				numeroInput(y);
			}
				}
			}
		}

