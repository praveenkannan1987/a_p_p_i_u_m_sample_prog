package Day03;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.PerformsTouchActions;
import io.appium.java_client.TouchAction;
import io.appium.java_client.android.AndroidDriver;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MobileWeb {
	
	RemoteWebDriver driver;

	@BeforeTest
	 public void setUp() throws MalformedURLException {
		// TODO Auto-generated method stub
	
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ZX1D63SFXH");
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.india.ford.com");
	}
	@Test
	public void mobileWebView() throws InterruptedException, IOException
	{	
		/*TouchAction finger1 = new TouchAction((PerformsTouchActions) driver);
		finger1.press(540, 619).perform().moveTo(140, 619).perform().release();*/
		@SuppressWarnings("rawtypes")
		TouchAction act=new TouchAction((io.appium.java_client.android.AndroidDriver)driver);
		act.press(395, 19).perform().moveTo(395, 860).perform().release();
	/*	Actions actions = new Actions(driver);
		Thread.sleep(2000);
		actions.moveByOffset(395, 19).clickAndHold().moveByOffset(395, 858).release().build().perform();*/	
		File srcFile=driver.getScreenshotAs(OutputType.FILE);
		String filename=UUID.randomUUID().toString(); 
		File targetFile=new File("C:\\Users\\Rajendiransivarajan\\Desktop\\Mobile Appium\\" +"Car_"+ filename +".jpg");
		org.apache.commons.io.FileUtils.copyFile(srcFile,targetFile);
	}
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}