package crmProject;

import java.util.concurrent.TimeUnit;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity8 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
        
    }
  
	@Test
	public void Test() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
		
		
		driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
		System.out.println("User logged on successfully");
		
		
	    driver.findElement(By.xpath("//span[@class='notCurrentTab']//a")).click();
	    Thread.sleep(5000);
	    
	   
		
	    java.util.List<WebElement> Set1 = driver.findElements(By.xpath("//li[@class='topnav']//ul//li"));
	    for( WebElement s:Set1)
	    	if (s.getText().equalsIgnoreCase("Accounts")) {
	    		s.click();
	    		break;
	    	}
	    Thread.sleep(5000);

		
		java.util.List<WebElement> Set = driver.findElements(By.xpath("//tbody//tr[@class='oddListRowS1']//td[3]"));
		for (int i=0;i<Set.size()-5;i++) {
			
			String text =Set.get(i).getText();
			
			System.out.println(text);
}
	}
			 @AfterClass
			  public void afterClass() {
				driver.close();
	
  }
		
}

