package Day03;
import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.remote.DesiredCapabilities;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
public class A_01_FirstProgram {

	public static void main(String[] args) throws MalformedURLException {
		// TODO Auto-generated method stub

		AppiumDriver<WebElement> driver;
		DesiredCapabilities capability= new DesiredCapabilities();

		//"deviceName": "ZX1D63SFXH",
		capability.setCapability("udid", "ZX1D63SFXH");

		//  "platformName": "Android",
		capability.setCapability("platformName", "Android");
		//  "appPackage": "com.android.mms",
		capability.setCapability("appPackage", "com.android.mms");
		//  "appActivity": "com.android.mms.ui.ConversationList"
		capability.setCapability("appActivity", "com.android.mms.ui.ConversationList");
		
		driver= new AndroidDriver<WebElement>(new URL("http://192.168.0.109:4444/wd/hub"), capability);
		driver.findElementById("com.android.mms:id/action_compose_new").click();
		driver.findElementById("com.android.mms:id/recipients_editor").clear();
		driver.findElementById("com.android.mms:id/recipients_editor").sendKeys("9962890731");
		driver.findElementById("com.android.mms:id/embedded_text_editor").sendKeys("This is Praveen Kannan. This is test messaging");
		driver.findElementById("com.android.mms:id/send_button_sms").click();
		
		driver.quit();
	}

}
