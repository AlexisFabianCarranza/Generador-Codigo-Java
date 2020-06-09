/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:04:00 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.demo.persistence.impl.jpa;


import java.util.List;

import javax.inject.Named;

import org.demo.data.record.UsersRecord; // "Neutral Record" class 
import org.demo.persistence.UsersPersistence; // Persistence service interface
import org.demo.persistence.impl.jpa.commons.GenericJpaService;
import org.demo.persistence.impl.jpa.mapping.JpaMapper;
import org.demo.persistence.impl.jpa.mapping.JpaMapping;

import org.demo.persistence.impl.jpa.record.UsersJpaRecord; // "JPA Record" class (with JPA mapping) 

/**
 * Users persistence service - JPA implementation 
 * 
 * @author Telosys 
 *
 */
@Named("UsersPersistence")
public class UsersPersistenceJpa extends GenericJpaService<UsersJpaRecord, Integer> implements UsersPersistence {

	private final JpaMapper<UsersJpaRecord,UsersRecord> mapper = JpaMapping.getMapperProvider().getMapper(UsersJpaRecord.class,UsersRecord.class);

	/**
	 * Constructor
	 */
	public UsersPersistenceJpa() {
		super(UsersJpaRecord.class);
	}

	@Override
	public UsersRecord findById( Integer id ) {
		UsersJpaRecord entity = super.find( id );
		return mapper.mapEntityToRecord(entity);	
	}

	@Override
	public List<UsersRecord> findAll() {
		List<UsersJpaRecord> entities = super.loadAll() ;
		List<UsersRecord> records = new java.util.LinkedList<UsersRecord>();
		for ( UsersJpaRecord entity : entities ) {
			records.add( mapper.mapEntityToRecord(entity) ) ;
		}
		return records ;
	}

	@Override
	public UsersRecord create(UsersRecord record) {
		UsersJpaRecord entity = mapper.mapRecordToEntity(record);
		super.persist(entity);
		return record ;
	}
	
	@Override
	public boolean update(UsersRecord record) {
		Integer pk = record.getId() ;
		if ( super.find( pk ) != null ) {
			// Exists => 'merge' 
			UsersJpaRecord entity = mapper.mapRecordToEntity(record);
			super.merge(entity);
			return true ;
		}
		else {
			return false;
		}
	}

	@Override
	public UsersRecord save(UsersRecord record) {
		UsersJpaRecord entity = mapper.mapRecordToEntity(record);
		super.merge(entity);
		return record ;
	}

	@Override
	public boolean deleteById( Integer id ) {
		return super.remove( id );
	}

	@Override
	public boolean delete(UsersRecord record) {
		if ( record != null ) {
			return super.remove( record.getId() );
		}
		return false ;
	}

	@Override
	public long countAll() {
		Long count = (Long) super.execNamedQueryWithSingleResult( buildQueryName("countAll") ) ;
		return count.longValue();
	}

	public long countById(Integer id) {
		Long count = (Long) super.execNamedQueryWithSingleResult( buildQueryName("countById"), id ) ;
		return count.longValue();
	}
	
	@Override
	public boolean exists(Integer id) {
		long count = countById(id) ;
		return count > 0 ;
	}


	@Override
	public boolean exists(UsersRecord record) {
		if ( record != null ) {
			return exists( record.getId() );
		}
		return false ;
	}

	@SuppressWarnings("unchecked")
	public List<UsersJpaRecord> queryExample() {
		List<?> list = super.execNamedQuery(buildQueryName("theNamedQueryToBeUsed")) ;
		return (List<UsersJpaRecord>) list ;
	}

}