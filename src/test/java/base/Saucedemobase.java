package base;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import page.SaucedemoCartpage;
import page.SaucedemoCheckoutpage;
import page.SaucedemoHomepage;
import page.SaucedemoLoginpage;

public class Saucedemobase {

	public static WebDriver driver;
	public static WebDriverWait wait;
	
	public static ExtentSparkReporter reporter;
	public static ExtentTest test;
	public static ExtentReports extent;
	
	public SaucedemoLoginpage login;
	public SaucedemoHomepage home;
	public SaucedemoCartpage cart;
	public SaucedemoCheckoutpage cop;
	
	
	@BeforeTest
	public void setup()
	{
		reporter=new ExtentSparkReporter("./Reports/MyReport1.html");
		
		
		ChromeOptions options=new ChromeOptions();
		options.addArguments("--incognito");
		driver=new ChromeDriver(options);
		driver.get("https://www.saucedemo.com/");
		driver.manage().window().maximize();
		
	}
	
	@BeforeMethod
	public void test()
	{
		login=new SaucedemoLoginpage(driver);
		home=new SaucedemoHomepage(driver);
		cart=new SaucedemoCartpage(driver);
		cop=new SaucedemoCheckoutpage(driver);
	}
}
