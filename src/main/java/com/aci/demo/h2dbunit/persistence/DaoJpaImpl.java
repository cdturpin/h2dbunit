package com.aci.demo.h2dbunit.persistence;

import java.io.Serializable;
import java.lang.reflect.ParameterizedType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;


/**
 * @author h38
 *
 *	For more information, read Don't repeat the DAO! 
 *	https://www.ibm.com/developerworks/java/library/j-genericdao/index.html
 *	Perhaps a DAO is not needed, but it depends on how complex the app is 
 *  going to be...data access via stored procedures, flat files?...use DAO...
 *  
 *  simple and JPA can deal with it...drop the DAO...JPA has its own
 *  http://www.corej2eepatterns.com/Patterns2ndEd/DomainStore.htm
 *
 * @param <T> any type that uses a primary key identifier
 * @param <PK>
 */
public class DaoJpaImpl<T, PK extends Serializable> implements Dao<T, PK> {

	protected Class<T> entityClass;

    @PersistenceContext
    protected EntityManager entityManager;

    @SuppressWarnings("unchecked")
	public DaoJpaImpl() {
        ParameterizedType genericSuperclass = (ParameterizedType) getClass().getGenericSuperclass();
        this.entityClass = (Class<T>) genericSuperclass.getActualTypeArguments()[0];
    }
 
	@Override
	public T create(T t) {
		this.entityManager.persist(t);
		return t;
	}

	@Override
	public T read(PK id) {
		 return this.entityManager.find(entityClass, id);
	}

	@Override
	public T update(T t) {
		return this.entityManager.merge(t);
	}

	@Override
	public void delete(T t) {
		t = this.entityManager.merge(t);
        this.entityManager.remove(t);
	}

}
