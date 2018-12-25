package com.w2a.testcases;

import java.util.Hashtable;

import org.testng.annotations.Test;

import com.w2a.base.Page;
import com.w2a.pages.HomePage;
import com.w2a.pages.LoginPage;
import com.w2a.pages.ZohoAppPage;
import com.w2a.pages.crm.CRMHomePage;
import com.w2a.pages.crm.accounts.CRMAccountsPage;
import com.w2a.pages.crm.accounts.CreateAccountsPage;
import com.w2a.utilities.TestUtil;

public class CreateAccountTest {
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void createAccountTest(Hashtable<String,String> data)
	{
		ZohoAppPage zap=new ZohoAppPage();
		CRMHomePage chp=zap.gotoCRM();
		CRMAccountsPage cap=Page.menu.gotoAccounts();
		CreateAccountsPage crap=cap.gotoCreateAccounts();
		crap.createAccount(data.get("accountname"));
	}

}
