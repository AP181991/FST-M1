package crmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity3 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	
	@Test
	  public void testCase1() {
		  
		  WebElement copyrightText = driver.findElement(By.id("admin_options"));
	      System.out.println("Text in element: " + copyrightText.getText());
		
	  }
	  
  }

