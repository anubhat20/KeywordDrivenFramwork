package com.qa.hs.tests;

import org.testng.annotations.Test;

import com.qa.hs.keyword.engine.KeyWordEngine;

/**
 * 
 * @author Anuradha
 * TestNG class for Login Test scenario
 * Will not have @Before and @After methods 
 * because setup and tear down is handled in excel file
 *
 */
public class LoginTest {
	
	public KeyWordEngine keyWordEngine;
	
	@Test
	public void loginTest() {
		keyWordEngine = new KeyWordEngine();
		keyWordEngine.startExecution("login");
	}
	
}
