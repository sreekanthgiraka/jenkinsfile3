package com.crm.qa.testcases;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.GetProductPricePage;
import com.crm.qa.pages.LoginPage;

public class getProductPriceTest extends TestBase{
	LoginPage loginPage;
	GetProductPricePage price;
	
	public getProductPriceTest(){
		super();
	}
	
	@Test(testName = "Get Product Price")
	public void getProductPrice(){
		loginPage = new LoginPage();	
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		price = new GetProductPricePage();
		price.getProductPrice();
		loginPage.logoutClick();
	}

}
