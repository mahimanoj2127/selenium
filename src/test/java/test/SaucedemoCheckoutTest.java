package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Saucedemobase;

public class SaucedemoCheckoutTest extends Saucedemobase {
	@Test(priority = 1)
	public void checkoutTitleVerify()
	{
		String actual_checkout_title = cop.checkoutTitleVerify();
		Assert.assertEquals(actual_checkout_title, "Checkout: Your Information");
	}
	
	@Test(priority = 2)
	public void fillOutForm()
	{
		cop.fillOutForm("mahi", "K Manoj", "682315");
	}
	
	@Test(priority = 3)
	public void clickContinue()
	{
		cop.clickContinue();
	}
	
	@Test(priority = 4)
	public void displayTotalAmount()
	{
		System.out.println("Total amount of Cart Items : "+cop.displayTotalAmount());
	}
	
	@Test(priority = 5)
	public void clickFinish()
	{
		cop.clickFinish();
	}
}
