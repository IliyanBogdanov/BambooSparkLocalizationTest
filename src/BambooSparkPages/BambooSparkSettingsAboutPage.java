package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class BambooSparkSettingsAboutPage {

	public static void CreateScreenshotOnTheAboutPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "AboutPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutSettingsOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "AboutPage");
		}
	}
	
	public static void ClickOnTheAboutSettingsOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
		Device.Driver.findElement(By.id("com.wacom.mate:id/settings_toolbar_action_image")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutSettingsOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutSettingsOption())).click();
		}
	}
	
	public static void ClickOnTheAboutTermOfUseLink() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_about_txt_terms_of_use")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/settings_about_txt_terms_of_use")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutTermsOfUse())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutTermsOfUse())).click();
		}
	}
	
	public static void ClickOnTheAboutGoogleAnalyticsLink() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_about_txt_google_analytics")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/settings_about_txt_google_analytics")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutGoogleAnalytics())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutGoogleAnalytics())).click();
		}
	}
	
	public static void CreateScreenshotOnTheTermsOfUsePage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "TermsOfUsePage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutTermsOfUseAboutOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "TermsOfUsePage");
		}
	}
	
	public static void ClickOnTheAboutTermsOfUseAboutBackOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/settings_toolbar_action_image")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutTermsOfUseAboutOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutTermsOfUseAboutOption())).click();
		}
	}
	
	
	public static void CreateScreenshotOnTheGoogleAnalyticsPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "GoogleAnalyticsPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutGoogleAnalyticsAboutOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "GoogleAnalyticsPage");
		}
	}
	
	public static void ClickOnTheAboutGoogleAnalyticsAboutBackOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/settings_toolbar_action_image")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/settings_toolbar_action_image")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutGoogleAnalyticsAboutOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSettingsAboutGoogleAnalyticsAboutOption())).click();
		}
	}
	
}
