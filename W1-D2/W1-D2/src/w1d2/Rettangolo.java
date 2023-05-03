package w1d2;

public class Rettangolo{
	public double base;
	public double altezza;
	
	public Rettangolo(double base, double altezza) {
		this.base = base;
		this.altezza = altezza;
	}
	
	public double Perimetro() {
		double p = (base + altezza)*2;
		return p;
	}
	
	public double Area() {
		double a = base * altezza;
		return a;
	}
	
	public void stampaRettangolo() {
		double perimetro = Perimetro();
		double area = Area();
		System.out.println("Perimetro: " + perimetro);
        System.out.println("Area: " + area);
	}
}
