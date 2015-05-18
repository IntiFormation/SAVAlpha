package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Reparations;

/**
 * Home object for domain model class Reparations.
 * @see fr.adaming.models.Reparations
 * @author Hibernate Tools
 */
@Stateless
public class ReparationsHome {

	private static final Log log = LogFactory.getLog(ReparationsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Reparations transientInstance) {
		log.debug("persisting Reparations instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Reparations persistentInstance) {
		log.debug("removing Reparations instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Reparations merge(Reparations detachedInstance) {
		log.debug("merging Reparations instance");
		try {
			Reparations result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Reparations findById(int id) {
		log.debug("getting Reparations instance with id: " + id);
		try {
			Reparations instance = entityManager.find(Reparations.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
