package LettoreMultimediale;
import java.util.Scanner;

public class Principale {

	public static void main(String[] args) {
		
		ElementoMultimediale[] arrElem = new ElementoMultimediale[5];
//		
//		Scanner sc= new Scanner(System.in);
//		String a = sc.toString(); 
//		
//		for (int i = 0; i < 5; i++) {
//            System.out.print("Enter a string: ");
//            arrElem[i] = sc.nextLine();
//        }
//
        
//		ElementoMultimediale v1 = new Video("cane", 3, 4, 5);
		
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
        
		for (int i = 0; i < arrElem.length; i++) {
			if(arrElem[i] instanceof Audio) {
				Audio a = (Audio) arrElem[i];
	    		a.play(a.durata, a.titolo, a.volume);
			} else if(arrElem[i] instanceof Video) {
				Video b = (Video) arrElem[i];
	    		System.out.println(b);        
	    		b.play(b.durata, b.titolo, b.volume, b.luminosita);
			}
			else if (arrElem[i] instanceof Immagine) {
				Immagine c = (Immagine) arrElem[i];
	    		c.show(c.titolo, c.luminosita);
			}
		}
    		
//       
    		
		
//		System.out.println(i1);
//		i1.show(i1.titolo, i1.luminosita);
//		
//		System.out.println(v2);
//		v2.play(v2.durata, v2.titolo, v2.volume, v2.luminosita);
//		
//		System.out.println(a1);
//		a1.play(a1.durata, a1.titolo, a1.volume);
//		
//		a1.abbassaVolume(2);
//		
//		System.out.println(a1);
//		a1.play(a1.durata, a1.titolo, a1.volume);
		
	}

}
