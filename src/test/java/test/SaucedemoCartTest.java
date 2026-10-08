package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Saucedemobase;

public class SaucedemoCartTest extends Saucedemobase{
	

	@Test(priority = 1)
	public void cartTitleTextVerify()
	{
		String actual_cart_title_text = cart.cartTitleTextVerify();
		Assert.assertEquals(actual_cart_title_text, "Your Cart");
	}
	
	@Test(priority = 2)
	public void continueShoppingButtonCheck()
	{
		boolean csb =  cart.checkContinueShoppingButtonEnabled();
		Assert.assertEquals(csb, true);
	}
	
	@Test(priority = 3)
	public void checkCheckoutButtonEnabled()
	{
		boolean cb = cart.checkCheckoutButtonEnabled();
		Assert.assertEquals(cb, true);
	}
	
	@Test(priority = 4)
	public void checkoutButtonClick()
	{
		cart.checkoutButtonClick();
	}
}
