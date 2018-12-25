package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;
import com.w2a.pages.crm.CRMHomePage;

public class ZohoAppPage extends Page{
	
	public CRMHomePage gotoCRM()
	{
		
		//driver.findElement(By.cssSelector("span[class='zicon-apps-crm zicon-apps-96']")).click();
		click("CRM_CSS");
		
		return new CRMHomePage();
	}

}
