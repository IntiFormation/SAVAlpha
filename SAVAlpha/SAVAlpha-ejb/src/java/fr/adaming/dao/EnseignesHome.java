package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Enseignes;

/**
 * Home object for domain model class Enseignes.
 * @see fr.adaming.models.Enseignes
 * @author Hibernate Tools
 */
@Stateless
public class EnseignesHome {

	private static final Log log = LogFactory.getLog(EnseignesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Enseignes transientInstance) {
		log.debug("persisting Enseignes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Enseignes persistentInstance) {
		log.debug("removing Enseignes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Enseignes merge(Enseignes detachedInstance) {
		log.debug("merging Enseignes instance");
		try {
			Enseignes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Enseignes findById(int id) {
		log.debug("getting Enseignes instance with id: " + id);
		try {
			Enseignes instance = entityManager.find(Enseignes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
