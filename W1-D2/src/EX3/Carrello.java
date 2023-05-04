package EX3;

public class Carrello {
	
	public Cliente clienteAssociato;
	public Articolo[] elencoArticoli;
	public double totaleCostoArticoli;
	
	public Carrello (Cliente clienteAssociato) {
		this.clienteAssociato = clienteAssociato;
		this.elencoArticoli = new Articolo[10];
		this.totaleCostoArticoli = 0;
	}
	
	public void aggiungiArticoloCarrello(Articolo a) {
		for (int i = 0; i < elencoArticoli.length; i ++) {
			if (elencoArticoli[i] == null) {
				elencoArticoli[i] = a;
				this.totaleCostoArticoli += a.prezzo;
				break;
			}
		}
	}
	
	
	public void stampaCarrello() {
		System.out.println("--- Carrello ---");
		System.out.println(this.clienteAssociato.nomeCognome);
		for (int i = 0; i < elencoArticoli.length; i ++) {
			if(elencoArticoli[i] != null) {
			System.out.println(elencoArticoli[i].descrizioneArticolo + " EURO" + elencoArticoli[i].prezzo);
		}
	}
		System.out.println("Il totale e' " + this.totaleCostoArticoli);
	}
	
}
