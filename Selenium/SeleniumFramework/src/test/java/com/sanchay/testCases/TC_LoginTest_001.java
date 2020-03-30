package com.sanchay.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.sanchay.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	
	@Test
	public void loginTest() throws IOException
	{
		driver.get(baseURL);
		
		logger.info("Launching the Application");
		
		LoginPage lp = new LoginPage(driver);
		
		lp.setUserName(userName);
		logger.info("UserName Entered");
		
		lp.setPassword(password);
		logger.info("Password Entered");
		
		lp.clickSubmit();
		
		if(driver.getTitle().equals("Guru99 Bank Manager Home Page"))
		{
			Assert.assertTrue(true);
			logger.info("Logged into the Application");
		}
		else
		{			
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
			logger.info("Login test failed");
			
		}
		
	}
	

}
