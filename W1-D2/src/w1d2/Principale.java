package w1d2;

public class Principale {
	public static void main (String[] args) {
		System.out.println("This is my first Epicode Java Project! WOW");
		
		Rettangolo r1 = new Rettangolo(2, 5);
		Rettangolo r2 = new Rettangolo(3, 5);
		Rettangolo r3 = new Rettangolo(3, 6);

		System.out.println(r1.Perimetro());
		System.out.println(r1.Area());
		
		r2.stampaRettangolo();
		
//		double perimetri = r1.Perimetro() + r2.Perimetro();
//		double aree = r1.Area() + r2.Area();
		
//		System.out.println(aree);
//		System.out.println(perimetri);
		stampaDueRettangoli(r1, r2);
	}

	public static void stampaDueRettangoli(Rettangolo r1, Rettangolo r2) {
		double perimetri = r1.Perimetro() + r2.Perimetro();
		double aree = r1.Area() + r2.Area();
		System.out.println(aree);
		System.out.println(perimetri);
	}
}