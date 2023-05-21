package dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import Archivio.ElementiLibreria;
import Archivio.Libro;
import Archivio.Rivista;
import Archivio.Utente;
import utils.JpaUtil;

public class UtenteDAO implements IUtenteDAO{

	@Override
	public void save(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.persist(u);
			em.getTransaction().commit();
			System.out.println("Utente: " + u.getNome() + " " + u.getCognome() + " salvato sul DB.");		
		}catch(Exception e) {
			System.out.println("Errore su salvataggio dell'utente!" + e);
		}finally {
			em.close();
		}

	}

	@Override
	public Utente getById(long id) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			Utente l = em.find(Utente.class, id);
			em.getTransaction().commit();
			return l;
		}catch(Exception e) {
			System.out.println("Errore su ricerca utente!" + e);
		}finally {
			em.close();
		}
		return null;
	}

	@Override
	public void delete(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.remove(u);
			em.getTransaction().commit();
			System.out.println("Utente " + u.getNome() + " eliminato");
				
		}catch(Exception e) {
				System.out.println("Errore su eliminazione dell'utente!" + e);
			
		} finally {
			em.close();
		}
	}

	@Override
	public void update(Utente u) {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			em.getTransaction().begin();
			em.merge(u);
			em.getTransaction().commit();
			System.out.println("Utente modificato nel DB!!");
		} catch (Exception e) {
			em.getTransaction().rollback();
			System.out.println("Errore su modifica!");
		} finally {
			em.close();
		}

	}

	@Override
	public List<Utente> getAll() {
		EntityManager em = JpaUtil.getEntityManagerFactory().createEntityManager();
		try {
			Query q = em.createQuery("SELECT u FROM Utente u");
			return q.getResultList();
		}catch(Exception e) {
			System.out.println("Errore su lettura di tutti gli utenti!" + e);
		}finally {
			em.close();
		}
		return null;
	}

}
