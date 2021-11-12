package MobileTest;

import java.io.IOException;
import java.net.URL;
import java.util.List;

import org.openqa.selenium.InvalidSelectorException;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.Test;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileElement;

public class Activity4 {
	WebDriverWait wait;
	 AppiumDriver<MobileElement> driver = null;

@Test(priority=1)
  public void GoogleChromeActivity() throws InterruptedException, IOException {
      // Set the Desired Capabilities
      DesiredCapabilities caps = new DesiredCapabilities();
      caps.setCapability("deviceId", "2eed910sa");
      caps.setCapability("deviceName", "pixelEmulator");
      caps.setCapability("platformName", "android");
      caps.setCapability("appPackage", "com.android.chrome");
      caps.setCapability("appActivity", "com.google.android.apps.chrome.Main");
      // Instantiate Appium Driver
      URL appServer = new URL("http://0.0.0.0:4723/wd/hub");
      driver = new AppiumDriver<>(appServer, caps);
      wait = new WebDriverWait(driver, 10);

      }

@Test(priority=2)
  public void ChromeSetUp() throws InterruptedException
  {

		Thread.sleep(5000);
		MobileElement terms = driver.findElementById("com.android.chrome:id/terms_accept");
	    terms.click();
	    MobileElement nextButton = driver.findElementById("com.android.chrome:id/next_button");
	    nextButton.click();
	    MobileElement continueButton = driver.findElementById("com.android.chrome:id/positive_button");
	    continueButton.click();
	    MobileElement okButton = driver.findElementById("com.android.chrome:id/positive_button");
	    okButton.click();

	    driver.get("https://www.training-support.net/selenium");
  }
@Test(priority=3)
public void scrollIntoViewTest() throws InterruptedException {
    // Wait for the page to load
	try {
	    driver.findElement(MobileBy.AndroidUIAutomator(
	            "new UiScrollable(new UiSelector().scrollable(true)).scrollToEnd(10)"));
	} catch (InvalidSelectorException e) {
	    // ignore
	}
	Thread.sleep(3000);
	driver.findElementByXPath("//android.webkit.WebView/android.view.View[2]/android.view.View[3]/android.view.View[15]/android.view.View").click();
	Thread.sleep(5000);
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Add tasks to list");
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
	Thread.sleep(3000);
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Get number of tasks");
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
	Thread.sleep(3000);
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText").sendKeys("Clear the list");
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.Button").click();
	Thread.sleep(5000);
	List<MobileElement> s =driver.findElementsByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[2]/android.view.View");
	for(MobileElement t:s) {
		Thread.sleep(2000);
		t.click();
	}
	Thread.sleep(2000);
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[3]").click();
	Thread.sleep(2000);
	driver.findElementByXPath("//android.webkit.WebView/android.view.View/android.view.View[4]/android.view.View[1]/android.widget.EditText");
	Assert.assertTrue(true);
	Thread.sleep(2000);
}

@AfterClass
public void afterClass() {
    driver.quit();
}
}