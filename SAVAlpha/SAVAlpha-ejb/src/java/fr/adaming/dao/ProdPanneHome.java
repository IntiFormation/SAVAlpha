package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.ProdPanne;
import fr.adaming.models.ProdPanneId;

/**
 * Home object for domain model class ProdPanne.
 * @see fr.adaming.models.ProdPanne
 * @author Hibernate Tools
 */
@Stateless
public class ProdPanneHome {

	private static final Log log = LogFactory.getLog(ProdPanneHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(ProdPanne transientInstance) {
		log.debug("persisting ProdPanne instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(ProdPanne persistentInstance) {
		log.debug("removing ProdPanne instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public ProdPanne merge(ProdPanne detachedInstance) {
		log.debug("merging ProdPanne instance");
		try {
			ProdPanne result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public ProdPanne findById(ProdPanneId id) {
		log.debug("getting ProdPanne instance with id: " + id);
		try {
			ProdPanne instance = entityManager.find(ProdPanne.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
