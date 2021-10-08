package crmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import TestNGActivity.Assert;

public class Activity6 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        
   }
	@Test
	  public void testCase1() {
		  
		  WebElement userName = driver.findElement(By.id("user_name"));
	      WebElement passWord = driver.findElement(By.id("username_password"));
	      //Enter text
	      userName.sendKeys("admin");
	      passWord.sendKeys("pa$$w0rd");
	      driver.findElement(By.id("bigbutton")).click();
	}
	 @Test
	  public void testCase2() {
		  
		  driver.findElement(By.id("toolbar"));
		  WebElement menuActivity = driver.findElement(By.id("grouptab_3"));
		  System.out.println("4th Item in the navigation menu: " + menuActivity.getText());
				
	  }
	 @AfterClass
	  public void afterClass() {
		driver.close();
  }
}

