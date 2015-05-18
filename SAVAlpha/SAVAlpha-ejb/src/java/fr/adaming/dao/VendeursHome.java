package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Vendeurs;

/**
 * Home object for domain model class Vendeurs.
 * @see fr.adaming.models.Vendeurs
 * @author Hibernate Tools
 */
@Stateless
public class VendeursHome {

	private static final Log log = LogFactory.getLog(VendeursHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Vendeurs transientInstance) {
		log.debug("persisting Vendeurs instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Vendeurs persistentInstance) {
		log.debug("removing Vendeurs instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Vendeurs merge(Vendeurs detachedInstance) {
		log.debug("merging Vendeurs instance");
		try {
			Vendeurs result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Vendeurs findById(int id) {
		log.debug("getting Vendeurs instance with id: " + id);
		try {
			Vendeurs instance = entityManager.find(Vendeurs.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
