/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 11:53:29 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */
package org.demo.persistence.impl.springdatajpa;

import org.demo.persistence.SequelizemetaPersistence ;
import org.demo.persistence.SequelizemetaPersistenceGenericTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JUnit tests for Sequelizemeta persistence service
 * 
 * @author Telosys Tools
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
public class SequelizemetaPersistenceJpaTest extends SequelizemetaPersistenceGenericTest {

	@Autowired
	private SequelizemetaPersistence sequelizemetaPersistenceService;

	@Test
	public void testPersistenceService() {
    	testPersistenceService(sequelizemetaPersistenceService);
	}	
}