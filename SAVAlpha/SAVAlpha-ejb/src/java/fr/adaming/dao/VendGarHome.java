package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.VendGar;
import fr.adaming.models.VendGarId;

/**
 * Home object for domain model class VendGar.
 * @see fr.adaming.models.VendGar
 * @author Hibernate Tools
 */
@Stateless
public class VendGarHome {

	private static final Log log = LogFactory.getLog(VendGarHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(VendGar transientInstance) {
		log.debug("persisting VendGar instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(VendGar persistentInstance) {
		log.debug("removing VendGar instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public VendGar merge(VendGar detachedInstance) {
		log.debug("merging VendGar instance");
		try {
			VendGar result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public VendGar findById(VendGarId id) {
		log.debug("getting VendGar instance with id: " + id);
		try {
			VendGar instance = entityManager.find(VendGar.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
