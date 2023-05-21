package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Archivio.ElementiLibreria;
import Archivio.Libro;
import Archivio.Rivista;
import utils.JpaUtil;

public class ElementiLibreriaDAO implements IElementiLibreriaDAO {


	@Override
	public void save(ElementiLibreria el) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(el);
			em.getTransaction().commit();
			if(el instanceof Libro) {
				System.out.println("Libro: " + el.getTitolo() + " salvato sul DB.");
			}else if(el instanceof Rivista) {
				System.out.println("Rivista: " + el.getTitolo() + " salvata sul DB.");
			}
			
		}catch(Exception e) {
			System.out.println("Errore su salvataggio del libro!"+e);
		}finally {
			em.close();
		}

	}

	@Override
	public ElementiLibreria getById(long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			ElementiLibreria l = em.find(ElementiLibreria.class, id);
			em.getTransaction().commit();
			return l;
		}catch(Exception e) {
			System.out.println("Errore su ricerca dell'elemento!" + e);
		}finally {
			em.close();
		}
		return null;
	}

	@Override
	public void delete(ElementiLibreria l) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(l);
			em.getTransaction().commit();
			System.out.println("Elemento " + l.getTitolo() + " eliminato dal database.");

				
		}catch(Exception e) {
				System.out.println("Errore su eliminazione del libro!" + e);
			
		} finally {
			em.close();
		}
	}

	@Override
	public void update(ElementiLibreria ev) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(ev);
			em.getTransaction().commit();
			System.out.println("Elemento modificato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su modifica!");
		} finally {
			em.close();
		}

	}

	@Override
	public List<Libro> getAllLibri() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT l FROM Libro l");
			return q.getResultList();
		}catch(Exception e) {
			System.out.println("Errore su lettura di tutti i libri!" + e);
		}finally {
			em.close();
		}
		return null;
	}

	@Override
	public List<Rivista> getAllRiviste() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT r FROM Rivista r");
			return q.getResultList();
		}catch(Exception e) {
			System.out.println("Errore su lettura di tutte le riviste!"+e);
		}finally {
			em.close();
		}
		return null;
	}

	public List<ElementiLibreria> getByAnnoPubblicazione(int n) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT c FROM Catalogo AS c WHERE c.annoPubblicazione = :anno_parametro");
			System.out.println("Ecco gli elementi del catalogo pubblicati nel: " + n);
			return q.setParameter("anno_parametro", n).getResultList();
		} catch(Exception e) {
			System.out.println("Errore su ricerca per anno pubblicazione !" + e);
		} finally {
			em.close();
		}
		return null;
	}

	public List<Libro> getByAutore(String s) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT c FROM Catalogo AS c WHERE c.autore = :autore_parametro");
			System.out.println("Ecco i pubblicati da: " + s);
			return q.setParameter("autore_parametro", s).getResultList();
		}catch(Exception e) {
			System.out.println("Errore su ricerca per autore!!" + e);
		}finally {
			em.close();
		}
		return null;
	}
	
	public List<ElementiLibreria> getByTitoloContenuto(String s) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT c FROM Catalogo AS c WHERE c.titolo LIKE :titolo_parametro  ");
			System.out.println("Ecco gli elementi che nel loro titolo contengono: "+s);
			return q.setParameter("titolo_parametro", "%" + s + "%").getResultList();
		}catch(Exception e) {
			System.out.println("Errore su ricerca per titolo!!" + e);
		}finally {
			em.close();
		}
		return null;
	}
}