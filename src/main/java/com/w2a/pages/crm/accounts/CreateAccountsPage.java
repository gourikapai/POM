package com.w2a.pages.crm.accounts;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class CreateAccountsPage extends Page{
	
	
	public void createAccount(String AccountName)
	{
		//driver.findElement(By.cssSelector("input[id='Crm_Accounts_ACCOUNTNAME']")).sendKeys(AccountName);
		type("accountName_CSS",AccountName);
		
	}

}
