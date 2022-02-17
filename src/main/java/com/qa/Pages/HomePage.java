package com.qa.Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.Library.TestBase;

public class HomePage extends TestBase{
		WebDriver driver;
		
	
		 public void  searchBox()
		 {
			WebElement search = driver.findElement(By.xpath(""));
			 search.click();
		 }
		 
		 //To verify user should able to search here i will write my all testcases
	}

