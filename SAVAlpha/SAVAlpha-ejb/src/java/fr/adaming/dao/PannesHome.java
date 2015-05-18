package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import fr.adaming.models.Pannes;

/**
 * Home object for domain model class Pannes.
 * @see fr.adaming.models.Pannes
 * @author Hibernate Tools
 */
@Stateless
public class PannesHome {

	private static final Log log = LogFactory.getLog(PannesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Pannes transientInstance) {
		log.debug("persisting Pannes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Pannes persistentInstance) {
		log.debug("removing Pannes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Pannes merge(Pannes detachedInstance) {
		log.debug("merging Pannes instance");
		try {
			Pannes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Pannes findById(int id) {
		log.debug("getting Pannes instance with id: " + id);
		try {
			Pannes instance = entityManager.find(Pannes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
