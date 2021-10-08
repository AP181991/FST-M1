package crmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity4 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	@Test
	  public void testCase3() {
		  
		  WebElement userName = driver.findElement(By.id("user_name"));
	      WebElement passWord = driver.findElement(By.id("username_password"));
	      //Enter text
	      userName.sendKeys("admin");
	      passWord.sendKeys("pa$$w0rd");
	      driver.findElement(By.id("bigbutton")).click();
	      System.out.println("New page title is: " + driver.getTitle());
  }
}
