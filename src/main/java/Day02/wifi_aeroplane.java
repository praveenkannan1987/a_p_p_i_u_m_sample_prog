package Day02;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.Connection;

public class wifi_aeroplane {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub
		AppiumDriver<WebElement> driver;
		DesiredCapabilities capability= new DesiredCapabilities();

		//"deviceName": "ZX1D63SFXH",
		capability.setCapability("deviceName", "ZX1D63SFXH");

		//  "platformName": "Android",
		capability.setCapability("platformName", "Android");
		//  "appPackage": "com.android.mms",
		capability.setCapability("appPackage", "com.android.mms");
		//  "appActivity": "com.android.mms.ui.ConversationList"
		capability.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		
		driver= new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		//MobileElement setting= (MobileElement) driver.findElementById("com.android.mms:id/action_compose_new");
		//setting.click();
		Thread.sleep(3000);
		//Aeroplane , wifi will work till android 6.0 and only wifi in 7.0 
		//driver.setConnection(Connection.WIFI);
		driver.quit();
	}

}
