package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceConnectYourDeviceOrLoginWithWacomIDPage {

	public static void CreateScreenshotOnTheConnectYourDevicePage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_button")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "ConnectYourDevice");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetConnectYourDeviceButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "ConnectYourDevice");
		}
	}
	
	
	public static void ClickOnTheConnectYourDeviceButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_button")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/custom_duplicate_view_button")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetConnectYourDeviceButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetConnectYourDeviceButton())).click();
		}
	}
	
	
}
