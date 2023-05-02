package it.epicode.be;
import java.util.Scanner;

public class Helloworld {

public static void main (String[] args)
		{
		System.out.println("This is my first Epicode Java Project! WOW");
		moltiplica(3,5);
		concatena("Love you ", 3000);
		//esercizio3();
		String[] arrayFinale = inserisciInArray(array, "Hey");
		for (int i = 0; i < 6; i++) {
			System.out.println(arrayFinale[i]);
		};
		perimetroRettangolo(3.2,4.3);
		pariDispari(2);
		perimetroTriangolo(5.6, 3.7, 8.5);
		};



public static void moltiplica (int num1, int num2) {
	
	int res = num1 * num2;
	System.out.println("Il prodotto e' " + res);
};


public static void concatena (String text, int num3) {

	String res = text + num3;
	System.out.println(res);
};

static String[] array = {"Element 1", "Element 2", "Element 3", "Element 4", "Element 5"};
public static String[] inserisciInArray (String[] array, String text) {
	
	String[] nuovoArray = new String[6];
	nuovoArray[0] = array[0];
	nuovoArray[1] = array[1];
	nuovoArray[2] = text;
	nuovoArray[3] = array[2];
	nuovoArray[4] = array[3];
	nuovoArray[5] = array[4];
	
	return nuovoArray;
};

public static void esercizio3 () {

	Scanner sc = new Scanner(System.in);
	System.out.print("Inserisci la prima stringa: ");
	String prima = sc.nextLine();
	
	System.out.print("Inserisci la seconda stringa: ");
	String seconda = sc.nextLine();
	
	System.out.print("Inserisci la terza stringa: ");
	String terza = sc.nextLine();
	
	String res = prima + " " + seconda + " " + terza;
	String ser = terza + " " + seconda + " " + prima;
	System.out.println(res);
	System.out.println(ser);
};

public static void perimetroRettangolo (double lato1, double lato2) {
	
	double perimetro = lato1 * lato2;
	System.out.println(perimetro);
}

public static void pariDispari (int num) {
	if (num%2 == 0) {
		System.out.println(0);
	} else {
		System.out.println(1);
	}
};

public static void perimetroTriangolo (double lato1, double lato2, double lato3) {
	
	double semiperimetro = (lato1 + lato2 + lato3) / 2;
	double area = Math.sqrt(semiperimetro * (semiperimetro - lato1) * (semiperimetro - lato2) * (semiperimetro - lato3));
	System.out.println("L'area del triangolo è: " + area);
}
};
