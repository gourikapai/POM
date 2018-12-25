package com.w2a.rough;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.CRMAccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;

public class LoginTest {

	public static void main(String[] args) {
		
	HomePage hp=new HomePage();
	
	LoginPage lp=hp.gotoLogin();
	ZohoAppPage zap=lp.Login("trainer@way2automation.com", "Selenium@123");
	CRMHomePage chp=zap.gotoCRM();
	CRMAccountsPage cap=Page.menu.gotoAccounts();
	CreateAccountsPage crap=cap.gotoCreateAccounts();
	crap.createAccount("RamanArora");
	

	}

}
