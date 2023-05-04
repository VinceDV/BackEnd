package w1d2;

public class Principale {
	public static void main (String[] args) {
		System.out.println("This is my first Epicode Java Project! WOW");
		
		Rettangolo r1 = new Rettangolo(2, 5);
		Rettangolo r2 = new Rettangolo(3, 5);

		r1.stampaRettangolo();
		r2.stampaRettangolo();

		stampaDueRettangoli(r1, r2);
	}

	public static void stampaDueRettangoli(Rettangolo x, Rettangolo y) {
		
		double perimetri = x.Perimetro() + y.Perimetro();
		double aree = x.Area() + y.Area();
		System.out.println(aree);
		System.out.println(perimetri);
	}

	
}