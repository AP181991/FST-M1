package SeleniumActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity4_2 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
		 
        
        driver.get("https://www.training-support.net/selenium/simple-form");
 
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
 
        
        WebElement firstName = driver.findElement(By.xpath("//input[@id = 'firstName']"));
        WebElement lastName = driver.findElement(By.xpath("//input[@id = 'lastName']"));
        firstName.sendKeys("ANUP KUMAR");
        lastName.sendKeys("PAL");
 
      
        driver.findElement(By.xpath("//input[@id = 'email']")).sendKeys("anup.pal2011@gmail.com");
 
        
        driver.findElement(By.xpath("//input[@id = 'number']")).sendKeys("9158002090");
 
       
        driver.findElement(By.xpath("//textarea")).sendKeys("This is my message");
 
      
        driver.findElement(By.xpath("//input[contains(@class, 'green')]")).click();

	}

}
