package Ex4;
import java.util.Scanner;

public class Principale4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dammiUnNumero();
	}
//	public static void dammiUnNumero() {
//		Scanner sc = new Scanner(System.in);
//		System.out.print("Inserisci un numero intero: ");
//		int numero = sc.nextInt();
//		
//		while (numero > -1) {
//			System.out.println(numero);
//			numero --;
//		}
//	}
	public static void dammiUnNumero() {
		Scanner sc = new Scanner(System.in);
		System.out.print("Inserisci un numero intero: ");
		int numero = sc.nextInt();
		
		for (numero = numero; numero > 0; numero--) {
			System.out.println(numero);
		}
	}
}
