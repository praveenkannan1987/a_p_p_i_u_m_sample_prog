package Day02;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.ScreenOrientation;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Landscape {

	public static void main(String[] args) throws Exception  {
		// TODO Auto-generated method stub
		//"deviceName": "ZX1D63SFXH",

		File tapp= new File("C:\\Users\\Rajendiransivarajan\\Desktop\\Mobile Appium\\LeafOrg.apk");
		AppiumDriver<WebElement> driver;
		DesiredCapabilities capability= new DesiredCapabilities();

		capability.setCapability("deviceName", "ZX1D63SFXH");

		//  "platformName": "Android",
		capability.setCapability("platformName", "Android");
		capability.setCapability("app", tapp.getAbsolutePath());
		capability.setCapability("appPackage", "com.testleaf.leaforg");
		capability.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		driver= new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		System.out.println("connected");
		ScreenOrientation orintation=driver.getOrientation();
		
		if(orintation.value().contains("landscape"))
		{
			driver.rotate(ScreenOrientation.PORTRAIT);
		}
		else
		{
			driver.rotate(ScreenOrientation.LANDSCAPE);
		}
		Thread.sleep(4000);
		FileUtils.copyFile(driver.getScreenshotAs(OutputType.FILE), new File("C:\\Users\\Rajendiransivarajan\\Desktop\\Mobile Appium\\image.jpg"));
		
		driver.quit();
	}

}
