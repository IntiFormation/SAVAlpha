package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.ProdGar;
import fr.adaming.models.ProdGarId;

/**
 * Home object for domain model class ProdGar.
 * @see fr.adaming.models.ProdGar
 * @author Hibernate Tools
 */
@Stateless
public class ProdGarHome {

	private static final Log log = LogFactory.getLog(ProdGarHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProdGar transientInstance) {
		log.debug("persisting ProdGar instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProdGar persistentInstance) {
		log.debug("removing ProdGar instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProdGar merge(ProdGar detachedInstance) {
		log.debug("merging ProdGar instance");
		try {
			ProdGar result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProdGar findById(ProdGarId id) {
		log.debug("getting ProdGar instance with id: " + id);
		try {
			ProdGar instance = entityManager.find(ProdGar.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
