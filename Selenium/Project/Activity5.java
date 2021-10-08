package crmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity5 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
  
	@Test
	  public void logontestcase() {
		  
		  WebElement userName = driver.findElement(By.id("user_name"));
	      WebElement passWord = driver.findElement(By.id("username_password"));
	     
	      userName.sendKeys("admin");
	      passWord.sendKeys("pa$$w0rd");
	      driver.findElement(By.id("bigbutton")).click();
	      WebElement c =driver.findElement(By.xpath("//div[@class='desktop-toolbar']"));
		  	
		  	String color =c.getCssValue("color");
		  	System.out.println("Color of the Menu :" +color);
	  }
	
	@AfterClass
	  public void afterClass() {
		driver.close();
	  }

	
}
