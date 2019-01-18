package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceMakeYourSmartpadMorePowerfulPage {

	
	
	public static void CreateScreenshotOnTheMakeYourSmartpadMorePowerfulPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_txt_action")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "MakeYourSmartpadMorePowerfulOfflineButton");
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id(IOSElementsInDifferentLanguages.GetMakeYourSmartpadMorePowerfulOfflineButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "MakeYourSmartpadMorePowerfulOfflineButton");
		}
	}
	
	public static void ClickOnTheMakeYourSmartpadMorePowerfulOfflineButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_txt_action")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/custom_duplicate_view_txt_action")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id(IOSElementsInDifferentLanguages.GetMakeYourSmartpadMorePowerfulOfflineButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetMakeYourSmartpadMorePowerfulOfflineButton())).click();
		}
	}
	
	
	
}
