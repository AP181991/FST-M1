package MobileTest;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;

public class Activity2 {
	WebDriverWait wait;
	 AppiumDriver<MobileElement> driver = null;


@Test(priority=1)
public void Keep() throws InterruptedException, IOException {
    // Set the Desired Capabilities
    DesiredCapabilities caps = new DesiredCapabilities();
    caps.setCapability("deviceId", "2eed910sa");
    caps.setCapability("deviceName", "pixelEmulator");
    caps.setCapability("platformName", "android");
    caps.setCapability("appPackage", "com.google.android.keep");
    caps.setCapability("appActivity", ".activities.BrowseActivity");

    try {
        // Initialize driver
        driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

        System.out.println("Google keep is Opened");

    }
    catch (MalformedURLException e) {
        System.out.println(e.getMessage());
    }

	}
@Test(priority=2)
public void keeptask3() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	MobileElement noteButton3 = driver.findElementByAccessibilityId("New text note");
   noteButton3.click();
   MobileElement noteTitle3 = driver.findElementById("com.google.android.keep:id/editable_title");
   noteTitle3.sendKeys("Listening");
   MobileElement noteContent3 = driver.findElementById("com.google.android.keep:id/edit_note_text");
   noteContent3.sendKeys("Music");
   MobileElement toolbar3 = driver.findElementByXPath("//android.widget.ImageButton[@content-desc=\"Open navigation drawer\"]");
   toolbar3.click();
   Thread.sleep(3000);
   String msg=driver.findElementById("com.google.android.keep:id/index_note_title").getText();
   System.out.println("task title:"+msg);
   Assert.assertEquals(msg, "Listening");

  }
@AfterClass
public void afterClass() {
    driver.quit();

}
}
