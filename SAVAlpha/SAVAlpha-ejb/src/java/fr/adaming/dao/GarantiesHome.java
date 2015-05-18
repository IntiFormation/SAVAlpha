package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Garanties;

/**
 * Home object for domain model class Garanties.
 * @see fr.adaming.models.Garanties
 * @author Hibernate Tools
 */
@Stateless
public class GarantiesHome {

	private static final Log log = LogFactory.getLog(GarantiesHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Garanties transientInstance) {
		log.debug("persisting Garanties instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Garanties persistentInstance) {
		log.debug("removing Garanties instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Garanties merge(Garanties detachedInstance) {
		log.debug("merging Garanties instance");
		try {
			Garanties result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Garanties findById(int id) {
		log.debug("getting Garanties instance with id: " + id);
		try {
			Garanties instance = entityManager.find(Garanties.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
