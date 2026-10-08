package test;

import org.testng.Assert;
import org.testng.annotations.Test;

import base.Saucedemobase;

public class SaucedemoHomeTest extends Saucedemobase {

	@Test(priority = 1)
	public void validateText()
	{
		String actual_text = home.validateText();
		Assert.assertEquals(actual_text, "Products");
	}
	
	@Test(priority = 2)
	public void sortProducts()
	{
		home.sortProducts();
	}
	
	@Test(priority = 3)
	public void addToCart()
	{
		home.addToCart();
	}
	
	@Test(priority = 4)
	public void cartButtonClick()
	{
		home.cartButtonClick();
	}
}

