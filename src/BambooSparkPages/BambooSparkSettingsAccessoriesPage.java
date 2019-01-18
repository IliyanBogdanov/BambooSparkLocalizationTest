package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class BambooSparkSettingsAccessoriesPage {

	
	public static void CreateScreenshotOnTheAccessoriesPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "AccessoriesPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAccessoriesSettingsOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "AccessoriesPage");
		}
	}
	
	public static void ClickOnTheAccessoriesSettingsOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/settings_toolbar_action_image")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAccessoriesSettingsOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAccessoriesSettingsOption())).click();
		}
	}
}
