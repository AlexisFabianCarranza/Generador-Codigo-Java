/*
 * Created on 2020-06-09 ( Date ISO 2020-06-09 - Time 11:53:29 )
 * Generated by Telosys ( http://www.telosys.org/ ) version 3.1.2
 */
package org.demo.persistence.impl.springdatajpa;

import org.demo.persistence.UsersPersistence ;
import org.demo.persistence.UsersPersistenceGenericTest;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

/**
 * JUnit tests for Users persistence service
 * 
 * @author Telosys Tools
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContextTest.xml" })
public class UsersPersistenceJpaTest extends UsersPersistenceGenericTest {

	@Autowired
	private UsersPersistence usersPersistenceService;

	@Test
	public void testPersistenceService() {
    	testPersistenceService(usersPersistenceService);
	}	
}