package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Reparateurs;

/**
 * Home object for domain model class Reparateurs.
 * @see fr.adaming.models.Reparateurs
 * @author Hibernate Tools
 */
@Stateless
public class ReparateursHome {

	private static final Log log = LogFactory.getLog(ReparateursHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Reparateurs transientInstance) {
		log.debug("persisting Reparateurs instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Reparateurs persistentInstance) {
		log.debug("removing Reparateurs instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Reparateurs merge(Reparateurs detachedInstance) {
		log.debug("merging Reparateurs instance");
		try {
			Reparateurs result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Reparateurs findById(int id) {
		log.debug("getting Reparateurs instance with id: " + id);
		try {
			Reparateurs instance = entityManager.find(Reparateurs.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
