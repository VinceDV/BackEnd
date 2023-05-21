package dao;

import java.util.List;

import Archivio.ElementiLibreria;
import Archivio.Prestito;

public interface IPrestitoDAO {
	public void save(Prestito p);
	public Prestito getById(long id);
	public void delete(Prestito p);
	public void update(Prestito p);
	public List<Prestito> getAll();
	public List<Prestito> getElementiInPrestitoNonRestituiti();
	public List<ElementiLibreria> getElementiInPrestitoConIdUtente(long id);
	
}