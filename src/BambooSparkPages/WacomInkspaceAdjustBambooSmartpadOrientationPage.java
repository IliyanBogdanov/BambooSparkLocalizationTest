package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceAdjustBambooSmartpadOrientationPage {

	public static void CreateScreenshotOnTheAdjustBambooSmartpadOrientationPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_orientation_portrait")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "AdjustBambooSmartpadOrientationPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "AdjustBambooSmartpadOrientationPage");
		}
	}
	
	public static void ClickOnTheAdjustRightOrientationOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_orientation_portrait")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_orientation_portrait")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")));
			Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[4]")).click();
		}
	}
	
	public static void ClickOnTheAdjustOrientationNextButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/discovery_orientation_button")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/discovery_orientation_button")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id(IOSElementsInDifferentLanguages.GetAdjustOrientationNextButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetAdjustOrientationNextButton())).click();
		}
	}
	
	
}
