package BambooSparkPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;
import io.appium.java_client.MobileElement;

public class BambooSparkHomePage {

	
	public static void ClickOnTheMenuOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{	
			//Three dot menu
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_overflow")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_overflow")).click();
		}else
		{
			//SettingsOption

		}
	}
	
	public static void CreateScreenshotOnTheMenuOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{	
			//Three dot menu
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_overflow_menu_select")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HomePageMenuOptions");
		}else
		{
			//SettingsOption

		}
	}
	
	
	
	public static void CreateScreenshotOnTheHomePage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{	
			//Three dot menu
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_overflow")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HomePageScreenshot");
		}else
		{
			//SettingsOption
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HomePageScreenshot");
		}
	}
	
	
	
	public static void CreateScreenshotOnTheThreeDotMenuOptions() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_overflow_menu_select")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "ThreeDotMenuOptions");
		}
		
		}
	
	public static void ClickOnTheSelectOption() throws InterruptedException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_overflow_menu_select")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/library_overflow_menu_select")).click();
		} else if(Device.DriverName.equals("iOSPhone"))
		{
			Thread.sleep(2000);
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")));
			Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[1]")).click();
		}
		
		else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetHomePageSelectOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetHomePageSelectOption())).click();
		}
	}
	
	public static void ClickOnTheSettingsOption()
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_overflow_menu_settings")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/library_overflow_menu_settings")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")));
			Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[6]")).click();
		}
	}
	
	public static void ClickOnTheFirstNote()
	{
		List<MobileElement> AllNotes;
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_overflow")));
			AllNotes=Device.Driver.findElements(By.id("com.wacom.mate:id/img_file_thumb"));
			AllNotes.get(0).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.className("UIACollectionCell")));
			AllNotes=Device.Driver.findElements(By.className("UIACollectionCell"));
			AllNotes.get(0).click();
		}
	}
	
	
	

	
	
	
}
