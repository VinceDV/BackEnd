package controller;

import java.time.LocalDate;
import java.util.List;

import dao.ElementiLibreriaDAO;
import dao.LibroDAO;
import dao.PrestitoDAO;
import dao.RivistaDAO;
import dao.UtenteDAO;
import Archivio.ElementiLibreria;
import Archivio.Libro;
import Archivio.Prestito;
import Archivio.Rivista;
import Archivio.Utente;
import utils.Periodicita;

public class MainProject {

	public static void main(String[] args) {
		
		LibroDAO l = new LibroDAO();
		
		Libro l4 = new Libro("Nemo", 2001, 200, "Topolino", "Bambini");
		Libro l2 = new Libro("Bambi", 2004, 202, "Giorgio", "Bambini");
		Libro l3 = new Libro("Polimorfismo", 2009, 2055, "Baglio", "Informatica");
//		
//		l.save(l4);
//		l.save(l2);
//		l.save(l3);

		
		RivistaDAO r = new RivistaDAO();
		
		Rivista r1 = new Rivista("Novella", 2000, 10, Periodicita.SETTIMANALE);
		Rivista r2 = new Rivista("Cioe", 2200, 4, Periodicita.MENSILE);
		Rivista r3 = new Rivista("Amici", 2400, 5, Periodicita.SEMESTRALE);
		
//		r.save(r1);
//		r.save(r2);
//		r.save(r3);
		
		UtenteDAO u = new UtenteDAO();
		
		Utente u1 = new Utente("Mario", "Rossi", LocalDate.of(1945, 12, 23));
		Utente u2 = new Utente("Umberto", "Eco", LocalDate.of(1949, 2, 15));
		Utente u3 = new Utente("Carmine", "Riggio", LocalDate.of(1939, 4, 20));
		
		ElementiLibreriaDAO e = new ElementiLibreriaDAO();
		
		//e.save(r3);
		e.delete(r3);
//		u.save(u1);
//		u.save(u2);
//		u.save(u3);
		
//		r.delete(r3);
//		u.delete(u2);
//		u.getAll();
//		
//		u.getById(6);
//		PrestitoDAO p = new PrestitoDAO();
		
//		Prestito p1 = new Prestito("");

	}

}
