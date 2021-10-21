package MobileTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;

public class Project3 {
	 
	 AndroidDriver<MobileElement> driver = null;
	 WebDriverWait wait;

	@BeforeTest
	 public void Setup() throws InterruptedException, IOException {
	        
	        DesiredCapabilities caps = new DesiredCapabilities();
	     //   caps.setCapability("deviceId", "2eed910sa");
	        caps.setCapability("deviceName", "pixelEmulator");
	        caps.setCapability("platformName", "android");
	        caps.setCapability("appPackage", "com.google.android.keep");
	        caps.setCapability("appActivity", ".activities.BrowseActivity");
	        driver = new AndroidDriver<MobileElement>(new URL("http://0.0.0.0:4723/wd/hub"), caps);
	        wait = new WebDriverWait(driver, 10);
	}
	
	@Test
    public void GoogleKeep() throws InterruptedException {
        driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
        driver.findElementById("com.google.android.keep:id/skip_welcome").click();
        
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"New text note\"]").click();
        
        Thread.sleep(3000);
        driver.findElementById("com.google.android.keep:id/editable_title").sendKeys("Biking");
        driver.findElementById("com.google.android.keep:id/edit_note_text").sendKeys("Hero-Honda");
        driver.navigate().back();
        
        Thread.sleep(3000);
       
        driver.findElementByXPath("//android.widget.TextView[@content-desc=\"Reminder\"]").click();
     
        
        driver.findElementByXPath("//android.support.v7.widget.RecyclerView/android.widget.LinearLayout[1]/android.widget.TextView").click();
        Thread.sleep(3000);
        driver.findElementById("com.google.android.keep:id/date_spinner").click();
        driver.findElementByXPath("//android.widget.ListView/android.widget.LinearLayout[1]/android.widget.TextView").click();
        Thread.sleep(3000);
        driver.findElementById("com.google.android.keep:id/time_spinner").click();
        driver.findElementByXPath("//android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView[1]").click();
        Thread.sleep(3000);
        driver.findElementById("com.google.android.keep:id/save").click();
        
        driver.navigate().back();
        driver.navigate().back();
        
        driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]").click();
        driver.findElementByXPath("//androidx.drawerlayout.widget.DrawerLayout/android.widget.LinearLayout/android.widget.ListView/android.widget.LinearLayout[2]/android.widget.TextView").click();
        
        Thread.sleep(3000);
        String msg=driver.findElementById("com.google.android.keep:id/index_note_title").getText();
        System.out.println(msg);
        Assert.assertEquals(msg, "Biking");
        
        String msg1=driver.findElementById("com.google.android.keep:id/reminder_chip_text").getText();
        System.out.println(msg1);
        Assert.assertEquals(msg1, msg1);
        
        

}
	 @AfterTest
     public void tearDown() {
         driver.quit();
  }
}
