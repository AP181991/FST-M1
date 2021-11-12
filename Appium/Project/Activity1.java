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

public class Activity1 {
	WebDriverWait wait;
	 AppiumDriver<MobileElement> driver = null;

	@Test(priority=1)
   public void GoogleActivity() throws InterruptedException, IOException {
       // Set the Desired Capabilities
       DesiredCapabilities caps = new DesiredCapabilities();
       caps.setCapability("deviceId", "2eed910sa");
       caps.setCapability("deviceName", "pixelEmulator");
       caps.setCapability("platformName", "android");
       caps.setCapability("appPackage", "com.google.android.apps.tasks");
       caps.setCapability("appActivity", ".ui.TaskListsActivity");

       try {
           // Initialize driver
           driver = new AppiumDriver<>(new URL("http://127.0.0.1:4723/wd/hub"), caps);

           System.out.println("Google Activity is Opened");

       }
       catch (MalformedURLException e) {
           System.out.println(e.getMessage());
       }
	}
@Test(priority=2)
public void task1() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	MobileElement startedButton = driver.findElementByClassName("android.widget.Button");
   startedButton.click();
	MobileElement taskButton = driver.findElementByAccessibilityId("Create new task");
   taskButton.click();
   MobileElement taskName = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
   taskName.sendKeys("Complete Activity with Google Tasks");
   MobileElement saveTask = driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
   saveTask.click();
  }

@Test(priority=3)
public void task2() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	MobileElement taskButton1 = driver.findElementByAccessibilityId("Create new task");
   taskButton1.click();
   MobileElement taskName1 = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
   taskName1.sendKeys("Complete Activity with Google Keep");
   MobileElement saveTask1 = driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
   saveTask1.click();

  }
@Test(priority=4)
public void task3() throws InterruptedException {
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	Thread.sleep(5000);
	MobileElement taskButton2 = driver.findElementByAccessibilityId("Create new task");
   taskButton2.click();
   MobileElement taskName2 = driver.findElementById("com.google.android.apps.tasks:id/add_task_title");
   taskName2.sendKeys("Complete the second Activity Google Keep");
   MobileElement saveTask2 = driver.findElementById("com.google.android.apps.tasks:id/add_task_done");
   saveTask2.click();
}
@Test(priority=5)

public void check() throws InterruptedException {
     Thread.sleep(2000);

     String Text2= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete the second Activity Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
     Assert.assertEquals(Text2, "Complete the second Activity Google Keep");

     Thread.sleep(2000);
     String Text1= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Keep\"]/android.view.ViewGroup/android.widget.TextView").getText();
     Assert.assertEquals(Text1, "Complete Activity with Google Keep");
     Thread.sleep(2000);

	 String Text= driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"Complete Activity with Google Tasks\"]/android.view.ViewGroup/android.widget.TextView").getText();
	 Assert.assertEquals(Text, "Complete Activity with Google Tasks");

}

@AfterClass
public void afterClass() {
    driver.quit();
}
}
