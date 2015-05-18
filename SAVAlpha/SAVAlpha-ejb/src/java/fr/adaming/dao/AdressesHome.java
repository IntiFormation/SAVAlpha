package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Adresses;

/**
 * Home object for domain model class Adresses.
 * @see fr.adaming.models.Adresses
 * @author Hibernate Tools
 */
@Stateless
public class AdressesHome {

	private static final Log log = LogFactory.getLog(AdressesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Adresses transientInstance) {
		log.debug("persisting Adresses instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Adresses persistentInstance) {
		log.debug("removing Adresses instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Adresses merge(Adresses detachedInstance) {
		log.debug("merging Adresses instance");
		try {
			Adresses result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Adresses findById(int id) {
		log.debug("getting Adresses instance with id: " + id);
		try {
			Adresses instance = entityManager.find(Adresses.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
