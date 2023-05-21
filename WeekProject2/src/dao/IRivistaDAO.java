package dao;

import java.util.List;

import Archivio.Rivista;

public interface IRivistaDAO {
	public void save(Rivista r);
	public Rivista getById(long id);
	public void delete(Rivista r);
	public void update(Rivista r);
	public List<Rivista> getAll();
}