package com.aci.demo.h2dbunit.service;

import java.util.Collection;

import javax.persistence.Query;
import javax.persistence.PersistenceContext;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aci.demo.h2dbunit.model.Characteristic;

@Service
@Transactional
public class CharacteristicsService {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public Collection<Characteristic> find() {
		Query query = this.entityManager.createNamedQuery("Characteristic.find");
		return query.getResultList();
	}
	
	public Characteristic findById(String entityId) {
		Query query = this.entityManager.createNamedQuery("Characteristic.findById");
		query.setParameter("entityId", entityId);
		return (Characteristic) query.getSingleResult();
	}
}
