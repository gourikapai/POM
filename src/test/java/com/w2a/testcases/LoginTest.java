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
	
	/*How to commit and push code from eclipse to Git Hub Repository
	 * Precodition to be performed on git hub and on command prompt
	 * Git repository should be created in Git Hub 
	 * go to project location C:\Users\vishw\Selenium\PageObjectModelFramework
	 * right click->click on git bash here
	 * type git init ,git status,git add <files>,git commit -m <message>,
	 * git remote add origin github url ,
	 * git push -u origin master etc commands on git command prompt
	 * And this is how the code will be pushed to git hub from command prompt
	 * --------------------------------------------------
	 * First precondition need be performed to get git related options under Team in eclipse
	 * select project on eclipse ->right click on project->click on team->share project
	 * then do some changes to your code 
	 * then right click on project->click on team->click on add to index
	 * then right click on project->click on team->click on commit->type commit message
	 * click on commit and push
	 * go to git hub repository and see your changes are getting reflected in git hub
	 * And this is how the code changes will be committed and pushed to git hub from eclipse 
	 */
	
	@Test(dataProviderClass=TestUtil.class,dataProvider="dp")
	public void loginTest(Hashtable<String,String> data)
	{
		HomePage hp=new HomePage();
		
		LoginPage lp=hp.gotoLogin();
		lp.Login(data.get("username"), data.get("password"));
		
	}

}
