package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceHoldFor6SecondsPage {

	
	public static void CreateScreenshotOnTheHoldFor6SecondsPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_txt_action")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HoldFor6SecondsPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetHoldFor6SecondsStartOverButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HoldFor6SecondsPage");
		}
	}
	
	public static void ClickOnTheStartOverButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_txt_action")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/custom_duplicate_view_txt_action")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetHoldFor6SecondsStartOverButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetHoldFor6SecondsStartOverButton())).click();
		}
	}
	

	public static void CreateScreenshotOnTheHoldFor6SecondsPageStartOverWindow() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_no")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HoldFor6SecondsStartOverWindow");
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetHoldFor6SecondsStartOverWindowCancelOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HoldFor6SecondsStartOverWindow");
		}
	}
	
	public static void ClickOnTheStartOverCancelOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_no")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_no")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetHoldFor6SecondsStartOverWindowCancelOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetHoldFor6SecondsStartOverWindowCancelOption())).click();
		}
	}
	
	
	public static void CreateScreenshotOnTheDeviceNotFoundWindow() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_yes")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HoldFor6SecondsDeviceNotFoundWindow");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "HoldFor6SecondsDeviceNotFoundWindow");
		}
	}
	
	public static void ClickOnTheDeviceNotFoundOkOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_yes")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_yes")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")));
			Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
		}
	}
	
	
	public static void ClickOnTheSelectYourBambooSmartpadNextButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("select_spark_dialog_button_next")));
			Device.Driver.findElement(By.id("select_spark_dialog_button_next")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectYourBambooSmartpadNextButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSelectYourBambooSmartpadNextButton())).click();
		}
	}
	
	public static void CreateScreenshotOnTheSelectBambooSmartpad() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("select_spark_dialog_button_next")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SelectYourBambooSmartpad");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectYourBambooSmartpadNextButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SelectYourBambooSmartpad");
		}
	}
	
	
	

}
