package Day03;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Dimension;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import io.appium.java_client.android.AndroidDriver;

public class hybridview {
	
	@SuppressWarnings("rawtypes")
    AndroidDriver driver;
	String username="sakthivel@testleaf.com";
	String password="Leaf@123";
	Dimension size;

	@SuppressWarnings("rawtypes")
	@BeforeMethod
	 public void setUp() throws MalformedURLException {
		// TODO Auto-generated method stub
	
		
		//File targetApp = new File("C:\\Users\\Rajendiransivarajan\\Desktop\\Mobile Appium\\LeafOrg.apk");
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ZX1D63SFXH");
		capabilities.setCapability("platformName", "Android");
		//capabilities.setCapability("app", targetApp.getAbsolutePath());
		//capabilities.setCapability("fastReset", "true");
		//capabilities.setCapability("fullReset", "true");
		capabilities.setCapability("appPackage", "com.testleaf.leaforg");
		capabilities.setCapability("appActivity", "com.testleaf.leaforg.MainActivity");
		
		driver = new AndroidDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		
		
	}
	@Test//(priority=1)
	public void hybridv1() throws Exception {
		Thread.sleep(5000);
		//driver.h
		Set<String> contextNames= driver.getContextHandles();
		for (String cN : contextNames) {
			if(cN.contains("WEBVIEW")) {
				driver.context(cN);
				System.out.println(cN);
			}
		}
		driver.findElementByXPath("//input[@formcontrolname='email']").sendKeys(username);
		//driver.hideKeyboard();
		driver.findElementByXPath("//input[@formcontrolname='password']").sendKeys(password);
		Thread.sleep(5000);
		driver.findElementByXPath("//span[contains(text(),'Login')]").click();
		Thread.sleep(10000);
		driver.findElementByXPath("//span[contains(text(),'Settings')]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("(//div[@class='input-wrapper'])[4]").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//input[@formcontrolname='fname']").clear();
		driver.findElementByXPath("//input[@formcontrolname='fname']").sendKeys("go");
		Thread.sleep(2000);
		driver.findElementByXPath("(//ion-icon[@class='back-button-icon ion-md-arrow-back'])[2]").click();
		Thread.sleep(2000);
	}
	
	@AfterMethod
	public void logout()
	{
		driver.quit();
	}

}
