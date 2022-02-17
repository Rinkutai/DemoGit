package com.qa.Library;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.testng.annotations.AfterClass;
//import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeSuite;

public class TestBase {
	private WebDriver driver;
	@BeforeSuite
	 public static void setUp()
	    {
		
	    	System.setProperty("webdriver.chrome.driver","/Users/rinkutaidatkhile/Downloads/chromedriver");
	    	 WebDriver driver = new ChromeDriver();
	    	driver.manage().window().maximize();
	    	driver.manage().deleteAllCookies();
	    	driver.get("https://www.amazon.in");
	    	
	    }
	/*@AfterClass
	public static void close()
	{
		driver.quit();
	}*/
}
