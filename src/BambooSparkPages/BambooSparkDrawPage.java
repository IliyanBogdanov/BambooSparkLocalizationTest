package BambooSparkPages;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBaseClass.Device;

public class BambooSparkDrawPage {
	
	public static void CreateScreenshotOnDrawOrErasePage() throws IOException
	{
		{
			if(Device.DriverName.equals("Android"))
			{	
				//Three dot menu
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/edit_note_btn_save")));
				Helpers.CreateScreenshot(Helpers.CurrentLanguage, "DrawOrErasePage");
			}else
			{
				//SettingsOption
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("btn action done")));
				Helpers.CreateScreenshot(Helpers.CurrentLanguage, "DrawOrErasePage");
			}
		}
	}
	
	public static void ClickOnTheSaveDrawOrEraseButton()
	{
		{
			if(Device.DriverName.equals("Android"))
			{	
				//Three dot menu
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/edit_note_btn_save")));
				Device.Driver.findElement(By.id("com.wacom.mate:id/edit_note_btn_save")).click();
			
			}else
			{
				//SettingsOption
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("btn action done")));
				Device.Driver.findElement(By.id("btn action done")).click();
			}
		}
	}

	

	
	
	
	public static void Draw()
	{
		Helpers.swipe(500, 900, 670, 1299, 2000);
	}
	
}
