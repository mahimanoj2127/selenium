package page;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SaucedemoLoginpage {

	WebDriver driver;
	WebDriverWait wait;
	
	By usernamefield=By.id("username");
	By passwordfield=By.id("password");
	By login=By.id("loginbutton");
	
	public SaucedemoLoginpage(WebDriver driver)
	{
		this.driver=driver;
		wait=new WebDriverWait(driver, Duration.ofSeconds(20));
	}
	
	public void setvalue(String username,String password)
	{
		WebElement uname= wait.until(ExpectedConditions.visibilityOfElementLocated(usernamefield));
		uname.sendKeys(username);
	    driver.findElement(passwordfield).sendKeys(password);
	 
	}
	public void logins()
	{
		driver.findElement(login).click();
		//https://www.saucedemo.com/inventory.html
	}
}
