package SettingsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import TestBaseClass.Device;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindAll;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class SettingsHomePage {

	public static void ClickOnTheMoreOptionButton()
	{
		Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.ImageButton[@index='0']")));
		Device.Driver.findElement(By.xpath("//android.widget.ImageButton[@index='0']")).click();
	}
	
	public static void ClickOnTheSwitchToTabViewOption()
	{
		Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//android.widget.TextView[@index='0']")));
		Device.Driver.findElement(By.xpath("//android.widget.TextView[@index='0']")).click();
	}
	
	public static void ClickOnTheGeneralTabMenu() throws InterruptedException
	{
		Thread.sleep(2000);
		List<MobileElement> GeneralTabs=Device.Driver.findElements(By.className("android.widget.RelativeLayout"));
		Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(GeneralTabs.get(3)));
		GeneralTabs.get(3).click();
	}
	
	public static void ClickOnTheLanguageAndIputOption() throws InterruptedException
	{
		Thread.sleep(2000);
		List<MobileElement> LanguageInputOption=Device.Driver.findElements(By.id("android:id/title"));
		Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(LanguageInputOption.get(1)));
		LanguageInputOption.get(1).click();
	}
	
}
