package com.w2a.base;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.w2a.pages.crm.accounts.CRMAccountsPage;

public class TopMenu {
	
	/*
	 * if TopMenu IS A Page ?--Inheritance for IS relationship
	 * if every Page HAS A TopMenu?--Encapsulation for HAS relationship
	 * 
	 * TopMenu IS not a Page
	 * AccountsPage HAS a TopMenu
	 * LeadsPage HAS a TopMenu
	 * 
	 * every Page HAS a TopMenu
	 * 
	 * 
	 */
	
	WebDriver driver;
	
	public TopMenu(WebDriver driver)
	{
		this.driver=driver;
	}
	

	public void gotoHome()
	{
		
	}
	
	public void gotoLeads()
	{
		
	}
	
	public CRMAccountsPage gotoAccounts()
	{
		//Page.driver.findElement(By.cssSelector("div[data-value='Accounts']")).click(); this is also correct
		driver.findElement(By.cssSelector("div[data-value='Accounts']")).click();
		return new CRMAccountsPage();
	}
	
	public void gotoFeeds()
	{
		
	}
	
	public void gotoContacts()
	{
		
	}
	
	public void gotoDeals()
	{
		
	}
	
	public void signOut()
	{
		
	}

}
