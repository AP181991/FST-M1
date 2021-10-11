package SeleniumActivity;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Activity_3 {

	public static void main(String[] args) {
		WebDriver driver = new FirefoxDriver();
	    
        //Open the browser
        driver.get("https://www.training-support.net/selenium/simple-form");
        
        //Find the page title and print it
        String pageTitle = driver.getTitle();
        System.out.println(pageTitle);
        
        //Find the input fields
        WebElement firstName = driver.findElement(By.id("firstName"));
        WebElement lastName = driver.findElement(By.id("lastName"));
        //Enter text
        firstName.sendKeys("ANUP KUMAR");
        lastName.sendKeys("PAL");
        
      
        driver.findElement(By.id("email")).sendKeys("anup.pal2011@gmail.com");
        
        
        driver.findElement(By.id("number")).sendKeys("9158002090");
        
       
        driver.findElement(By.cssSelector(".ui.green.button")).click();
    
      
        driver.close();

	}

}
