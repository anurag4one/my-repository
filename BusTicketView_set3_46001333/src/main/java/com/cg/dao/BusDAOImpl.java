package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import com.cg.entity.BusDetails;

@Repository
public class BusDAOImpl implements IBusDao {
	
	@PersistenceContext(name = "MyJPA")
	private EntityManager mgr;

	public List<BusDetails> listAll() {
		return mgr.createNamedQuery("listAll").getResultList();
	}

}
