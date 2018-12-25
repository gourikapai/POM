package com.w2a.base;

import org.testng.annotations.*;

public class BaseTest {
	
	
	@AfterSuite
	public void tearDown()
	{
		Page.quit();
	}

}
