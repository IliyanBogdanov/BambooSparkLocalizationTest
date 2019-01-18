package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceEnterAUniqueNamePage {

	public static void ClickOnTheNextButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/discovery_naming_button_next")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/discovery_naming_button_next")).click();
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetEnterAUniqueNameNextButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetEnterAUniqueNameNextButton())).click();
		}
	}
	
	public static void CreateScreenshotOnTheEnterAUniqueNamePage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/discovery_naming_button_next")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "EnterAUniqueName");
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetEnterAUniqueNameNextButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "EnterAUniqueName");
		}
	}
	
	
}
