/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:08:43 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */
package org.demo.persistence.impl.jpa.mapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.demo.data.record.ProvidersRecord;
import org.demo.persistence.impl.jpa.record.ProvidersJpaRecord ;

/**
 * Generic tests for Providers mapping
 *
 */
public abstract class ProvidersMappingGenericTest {

	protected void setMapperProvider(JpaMapperProvider provider) {
		JpaMapping.setMapperProvider(provider);
		System.out.println("Mapper provider set to : " + provider.getClass().getCanonicalName() );
	}
	
	protected void processAllTest() {
		testPojoMapping();
		testEntityMapping();
	}
	
	private ProvidersJpaRecord buildJpaRecord() {
		ProvidersJpaRecord entity = new ProvidersJpaRecord();
		entity.setId(Integer.valueOf(100)); 
		entity.setUserid(Integer.valueOf(100)); 
		entity.setPhone(Integer.valueOf(100)); 
		entity.setDescription("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		entity.setAddress("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		entity.setCreatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		entity.setUpdatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		return entity ;
	}
	
	private ProvidersRecord buildRecord() {
		ProvidersRecord pojo = new ProvidersRecord();
		pojo.setId(Integer.valueOf(100)); 
		pojo.setUserid(Integer.valueOf(100)); 
		pojo.setPhone(Integer.valueOf(100)); 
		pojo.setDescription("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		pojo.setAddress("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		pojo.setCreatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		pojo.setUpdatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		return pojo ;
	}

	private void checkValues(ProvidersRecord r1, ProvidersRecord r2) {
		assertTrue(r1 != r2); // different instances
		assertEquals(r1.getId(), r2.getId());
		assertEquals(r1.getUserid(), r2.getUserid());
		assertEquals(r1.getPhone(), r2.getPhone());
		assertEquals(r1.getDescription(), r2.getDescription());
		assertEquals(r1.getAddress(), r2.getAddress());
		assertEquals(r1.getCreatedat(), r2.getCreatedat());
		assertEquals(r1.getUpdatedat(), r2.getUpdatedat());
	}

	private void checkValues(ProvidersJpaRecord r1, ProvidersJpaRecord r2) {
		assertTrue(r1 != r2); // different instances
		assertEquals(r1.getId(), r2.getId());
		assertEquals(r1.getUserid(), r2.getUserid());
		assertEquals(r1.getPhone(), r2.getPhone());
		assertEquals(r1.getDescription(), r2.getDescription());
		assertEquals(r1.getAddress(), r2.getAddress());
		assertEquals(r1.getCreatedat(), r2.getCreatedat());
		assertEquals(r1.getUpdatedat(), r2.getUpdatedat());
	}
	
	protected void testPojoMapping() {
		System.out.println("Test POJO mapping" );
    	JpaMapper<ProvidersJpaRecord,ProvidersRecord> mapper = JpaMapping.getMapperProvider().getMapper(ProvidersJpaRecord.class, ProvidersRecord.class);
    	ProvidersRecord pojo1 = buildRecord();
    	ProvidersJpaRecord entity = mapper.mapRecordToEntity(pojo1);
    	ProvidersRecord pojo2 = mapper.mapEntityToRecord(entity);
    	checkValues(pojo1, pojo2);
    	// Test null 
    	assertNull(mapper.mapRecordToEntity(null));
	}
	
	protected void testEntityMapping() {
		System.out.println("Test ENTITY mapping" );
    	JpaMapper<ProvidersJpaRecord,ProvidersRecord> mapper = JpaMapping.getMapperProvider().getMapper(ProvidersJpaRecord.class, ProvidersRecord.class);
		ProvidersJpaRecord entity1 = buildJpaRecord();
		ProvidersRecord pojo = mapper.mapEntityToRecord(entity1);
		ProvidersJpaRecord entity2 = mapper.mapRecordToEntity(pojo);
    	checkValues(entity1, entity2);
    	// Test null 
    	assertNull(mapper.mapEntityToRecord(null));
	}
	
}