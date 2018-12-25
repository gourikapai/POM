package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CRMAccountsPage extends Page {

	
	public CreateAccountsPage gotoCreateAccounts()
	{
		//driver.findElement(By.xpath("button[class='newwhitebtn customPlusBtn ']")).click();
		
		click("createAccountbtn_XPATH");
		return new CreateAccountsPage();
	}
	
	public void gotoImportAccounts()
	{
		
	}
	
	
}
