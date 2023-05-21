package dao;

import java.util.List;

import Archivio.ElementiLibreria;
import Archivio.Libro;
import Archivio.Rivista;

public interface IElementiLibreriaDAO {
	public void save(ElementiLibreria e);
	public ElementiLibreria getById(long id);
	public void delete(ElementiLibreria e);
	public void update(ElementiLibreria e);
	public List<Libro> getAllLibri();
	public List<Rivista> getAllRiviste();
	public List<ElementiLibreria> getByAnnoPubblicazione(int n);
	public List<Libro> getByAutore(String s);
	public List<ElementiLibreria> getByTitoloContenuto(String s);
}	
