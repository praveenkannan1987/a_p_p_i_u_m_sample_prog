package Day02;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class zoomin_zoomout {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		AppiumDriver<WebElement> driver;
		DesiredCapabilities capability= new DesiredCapabilities();

		//"deviceName": "ZX1D63SFXH",
		capability.setCapability("deviceName", "ZX1D63SFXH");

		//  "platformName": "Android",
		capability.setCapability("platformName", "Android");
		capability.setCapability("appPackage", "com.google.android.apps.photos");
		capability.setCapability("appActivity", "com.google.android.apps.photos.home.HomeActivity");
		
		driver= new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		
	}

}
