package crmProject;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity2 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
	  
	 @Test
	  public void testcase2() {
	      
		  String urlHeaderimg = driver.findElement(By.xpath("//img[@alt=\"SuiteCRM\"]")).getAttribute("src");
	      System.out.println("URL of the header image: " + urlHeaderimg);
	  }
	 

	  @AfterClass
	  public void afterClass() {
		driver.close();
	  
  }
}
