package Day02;

import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

public class mutitouch_press {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AppiumDriver<WebElement> driver;
		DesiredCapabilities capability= new DesiredCapabilities();

		//"deviceName": "ZX1D63SFXH",
		capability.setCapability("deviceName", "ZX1D63SFXH");

		//  "platformName": "Android",
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.the511plus.MultiTouchTester");
		capability.setCapability("appActivity", "com.the511plus.MultiTouchTester.MultiTouchTester");

		driver= new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		MobileElement elor= (MobileElement) driver.findElementById("com.the511plus.MultiTouchTester:id/points");
		TouchAction finger1= new TouchAction(driver);
		//int x=240;
		//int y=740;
		finger1.press(elor, 260, 740).perform().moveTo(600, 740).perform().release();
		/*for(int k=x;k<600;k++) {
			finger1.moveTo(k, 740).perform();
			Thread.sleep(3000);
		}*/
		//finger1.release();
		Thread.sleep(3000);
		driver.quit();
	}

}
