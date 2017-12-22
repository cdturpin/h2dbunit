package com.aci.demo.h2dbunit.persistence;

import java.util.Collection;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.aci.demo.h2dbunit.model.Characteristic;

@Repository
public interface CharacteristicRepository extends CrudRepository<Characteristic, String> {
		
		Collection<Characteristic> findAll();

	}
