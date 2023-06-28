package com.crm.qa.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;

import com.crm.qa.base.TestBase;

public class removeProductPage extends TestBase {
	
	public removeProductPage(){
		PageFactory.initElements(driver, this);
	} // End of constructor.
	
	@FindBy(id = "remove-sauce-labs-backpack")
	private WebElement removeProductBtn;
	
	@FindBy(xpath="//div[@class='item_pricebar']/div")
	private WebElement clickOnPrice;
	
	public void removeProduct() {
		try {
			Thread.sleep(2000);
			removeProductBtn.click();
			Assert.assertTrue(removeProductBtn.isDisplayed());
			System.out.println("remove button Clicked.");
			
		} 
		catch (Exception e) {
			final StringBuilder error = 
					new StringBuilder("Error in clicking remove button").append(e.getMessage());
			System.out.println(e.getMessage());
			Assert.assertTrue(false);
		}
	}
}
