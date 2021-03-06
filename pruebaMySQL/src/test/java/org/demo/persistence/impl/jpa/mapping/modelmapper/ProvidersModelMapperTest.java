/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 12:21:09 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */

package org.demo.persistence.impl.jpa.mapping.modelmapper;

import org.demo.persistence.impl.jpa.mapping.ProvidersMappingGenericTest;
import org.junit.Test;

/**
 * Mapping tests for Providers with 'model mapper'
 * 
 * @author Telosys
 *
 */
public class ProvidersModelMapperTest extends ProvidersMappingGenericTest {

	@Test
	public void testMapping() {

		setMapperProvider(new JpaMapperProviderImpl()) ;
		processAllTest();
	}	
}
