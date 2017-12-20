package Day03;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.UUID;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class mobileview2 {
	
	RemoteWebDriver driver;

	@BeforeTest
	 public void setUp() throws MalformedURLException {
		// TODO Auto-generated method stub
	
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("deviceName", "ZX1D63SFXH");
		capabilities.setCapability("browserName", "chrome");
		capabilities.setCapability("platformVersion", "6.0");
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("nativeWebScreenshot", "true");//For hybrid app screen shot
		
		driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://m.hyundai.co.in/mobile/");
	}
	

	@Test
	public void mobileWebView() throws InterruptedException, IOException
	{	
		WebDriverWait waitButton = new WebDriverWait(driver, 30);
		waitButton.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Special Offers")));
		driver.findElement(By.xpath("/html/body/div[1]/form/div[3]/div[5]/div[1]/div/ul/li[1]/a")).click();
		driver.findElement(By.xpath("//img[@src='images/CarModel/1edfb5fd_i20active.jpg']")).click();
		driver.findElement(By.xpath("//img[@src='images/logo.png']")).click();
		Thread.sleep(2000);
		driver.findElement(By.partialLinkText("Special Offers")).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath("//img[@src='images/logo.png']")).click();
		WebDriverWait waitImage = new WebDriverWait(driver, 30);
		waitImage.until(ExpectedConditions.presenceOfElementLocated(By.partialLinkText("Special Offers")));
		File srcFile=driver.getScreenshotAs(OutputType.FILE);
		String filename=UUID.randomUUID().toString(); 
		File targetFile=new File("C:\\Users\\khmj849\\Downloads\\Proof\\" +"Car_"+ filename +".jpg");
		org.apache.commons.io.FileUtils.copyFile(srcFile,targetFile);
	}
	
	@AfterTest
	public void tearDown()
	{
		driver.quit();
	}

}
