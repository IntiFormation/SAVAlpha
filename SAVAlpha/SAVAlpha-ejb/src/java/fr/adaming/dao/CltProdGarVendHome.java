package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.CltProdGarVend;
import fr.adaming.models.CltProdGarVendId;

/**
 * Home object for domain model class CltProdGarVend.
 * @see fr.adaming.models.CltProdGarVend
 * @author Hibernate Tools
 */
@Stateless
public class CltProdGarVendHome {

	private static final Log log = LogFactory.getLog(CltProdGarVendHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(CltProdGarVend transientInstance) {
		log.debug("persisting CltProdGarVend instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(CltProdGarVend persistentInstance) {
		log.debug("removing CltProdGarVend instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public CltProdGarVend merge(CltProdGarVend detachedInstance) {
		log.debug("merging CltProdGarVend instance");
		try {
			CltProdGarVend result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public CltProdGarVend findById(CltProdGarVendId id) {
		log.debug("getting CltProdGarVend instance with id: " + id);
		try {
			CltProdGarVend instance = entityManager.find(CltProdGarVend.class,
					id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
