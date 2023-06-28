package com.crm.qa.testcases;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;

public class LoginPageTest extends TestBase{
	LoginPage loginPage;
	public LoginPageTest(){
		super();
	}
	
//	@BeforeMethod
//	public void setUp(){
//		initialization();
//		loginPage = new LoginPage();	
//	}
	
	@Test()
	public void loginTest(){
		loginPage = new LoginPage();	
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		Assert.assertEquals(driver.getTitle(), "Swag labs");
	}
		
	
//	@AfterMethod
//	public void tearDown(){
//		driver.quit();
//	}
	
	
	
	

}
