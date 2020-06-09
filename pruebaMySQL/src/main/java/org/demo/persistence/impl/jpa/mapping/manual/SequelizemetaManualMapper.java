/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:08:44 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */
package org.demo.persistence.impl.jpa.mapping.manual;

import org.demo.data.record.SequelizemetaRecord;
import org.demo.persistence.impl.jpa.mapping.JpaMapper;
import org.demo.persistence.impl.jpa.record.SequelizemetaJpaRecord;

/**
 * Manual mapping for "Sequelizemeta" 
 *
 * @author Telosys
 *
 */
public class SequelizemetaManualMapper implements JpaMapper<SequelizemetaJpaRecord, SequelizemetaRecord> {

	@Override
	public SequelizemetaRecord mapEntityToRecord(SequelizemetaJpaRecord entity) {
		if ( entity == null ) return null ;
		SequelizemetaRecord pojo = new SequelizemetaRecord();
		pojo.setName(entity.getName()); 
		return pojo;
	}

	@Override
	public SequelizemetaJpaRecord mapRecordToEntity(SequelizemetaRecord pojo) {
		if ( pojo == null ) return null ;
		SequelizemetaJpaRecord entity = new SequelizemetaJpaRecord();
		entity.setName(pojo.getName()); 
		return entity;
	}

}