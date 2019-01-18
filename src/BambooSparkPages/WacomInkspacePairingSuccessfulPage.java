package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspacePairingSuccessfulPage {
	
	public static void CreateScreenshotOnThePairingSuccessfulPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_button")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "PairingSuccessfulPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id(IOSElementsInDifferentLanguages.GetPairingSuccessfulDoneButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "PairingSuccessfulPage");
		}
	}
	
	public static void ClickOnThePairingSuccessfulDoneButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_button")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/custom_duplicate_view_button")).click();

		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id(IOSElementsInDifferentLanguages.GetPairingSuccessfulDoneButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetPairingSuccessfulDoneButton())).click();
		}
	}
	
}
