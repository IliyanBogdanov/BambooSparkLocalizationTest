package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class BambooSparkSplitPage {

	public static void CreateScreenshotOnTheSplitPage() throws IOException
	{
		{
			if(Device.DriverName.equals("Android"))
			{	
				//Three dot menu
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_close")));
				Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SplitPage");
			}else
			{
				//SettingsOption
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSplitCancelOption())));
				Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SplitPage");
			}
		}
	}
	
	
	
	public static void ClickOnTheSplitCancelButton() throws IOException
	{
		{
			if(Device.DriverName.equals("Android"))
			{	
				//Three dot menu
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_close")));
				Device.Driver.findElement(By.id("com.wacom.mate:id/btn_close")).click();

			}else
			{
				//SettingsOption
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSplitCancelOption())));
				Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSplitCancelOption())).click();
			}
		}
	}
	
}
