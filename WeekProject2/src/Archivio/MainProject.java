package Archivio;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;


import java.time.LocalDate;
import java.io.*;

public class MainProject {

	enum Periodicita {
		SETTIMANALE, MENSILE, SEMESTRALE
	}

	static String nomeFile = "libreria.txt";

	public static List<ElementiLibreria> libreria = new ArrayList<>();

	public static void main(String[] args) throws Exception {

		ElementiLibreria l4 = new Libro("Nemo", 2001, 200, "Topolino", "Bambini");
		ElementiLibreria l2 = new Libro("Bambi", 2004, 202, "Giorgio", "Bambini");
		ElementiLibreria l3 = new Libro("Polimorfismo", 2009, 2055, "Baglio", "Informatica");

		ElementiLibreria r1 = new Rivista("Novella", 2000, 10, Periodicita.SETTIMANALE);
		ElementiLibreria r2 = new Rivista("Cioe", 2200, 4, Periodicita.MENSILE);
		ElementiLibreria r3 = new Rivista("Amici", 2400, 5, Periodicita.SEMESTRALE);

		libreria.add(l4);
		libreria.add(l2);
		libreria.add(l3);
		libreria.add(r1);
		libreria.add(r2);
		libreria.add(r3);
		System.out.println("Ciao e benvenuto alla nosra biblioteca! Ecco i nostri libri e riviste:");
		System.out.println(" ");
		mostraLibreria();

		System.out.println(" ");

		boolean ok = true;
		do {
			System.out.println("Cosa vuoi fare? Scegli un'opzione disponibile o digita '0' per uscire: ");
			System.out.println(" ");
			System.out.println("1 -creare un libro e aggiungerlo alla libreria;");
			System.out.println("2 -creare una rivista e aggiungerla alla libreria;");
			System.out.println("3 -cercare un elemento tramite codice;");
			System.out.println("4 -cercare un elemento tramite anno di pubblicazione;");
			System.out.println("5 -cercare un libro tramite autore;");
			System.out.println("6 -eliminare un elemento;");
			System.out.println("7 -ristampa la libreria;");
			System.out.println("0 -per uscire;");

			Scanner scanner = new Scanner(System.in);
			String risposta = scanner.nextLine();

			switch (risposta) {
			case "1":
				creazioneLibro();
				break;
			case "2":
				creazioneRivista();
				break;
			case "3":
				ricercaPerCodice();
				break;
			case "4":
				ricercaPerAnno();
				break;
			case "5":
				ricercaPerAutore();
				break;
			case "6":
				rimuoviElemento();
				break;
			case "7":
				mostraLibreria();
				break;
			case "0":
				System.out.println("Arrivederci!");
				ok = false;
				break;
			default:
				System.out.println("Inserisci una risposta corretta!");
				break;
			}
		} while (ok);

//		System.out.println(mapLibri);
//		aggiuntaElemento("1", "Bambi");
//		aggiuntaElemento("0", "Nemo");
//		rimuoviElemento("1");
//		System.out.println(mapLibri);
//		System.out.println(ricercaPerCodice("0"));
//		ricercaPerAutore("gianni");
	}

	public static void mostraLibreria() {
		for (ElementiLibreria element : libreria) {
			System.out.println(element);
		}
	}

	public static void creazioneLibro() {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Benvenuto nella creazione libro");
		System.out.print("Inserisci il titolo: ");
		String titolo = scanner.nextLine();

		int anno = 0;
		boolean validAnno = false;
		while (!validAnno) {
			System.out.print("Inserisci l'anno di pubblicazione: ");
			if (scanner.hasNextInt()) {
				anno = scanner.nextInt();
				validAnno = true;
			} else {
				System.out.println("Input non valido. Inserisci un numero intero per l'anno.");
				scanner.nextLine();
			}
		}
		
		int pagine = 0;
		boolean validPagine = false;
		while (!validPagine) {
		    System.out.print("Inserisci il numero delle pagine: ");
		    if (scanner.hasNextInt()) {
		        pagine = scanner.nextInt();
		        validPagine = true;
		        scanner.nextLine(); 
		    } else {
		        System.out.println("Input non valido. Inserisci un numero intero per il numero di pagine.");
		        scanner.nextLine();
		    }
		}

		System.out.print("Inserisci l'autore: ");
		String autore = scanner.nextLine();

		System.out.print("Inserisci il genere: ");
		String genere = scanner.nextLine();

		ElementiLibreria l1 = new Libro(titolo, anno, pagine, autore, genere);

		System.out.println("Libro creato correttamente.");
		System.out.println(l1);
		libreria.add(l1);
//		salvaLibreriaSuFile();
		mostraLibreria();
		System.out.println(" ");

		// salvare gli elementi su file e poi leggerlo cosi' da creare una specie di
		// memoria
	}

	public static void creazioneRivista() {
		BufferedReader reader = null;
		Scanner scanner = new Scanner(System.in);
		System.out.println("Benvenuto nella creazione rivista");
		
		
		System.out.print("Inserisci il titolo: ");
		String titolo = scanner.nextLine();

		int anno = 0;
		boolean validAnno = false;
		while (!validAnno) {
			System.out.print("Inserisci l'anno di pubblicazione: ");
			if (scanner.hasNextInt()) {
				anno = scanner.nextInt();
				validAnno = true;
			} else {
				System.out.println("Input non valido. Inserisci un numero intero per l'anno.");
				scanner.nextLine();
			}
		}

		int pagine = 0;
		boolean validPagine = false;
		while (!validPagine) {
		    System.out.print("Inserisci il numero delle pagine: ");
		    if (scanner.hasNextInt()) {
		        pagine = scanner.nextInt();
		        validPagine = true;
		        scanner.nextLine(); 
		    } else {
		        System.out.println("Input non valido. Inserisci un numero intero per il numero di pagine.");
		        scanner.nextLine();
		    }
		}

		Periodicita input = null;
		boolean validInput = false;
		while (!validInput) {
		    System.out.print("Inserisci la periodicita' (SETTIMANALE, MENSILE, SEMESTRALE): ");
		    String periodicita = scanner.nextLine().toUpperCase();
		    
		    if (periodicita.equals("SETTIMANALE") || periodicita.equals("MENSILE") || periodicita.equals("SEMESTRALE")) {
		        input = Periodicita.valueOf(periodicita);
		        validInput = true;
		    } else {
		        System.out.println("Input non valido. Inserisci una delle seguenti opzioni: SETTIMANALE, MENSILE, SEMESTRALE.");
		    }
		}
		
		ElementiLibreria r5 = new Rivista(titolo, anno, pagine, input);

		System.out.println("Rivista creata correttamente.");
		System.out.println(r5);
		libreria.add(r5);
		mostraLibreria();
		System.out.println(" ");
	}

	private static void rimuoviElemento() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci l'ISBN dell'elemento da rimuovere: ");
		int idDaEliminare = scanner.nextInt();

		boolean elementoTrovato = false;
		Iterator<ElementiLibreria> iterator = libreria.iterator();
		while (iterator.hasNext()) {
			ElementiLibreria elemento = iterator.next();
			if (elemento.ISBN == idDaEliminare) {
				iterator.remove();
				System.out.println("Elemento con ID " + idDaEliminare + " rimosso.");
				System.out.println(" ");
				break;
			}
		}
		if (!elementoTrovato) {
			System.out.println("Nessun elemento trovato con l'ISBN " + idDaEliminare);
			System.out.println(" ");
		}
	}

	private static void ricercaPerCodice() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci l'ISBN dell'elemento che stai cercando: ");
		int idDaCercare = scanner.nextInt();
		boolean elementoTrovato = false;
		Iterator<ElementiLibreria> iterator = libreria.iterator();
		while (iterator.hasNext()) {
			ElementiLibreria elemento = iterator.next();
			if (elemento.ISBN == idDaCercare) {
				System.out.println(elemento.ISBN + ": " + elemento);
				elementoTrovato = true;
				System.out.println(" ");
				break;
			}
		}

		if (!elementoTrovato) {
			System.out.println("Nessun elemento trovato con l'ISBN " + idDaCercare);
			System.out.println(" ");
		}
	}

	private static void ricercaPerAnno() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci l'anno di pubblicazione dell'elemento che stai cercando: ");
		int annoPubblicazione = scanner.nextInt();

		boolean elementoTrovato = false;
		Iterator<ElementiLibreria> iterator = libreria.iterator();
		while (iterator.hasNext()) {
			ElementiLibreria elemento = iterator.next();
			if (elemento.anno == annoPubblicazione) {
				System.out.println(elemento.anno + ": " + elemento);
				System.out.println(" ");
				elementoTrovato = true;
				break;
			}
		}
		if (!elementoTrovato) {
			System.out.println("Nessun elemento trovato con l'anno di pubblicazione " + annoPubblicazione);
			System.out.println(" ");
		}
	}

	private static void ricercaPerAutore() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Inserisci l'autore dell'elemento che stai cercando: ");
		String autore = scanner.nextLine();

		boolean elementoTrovato = false;
		Iterator<ElementiLibreria> iterator = libreria.iterator();
		while (iterator.hasNext()) {
			ElementiLibreria elemento = iterator.next();
			if (elemento instanceof Libro) {
				Libro libro = (Libro) elemento;
				if (libro.getAutore().equals(autore)) {
					System.out.println(libro.getAutore() + ": " + libro);
					elementoTrovato = true;
					System.out.println(" ");
					break;
				}
			}

		}
		if (!elementoTrovato) {
			System.out.println("Nessun elemento trovato con l'autore " + autore);
			System.out.println(" ");
		}
	}
//
//	public static void salvaLibreriaSuFile() {
//	    try (FileOutputStream fileOut = new FileOutputStream(nomeFile);
//	            ObjectOutputStream objectOut = new ObjectOutputStream(fileOut)) {
//	        objectOut.writeObject(libreria);
//	        System.out.println("La libreria è stata salvata correttamente nel file " + nomeFile);
//	    } catch (IOException e) {
//	        System.out.println("Si è verificato un errore durante il salvataggio della libreria: " + e.getMessage());
//	    }
//	}
//	public static void caricaListaDaFile() {
//	    try (FileInputStream fileIn = new FileInputStream(nomeFile);
//	            ObjectInputStream objectIn = new ObjectInputStream(fileIn)) {
//	        libreria = (List<ElementiLibreria>) objectIn.readObject();
//	        System.out.println("La libreria è stata caricata correttamente dal file " + nomeFile);
//	    } catch (IOException | ClassNotFoundException e) {
//	        System.out.println("Si è verificato un errore durante il caricamento della libreria: " + e.getMessage());
//	    }
//	}
//

}
