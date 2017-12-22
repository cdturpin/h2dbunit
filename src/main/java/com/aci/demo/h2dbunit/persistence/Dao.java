package com.aci.demo.h2dbunit.persistence;

import java.io.Serializable;

/**
 * @author h38
 * 
 * 	This may or may not be needed...depends on the complexity of JPA application
 *
 * @param <T>
 * @param <PK>
 */
public interface Dao<T, PK extends Serializable> {
	T create(T t);
    T read(PK id);
    T update(T t);
    void delete(T t);
}
