package EX3;

public class Principale {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Articolo a1 = new Articolo("AB001", "Smartphone", 750.0, 2);
		Articolo a2 = new Articolo("AB002", "TV Led", 350.0, 1);
		Articolo a3 = new Articolo("AB003", "Monopattino volante", 999.0, 4);
		
		Cliente c1 = new Cliente("C001", "Mario Rossi", "m.rossi@example.com");
		
		Carrello carr1 = new Carrello(c1);
		
		carr1.stampaCarrello();
	}

}
