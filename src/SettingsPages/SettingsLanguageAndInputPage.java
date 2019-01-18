package SettingsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestBaseClass.Device;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsLanguageAndInputPage {

	public static void ClickOnTheLanguageOption() throws InterruptedException
	{
		Thread.sleep(2000);
		List<MobileElement> LanguageOption=Device.Driver.findElements(By.className("android.widget.RelativeLayout"));
		Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(LanguageOption.get(0)));
		LanguageOption.get(0).click();
	}
	
}
