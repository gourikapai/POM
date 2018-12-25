package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.base.BaseTest;
import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.CRMAccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;
import com.w2a.utilities.TestUtil;

public class LoginTest extends BaseTest{
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data)
	{
		HomePage hp=new HomePage();
		
		LoginPage lp=hp.gotoLogin();
		lp.Login(data.get("username"), data.get("password"));
		
	}

}
