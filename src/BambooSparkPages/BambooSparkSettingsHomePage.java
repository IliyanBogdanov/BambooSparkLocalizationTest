package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class BambooSparkSettingsHomePage {

	public static void CreateScreenshotOnTheSettingsHomePage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/txt_settings_item_discovery")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsHomePage");
		}else if(Device.DriverName.equals("iOSPhone"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsHomePage");
			
			int startX=Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsInkspaceOption())).getLocation().getX();
			int startY=Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsInkspaceOption())).getLocation().getY();
			int endX=startX;
			int endY=startY-90;
			
			Helpers.swipe(startX, startY, endX, endY, 2000);
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsHomePage2");
			endY=startY+90;
			Helpers.swipe(startX, startY, endX, endY, 2000);
		}
		else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SettingsHomePage");
		}
	}
	
	public static void ClickOnTheBambooSmartpadOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/txt_settings_item_discovery")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/txt_settings_item_discovery")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsBambooSmartpadOption())).click();
		}
	}
	
	public static void ClickOnTheInkspaceOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/txt_settings_item_wacom_cloud")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/txt_settings_item_wacom_cloud")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsInkspaceOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsInkspaceOption())).click();
		}
	}
	
	public static void ClickOnTheOtherAppsOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/txt_settings_item_other_apps")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/txt_settings_item_other_apps")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingOtherAppsOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingOtherAppsOption())).click();
		}
	}
	
	public static void ClickOnTheAccessoriesOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/txt_settings_item_accessories")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/txt_settings_item_accessories")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAccessoriesOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAccessoriesOption())).click();
		}
	}
	
	public static void ClickOnTheAboutOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/txt_settings_item_about")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/txt_settings_item_about")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutOption())).click();
		}
	}
	
	
}
