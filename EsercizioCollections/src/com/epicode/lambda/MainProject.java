package com.epicode.lambda;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.ArrayList;
import java.util.Collection;
import java.time.LocalDate;



public class MainProject {
	

	static List<Product> listaMista = new ArrayList<Product>();
	static List<Product> listaMista2 = new ArrayList<Product>();
	static List<Product> listaBoys = new ArrayList<Product>();
	static List<Order> listaOrdini = new ArrayList<Order>();
	static List<Order> listaOrdini2 = new ArrayList<Order>();

	static List<Cliente> listaClienti = new ArrayList<Cliente>();

	public static void main(String[] args) {
//		
		//Logger log = LoggerFactory.getLogger(MainProject.class);
//
		//listaProdotti.addAll((Collection<? extends String>) new Product(012345, "Pannolini", "Baby", 1.50));
		Product p1 = new Product(012345, "Pannolini", "Baby", 1.50);
		Product p2 = new Product(012345, "Il Signore degli Anelli", "Books", 5.50);
		Product p3 = new Product(012345, "Bullboys", "Boys", 8.50);
		Product p4 = new Product(012345, "Il Signore dei rastrelli", "Books", 500.50);
		Product p5 = new Product(012345, "Rageboys", "Boys", 800.50);


		listaMista.add(p1);
		listaMista.add(p2);
		listaMista.add(p3);
		listaMista.add(p4);
		listaMista.add(p5);
		
		listaMista2.add(p1);
		listaMista2.add(p2);
		listaMista2.add(p3);
		listaMista2.add(p4);
		listaMista2.add(p5);

		listaBoys.add(p3);
		listaBoys.add(p5);

		//System.out.println(listaProdotti);
		//log.info(listaProdotti.toString());
//		listaProdotti.addAll((Collection<? extends String>) new Product(012345, "Il Signore degli Anelli", "Books", 1.50));
//		listaProdotti.addAll((Collection<? extends String>) new Product(012345, "Bullboys", "Boys", 1.50));
		Cliente c1 = new Cliente(321, "Alberto", 4);
		Cliente c2 = new Cliente(320, "Luca", 2);
		Cliente c3 = new Cliente(324, "Vince", 1);

		listaClienti.add(c1);
		listaClienti.add(c2);
		listaClienti.add(c3);
		
		listaOrdini.add(new Order(323, "in corso", listaMista, c1));
		listaOrdini2.add(new Order(325, "Completata", listaMista2, c2));

		System.out.println(listaOrdini);
		
		filtraCategoria("Books");
		//filtraBoys();
//		
//		listaOrdini.addAll((Collection<? extends String>) new Order(3, "in corso", ))
	}
	//EX1
	public static void filtraCategoria(String category) {
		Stream<Object> streamFiltrato = listaMista.stream().filter(e -> e.category == category).filter(e -> e.price > 100).map(e -> e);
		List<Object> listaProdotti = streamFiltrato.collect(Collectors.toList());
		System.out.println(listaProdotti);
	};
	//EX3
//	public static void filtraBoys() {
//		//Stream<Object> streamFiltrato = listaBoys.stream().map(e -> (e.price)*0.1);
//		
//		List<Object> listaBoys = streamFiltrato.collect(Collectors.toList());
//		System.out.println(listaBoys);
//	};
	//EX4
	public static void filtraBaby(String category) {
		Stream<Object> streamFiltrato = listaMista.stream().filter(e -> e.category == category).filter(e -> e.price > 100).map(e -> e);
		List<Object> listaProdotti = streamFiltrato.collect(Collectors.toList());
		System.out.println(listaProdotti);
	};
}
