package fr.adaming.dao;

// Generated 18 mai 2015 13:37:22 by Hibernate Tools 3.4.0.CR1

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import fr.adaming.models.Clients;

/**
 * Home object for domain model class Clients.
 * @see fr.adaming.models.Clients
 * @author Hibernate Tools
 */
@Stateless
public class ClientsHome {

	private static final Log log = LogFactory.getLog(ClientsHome.class);

	@PersistenceContext
	private EntityManager entityManager;

	public void persist(Clients transientInstance) {
		log.debug("persisting Clients instance");
		try {
			entityManager.persist(transientInstance);
			log.debug("persist successful");
		} catch (RuntimeException re) {
			log.error("persist failed", re);
			throw re;
		}
	}

	public void remove(Clients persistentInstance) {
		log.debug("removing Clients instance");
		try {
			entityManager.remove(persistentInstance);
			log.debug("remove successful");
		} catch (RuntimeException re) {
			log.error("remove failed", re);
			throw re;
		}
	}

	public Clients merge(Clients detachedInstance) {
		log.debug("merging Clients instance");
		try {
			Clients result = entityManager.merge(detachedInstance);
			log.debug("merge successful");
			return result;
		} catch (RuntimeException re) {
			log.error("merge failed", re);
			throw re;
		}
	}

	public Clients findById(int id) {
		log.debug("getting Clients instance with id: " + id);
		try {
			Clients instance = entityManager.find(Clients.class, id);
			log.debug("get successful");
			return instance;
		} catch (RuntimeException re) {
			log.error("get failed", re);
			throw re;
		}
	}
}
