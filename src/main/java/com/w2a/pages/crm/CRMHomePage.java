package com.w2a.pages.crm;

import org.openqa.selenium.By;
import org.testng.Assert;

import com.w2a.base.Page;

public class CRMHomePage extends Page{
	
	public void verifyTextonCRMHome()
	{
		String actualText=driver.findElement(By.cssSelector(OR.getProperty("homePageText"))).getText();
		
		Assert.assertEquals(actualText, "Welcome trainer");
	}

	public void verifyHomeButton()
	{
		driver.findElement(By.cssSelector(OR.getProperty("homebtn_CSS"))).isDisplayed();
	}
}
