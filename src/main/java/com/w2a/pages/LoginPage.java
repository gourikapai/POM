package com.w2a.pages;

import org.openqa.selenium.By;

import com.w2a.base.Page;

public class LoginPage extends Page {
	
	
	public ZohoAppPage Login(String username,String password)
	{
		//driver.findElement(By.cssSelector("#lid")).sendKeys(username);
		type("username_CSS",username);
		//driver.findElement(By.cssSelector("#pwd")).sendKeys(password);
		type("password_CSS",password);
		//driver.findElement(By.cssSelector("div[id='signin_submit']")).click();
		click("signinbtn_CSS");
		return new ZohoAppPage();
	}


}
