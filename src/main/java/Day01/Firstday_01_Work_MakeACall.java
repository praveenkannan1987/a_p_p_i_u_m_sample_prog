package Day01;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;

public class Firstday_01_Work_MakeACall {

	public static void main(String[] args) throws MalformedURLException, InterruptedException {
		// TODO Auto-generated method stub

		AppiumDriver<WebElement> driver;
		DesiredCapabilities capability= new DesiredCapabilities();

		//"deviceName": "ZX1D63SFXH",
		capability.setCapability("deviceName", "ZX1D63SFXH");

		//  "platformName": "Android",
		capability.setCapability("platformName", "Android");
		//  "appPackage": "com.android.mms",
		capability.setCapability("appPackage", "com.android.dialer");
		//  "appActivity": "com.android.mms.ui.ConversationList"
		capability.setCapability("appActivity", "com.android.dialer.DialtactsActivity");
		
		driver= new AndroidDriver<WebElement>(new URL("http://0.0.0.0:4723/wd/hub"), capability);
		driver.findElementById("com.android.dialer:id/floating_action_button").click();
		Thread.sleep(2000);
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"9,WXYZ\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"9,WXYZ\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"4,GHI\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"0,+\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"3,DEF\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"2,ABC\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"1,\"]/android.widget.LinearLayout/android.widget.TextView").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"8,TUV\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"7,PQRS\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementByXPath("//android.widget.FrameLayout[@content-desc=\"9,WXYZ\"]/android.widget.LinearLayout/android.widget.TextView[1]").click();
		driver.findElementById("com.android.dialer:id/dialpad_floating_action_button").click();
		Thread.sleep(2000);
		driver.findElementById("com.android.dialer:id/audioButton").click();
		Thread.sleep(10000);
		driver.findElementById("com.android.dialer:id/floating_end_call_action_button").click();
		
		//driver.findElementById("com.android.mms:id/send_button_sms").click();
		
		driver.quit();
	}

}
