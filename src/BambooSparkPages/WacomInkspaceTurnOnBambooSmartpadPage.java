package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceTurnOnBambooSmartpadPage {

	public static void CreateScreenshotOnTheTurnOnBambooSmartpadPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_button")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "TurnOnYourBambooSmartpadPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetTurnOnYourBambooSmartpadNextButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "TurnOnYourBambooSmartpadPage");
		}
	}
	
	public static void ClickOnTheNextButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/custom_duplicate_view_button")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/custom_duplicate_view_button")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetTurnOnYourBambooSmartpadNextButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetTurnOnYourBambooSmartpadNextButton())).click();
		}
	}
	
}
