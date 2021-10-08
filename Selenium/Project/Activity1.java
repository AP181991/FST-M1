package crmProject;

import org.testng.annotations.Test;

import TestNGActivity.Assert;

import org.testng.annotations.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;

public class Activity1 {
	WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	  
  @Test
  public void testcase1() {
      
      String title = driver.getTitle();
      
      System.out.println("Page title is: " + title);
          
      Assert.assertEquals("“SuiteCRM", title);
  }
  
  
  @AfterClass
  public void afterClass() {
	driver.close();
  }

}
