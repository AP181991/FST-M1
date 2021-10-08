package crmProject;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Activity7 {
WebDriver driver;
	
	@BeforeClass
	  public void beforeClass() {
        driver = new FirefoxDriver();
        driver.get("http://alchemy.hguy.co/crm");
    }
  
	@Test
	public void PopupTest() throws InterruptedException {
		driver.findElement(By.xpath("//input[@placeholder='Username']")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@placeholder='Password']")).sendKeys("pa$$w0rd");
		driver.findElement(By.xpath("//input[@id='bigbutton']")).click();
		
		
		driver.findElement(By.xpath("//span[@class='notCurrentTab']//a"));
		System.out.println("User logged on");
		driver.findElement(By.xpath("//span[@class='notCurrentTab']//a")).click();
		
		driver.findElement(By.xpath("//ul[@class='dropdown-menu']//li[5]")).click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//tbody//tr[@class='oddListRowS1']//td[10]//span")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,10);
		wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//div[contains(@class, 'ui-dialog-content') and contains(.//span, '1234567890')]")));
		
		String mobileNo =driver.findElement(By.xpath("//div[contains(@class, 'ui-dialog-content') and contains(.//span, '1234567890')]")).getText();
		System.out.println("Phone number on pop up is:"+mobileNo);
		}
	
	
	  @AfterClass
	  public void afterClass() {
		driver.close();
  }
}
