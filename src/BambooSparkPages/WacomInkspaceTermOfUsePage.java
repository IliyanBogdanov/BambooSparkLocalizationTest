package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceTermOfUsePage {

	public static void ClickOnTheAgreeOption()
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/tv_terms_of_use_action_agree")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/tv_terms_of_use_action_agree")).click();
			
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetWacomInkspaceTermOfUseAgreeButton())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetWacomInkspaceTermOfUseAgreeButton())).click();;
		}
	}

	public static void CreateScreenshotOnTheWacomInckspaceTermOfUsePage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/tv_terms_of_use_action_agree")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "WacomInkspaceTermOfUse");
			
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetWacomInkspaceTermOfUseAgreeButton())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "WacomInkspaceTermOfUse");
		}
	}
	
}
