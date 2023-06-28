package com.crm.qa.testcases;

import org.testng.annotations.Test;

import com.crm.qa.base.TestBase;
import com.crm.qa.pages.LoginPage;
import com.crm.qa.pages.OrderProductPage;
import com.crm.qa.pages.removeProductPage;

public class removeProductTest extends TestBase {
	LoginPage loginPage;
	removeProductPage remove;
	OrderProductPage order;

	public removeProductTest() {
		super();
	}

	@Test()
	public void getProductPrice() {
		loginPage = new LoginPage();
		loginPage.login(prop.getProperty("username"), prop.getProperty("password"));
		order = new OrderProductPage();
		remove = new removeProductPage();
		order.addToCart();
		order.cart();
		remove.removeProduct();
		loginPage.logoutClick();
	}
}
