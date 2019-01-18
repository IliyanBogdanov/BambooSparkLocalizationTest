package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class BambooSparkSettingsInkspacePage {
	
	public static void CreateScreenshotOnTheInkspacePage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_dialog_close_button")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "InkspacePage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSettingsInkspaceOptionSignUpButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "InkspacePage");
		}
	}
	
	
}
