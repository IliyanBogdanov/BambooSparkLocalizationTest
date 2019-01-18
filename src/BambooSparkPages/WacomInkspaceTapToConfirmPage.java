package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;

public class WacomInkspaceTapToConfirmPage {

	public static void CreateScreenshotOnTheTapToConfirmPage() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id("com.wacom.mate:id/custom_duplicate_view_txt_title")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "TapToConfirmPage");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.visibilityOfElementLocated(By.id(IOSElementsInDifferentLanguages.GetTapToConfirmTapToConfirmText())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "TapToConfirmPage");
		}
	}
	
}
