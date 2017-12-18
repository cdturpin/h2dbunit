package com.aci.demo.h2dbunit.service;

import java.util.Collection;

import javax.persistence.Query;
import javax.persistence.PersistenceContext;

import javax.persistence.EntityManager;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.aci.demo.h2dbunit.domain.Characteristic;

@Service
@Transactional
public class CharacteristicsService {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	public Collection<Characteristic> findChar(String entityId) {
		Query query = this.entityManager.createNamedQuery("Characteristic.findChar");
		query.setParameter("entityId", entityId);
		return query.getResultList();
	}
}
