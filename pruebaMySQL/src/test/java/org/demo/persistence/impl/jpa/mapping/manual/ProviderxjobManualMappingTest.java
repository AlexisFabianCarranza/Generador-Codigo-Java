/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:21:09 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.demo.persistence.impl.jpa.mapping.manual;

import static org.junit.Assert.assertEquals;

import org.demo.data.record.ProviderxjobRecord;
import org.demo.persistence.impl.jpa.mapping.ProviderxjobMappingGenericTest;
import org.demo.persistence.impl.jpa.mapping.JpaMapper;
import org.junit.Test;

/**
 * Mapping tests for Providerxjob with 'manual mapping'
 * 
 * @author Telosys
 *
 */
public class ProviderxjobManualMappingTest extends ProviderxjobMappingGenericTest {

	@Test
	public void testGetMapperInstance() {

		JpaMapperProviderImpl provider = new JpaMapperProviderImpl();
		JpaMapper<?,?> mapper = provider.getMapperInstance(ProviderxjobRecord.class);
		assertEquals("ProviderxjobManualMapper", mapper.getClass().getSimpleName());
	}	

	@Test
	public void testMapping() {

		setMapperProvider(new JpaMapperProviderImpl()) ;
		processAllTest();
	}	
}
