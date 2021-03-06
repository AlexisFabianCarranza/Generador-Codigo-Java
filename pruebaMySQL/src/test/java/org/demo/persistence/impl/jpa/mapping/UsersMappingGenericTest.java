/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:21:09 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */
package org.demo.persistence.impl.jpa.mapping;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.demo.data.record.UsersRecord;
import org.demo.persistence.impl.jpa.record.UsersJpaRecord ;

/**
 * Generic tests for Users mapping
 *
 */
public abstract class UsersMappingGenericTest {

	protected void setMapperProvider(JpaMapperProvider provider) {
		JpaMapping.setMapperProvider(provider);
		System.out.println("Mapper provider set to : " + provider.getClass().getCanonicalName() );
	}
	
	protected void processAllTest() {
		testPojoMapping();
		testEntityMapping();
	}
	
	private UsersJpaRecord buildJpaRecord() {
		UsersJpaRecord entity = new UsersJpaRecord();
		entity.setId(Integer.valueOf(100)); 
		entity.setName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		entity.setEmail("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		entity.setPassword("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		entity.setCreatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		entity.setUpdatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		return entity ;
	}
	
	private UsersRecord buildRecord() {
		UsersRecord pojo = new UsersRecord();
		pojo.setId(Integer.valueOf(100)); 
		pojo.setName("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		pojo.setEmail("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		pojo.setPassword("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA"); 
		pojo.setCreatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		pojo.setUpdatedat(java.sql.Timestamp.valueOf("2001-05-21 01:46:52")); 
		return pojo ;
	}

	private void checkValues(UsersRecord r1, UsersRecord r2) {
		assertTrue(r1 != r2); // different instances
		assertEquals(r1.getId(), r2.getId());
		assertEquals(r1.getName(), r2.getName());
		assertEquals(r1.getEmail(), r2.getEmail());
		assertEquals(r1.getPassword(), r2.getPassword());
		assertEquals(r1.getCreatedat(), r2.getCreatedat());
		assertEquals(r1.getUpdatedat(), r2.getUpdatedat());
	}

	private void checkValues(UsersJpaRecord r1, UsersJpaRecord r2) {
		assertTrue(r1 != r2); // different instances
		assertEquals(r1.getId(), r2.getId());
		assertEquals(r1.getName(), r2.getName());
		assertEquals(r1.getEmail(), r2.getEmail());
		assertEquals(r1.getPassword(), r2.getPassword());
		assertEquals(r1.getCreatedat(), r2.getCreatedat());
		assertEquals(r1.getUpdatedat(), r2.getUpdatedat());
	}
	
	protected void testPojoMapping() {
		System.out.println("Test POJO mapping" );
    	JpaMapper<UsersJpaRecord,UsersRecord> mapper = JpaMapping.getMapperProvider().getMapper(UsersJpaRecord.class, UsersRecord.class);
    	UsersRecord pojo1 = buildRecord();
    	UsersJpaRecord entity = mapper.mapRecordToEntity(pojo1);
    	UsersRecord pojo2 = mapper.mapEntityToRecord(entity);
    	checkValues(pojo1, pojo2);
    	// Test null 
    	assertNull(mapper.mapRecordToEntity(null));
	}
	
	protected void testEntityMapping() {
		System.out.println("Test ENTITY mapping" );
    	JpaMapper<UsersJpaRecord,UsersRecord> mapper = JpaMapping.getMapperProvider().getMapper(UsersJpaRecord.class, UsersRecord.class);
		UsersJpaRecord entity1 = buildJpaRecord();
		UsersRecord pojo = mapper.mapEntityToRecord(entity1);
		UsersJpaRecord entity2 = mapper.mapRecordToEntity(pojo);
    	checkValues(entity1, entity2);
    	// Test null 
    	assertNull(mapper.mapEntityToRecord(null));
	}
	
}
