package com.epicode.test.log;

import java.util.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class MainProject implements StampaValori {

	static Logger log = LoggerFactory.getLogger(MainProject.class);

	public static void main(String[] args) {

		testCollection();
	}

	public static void testCollection() {

		Scanner sc = new Scanner(System.in);
		System.out.println("Inserisci un numero: ");
		int numero = sc.nextInt();

		Set<String> parole = new HashSet<String>();
		Set<String> doppioni = new HashSet<String>();
		Set<String> uniche = new HashSet<String>();
		int counter = 0;
		for (int i = 0; i < numero; i++) {
			Scanner sc2 = new Scanner(System.in);
			System.out.println("Inserisci un valore: ");
			String valore = sc2.nextLine();

			if (parole.contains(valore)) {
				doppioni.add(valore);
			} else {
				parole.add(valore);
			}
		}
		parole.forEach(e -> {
			if (!doppioni.contains(e)) {
				uniche.add(e);
		}	
		});
		
		 parole.forEach(e -> log.info("Parole " + e));
		 doppioni.forEach(e -> log.info("Doppioni " + e));
		 uniche.forEach(e -> log.info("uniche " + e));
}
//		for (int i = 0; i < parole.size(); i++) {
//			if (parole.contains() === ) {
//				
//			}
//		}

//		});
//		c.forEach(e-> {
//			if (c.contains(e)) {
//				log.info(e);
//			}}
//		);

//		for (int i = 0; i < c.size(); i++) {
//			if (c[i] == c[i+1]) {
//				log.info(c[i]);
//			}
//		};

//		//Collection<Integer> c = new ArrayList<String>();
//		c.add("Primo elemento");
//		c.add("Secondo elemento");
//		c.add("Terzo elemento");
//		c.add("Primo elemento");
//		boolean cont = c.contains("Secondo elemento");
//		log.info("Contains 'Secondo elemento': " + cont);
//		
//		c.forEach(e -> log.info(e));

	@Override
	public void stampaValoriDiversi(Set parole) {
		parole.forEach(e -> {

		});
	}

	@Override
	public void stampaValoriUguali() {
		// TODO Auto-generated method stub

	}

}
