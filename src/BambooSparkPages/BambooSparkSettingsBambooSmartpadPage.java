package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class BambooSparkSettingsBambooSmartpadPage {

	public static void CreateScreenshotBambooSmartpadPage() throws IOException, InterruptedException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsBambooSmartpadPage");
			
			Helpers.swipe(Device.Driver.findElement(By.id("com.wacom.mate:id/txt_device_orientation_header")).getLocation().getX(), Device.Driver.findElement(By.id("com.wacom.mate:id/txt_device_orientation_header")).getLocation().getY(), Device.Driver.findElement(By.id("com.wacom.mate:id/txt_device_orientation_header")).getLocation().getX(), Device.Driver.findElement(By.id("com.wacom.mate:id/txt_device_orientation_header")).getLocation().getY()-200, 2222);
		
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsBambooSmartpadPage2");
		}else if(Device.DriverName.equals("iOSPhone"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadSettingsOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsBambooSmartpadPage");
			
			int startX=Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]")).getLocation().getX();
			int startY=Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIATableView[1]/UIATableCell[5]")).getLocation().getY();
			int endX=startX;
			int endY=startY-90;
			Helpers.swipe(startX, startY, endX, endY, 2000);
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsBambooSmartpadPage2");
		}
		else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadSettingsOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsBambooSmartpadPage");
		}
	}
	
	public static void ClickOnTheSettingsOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{	
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/settings_toolbar_action_image")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadSettingsOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadSettingsOption())).click();
		}
	}
	
}
