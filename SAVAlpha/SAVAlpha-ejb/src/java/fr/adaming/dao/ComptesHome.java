package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Comptes;

/**
 * Home object for domain model class Comptes.
 * @see fr.adaming.models.Comptes
 * @author Hibernate Tools
 */
@Stateless
public class ComptesHome {

	private static final Log log = LogFactory.getLog(ComptesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Comptes transientInstance) {
		log.debug("persisting Comptes instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Comptes persistentInstance) {
		log.debug("removing Comptes instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Comptes merge(Comptes detachedInstance) {
		log.debug("merging Comptes instance");
		try {
			Comptes result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Comptes findById(int id) {
		log.debug("getting Comptes instance with id: " + id);
		try {
			Comptes instance = entityManager.find(Comptes.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
