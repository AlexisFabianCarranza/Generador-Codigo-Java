/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:04:00 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.demo.persistence.impl.jpa;


import java.util.List;

import javax.inject.Named;

import org.demo.data.record.SequelizemetaRecord; // "Neutral Record" class 
import org.demo.persistence.SequelizemetaPersistence; // Persistence service interface
import org.demo.persistence.impl.jpa.commons.GenericJpaService;
import org.demo.persistence.impl.jpa.mapping.JpaMapper;
import org.demo.persistence.impl.jpa.mapping.JpaMapping;

import org.demo.persistence.impl.jpa.record.SequelizemetaJpaRecord; // "JPA Record" class (with JPA mapping) 

/**
 * Sequelizemeta persistence service - JPA implementation 
 * 
 * @author Telosys 
 *
 */
@Named("SequelizemetaPersistence")
public class SequelizemetaPersistenceJpa extends GenericJpaService<SequelizemetaJpaRecord, String> implements SequelizemetaPersistence {

	private final JpaMapper<SequelizemetaJpaRecord,SequelizemetaRecord> mapper = JpaMapping.getMapperProvider().getMapper(SequelizemetaJpaRecord.class,SequelizemetaRecord.class);

	/**
	 * Constructor
	 */
	public SequelizemetaPersistenceJpa() {
		super(SequelizemetaJpaRecord.class);
	}

	@Override
	public SequelizemetaRecord findById( String name ) {
		SequelizemetaJpaRecord entity = super.find( name );
		return mapper.mapEntityToRecord(entity);	
	}

	@Override
	public List<SequelizemetaRecord> findAll() {
		List<SequelizemetaJpaRecord> entities = super.loadAll() ;
		List<SequelizemetaRecord> records = new java.util.LinkedList<SequelizemetaRecord>();
		for ( SequelizemetaJpaRecord entity : entities ) {
			records.add( mapper.mapEntityToRecord(entity) ) ;
		}
		return records ;
	}

	@Override
	public SequelizemetaRecord create(SequelizemetaRecord record) {
		SequelizemetaJpaRecord entity = mapper.mapRecordToEntity(record);
		super.persist(entity);
		return record ;
	}
	
	@Override
	public boolean update(SequelizemetaRecord record) {
		String pk = record.getName() ;
		if ( super.find( pk ) != null ) {
			// Exists => 'merge' 
			SequelizemetaJpaRecord entity = mapper.mapRecordToEntity(record);
			super.merge(entity);
			return true ;
		}
		else {
			return false;
		}
	}

	@Override
	public SequelizemetaRecord save(SequelizemetaRecord record) {
		SequelizemetaJpaRecord entity = mapper.mapRecordToEntity(record);
		super.merge(entity);
		return record ;
	}

	@Override
	public boolean deleteById( String name ) {
		return super.remove( name );
	}

	@Override
	public boolean delete(SequelizemetaRecord record) {
		if ( record != null ) {
			return super.remove( record.getName() );
		}
		return false ;
	}

	@Override
	public long countAll() {
		Long count = (Long) super.execNamedQueryWithSingleResult( buildQueryName("countAll") ) ;
		return count.longValue();
	}

	public long countById(String name) {
		Long count = (Long) super.execNamedQueryWithSingleResult( buildQueryName("countById"), name ) ;
		return count.longValue();
	}
	
	@Override
	public boolean exists(String name) {
		long count = countById(name) ;
		return count > 0 ;
	}


	@Override
	public boolean exists(SequelizemetaRecord record) {
		if ( record != null ) {
			return exists( record.getName() );
		}
		return false ;
	}

	@SuppressWarnings("unchecked")
	public List<SequelizemetaJpaRecord> queryExample() {
		List<?> list = super.execNamedQuery(buildQueryName("theNamedQueryToBeUsed")) ;
		return (List<SequelizemetaJpaRecord>) list ;
	}

}