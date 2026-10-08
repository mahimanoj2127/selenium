package test;

import org.testng.annotations.Test;

import base.Saucedemobase;
import page.SaucedemoLoginpage;

public class SaucedemoLogintest  extends Saucedemobase{
	
	@Test
	public void test()
	{
		SaucedemoLoginpage sl=new SaucedemoLoginpage(driver);
		sl.setvalue("standard_user", "secret_sauce");
		sl.logins();
	}

	
}
