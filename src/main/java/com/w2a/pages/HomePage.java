package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class HomePage extends Page{
	
	
	public LoginPage gotoLogin()
	{
		//driver.findElement(By.cssSelector("a[class='zh-login']")).click();
		click("login_CSS");
		return new LoginPage();
	}
	
	public void gotoSingUp()
	{
		
	}
	
	
	public void gotoCustomers()
	{
		
	}
	
	public void gotoSupport()
	{
		
	}
	
	public void gotoContactSales()
	{
		
	}

}
