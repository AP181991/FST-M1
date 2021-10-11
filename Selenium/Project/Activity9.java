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

public class Activity9 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
  
	@Test
	public void Traversingtables2_Test() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
		
		
		
		driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
		System.out.println("User logged on successfully");
		driver.findElement(By.xpath("//span[@class='notCurrentTab']//a")).click();
		
		
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[5]")).click();
		Thread.sleep(5000);
		java.util.List<WebElement> Set2 = driver.findElements(By.xpath("//td[@class=' inlineEdit']//b"));
		for (WebElement t:Set2) {
			
		 String s =t.getText();
		 System.out.println("Text in name column of the table:"+s);
		 
		}
		 
		 Thread.sleep(3000);
		 java.util.List<WebElement> Set3 = driver.findElements(By.xpath("(//div[@class='list-view-rounded-corners']//tbody)[2]//td[8]"));
			for (WebElement t1:Set3) {
				
			 String s1 =t1.getText();
			 System.out.println(s1);
			 System.out.println("Text in User column of the table:"+s1);
			 
	        }
	}
			 @AfterClass
			  public void afterClass() {
				driver.close();
  }
}
