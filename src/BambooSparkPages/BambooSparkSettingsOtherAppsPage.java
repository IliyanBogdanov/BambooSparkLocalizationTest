package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class BambooSparkSettingsOtherAppsPage {
	
	public static void CreateScreenshotOnTheOtherAppsPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
		Helpers.CreateScreenshot(Helpers.CurrentLanguage, "OtherAppsPage");
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingOtherAppsSettingsOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "OtherAppsPage");
		}
	}
	
	public static void ClickOnTheOtherAppsSettingsOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/settings_toolbar_action_image")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingOtherAppsSettingsOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingOtherAppsSettingsOption())).click();
		}
	}
	
	

}
