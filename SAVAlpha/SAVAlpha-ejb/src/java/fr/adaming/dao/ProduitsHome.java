package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Produits;

/**
 * Home object for domain model class Produits.
 * @see fr.adaming.models.Produits
 * @author Hibernate Tools
 */
@Stateless
public class ProduitsHome {

	private static final Log log = LogFactory.getLog(ProduitsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Produits transientInstance) {
		log.debug("persisting Produits instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Produits persistentInstance) {
		log.debug("removing Produits instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Produits merge(Produits detachedInstance) {
		log.debug("merging Produits instance");
		try {
			Produits result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Produits findById(int id) {
		log.debug("getting Produits instance with id: " + id);
		try {
			Produits instance = entityManager.find(Produits.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
