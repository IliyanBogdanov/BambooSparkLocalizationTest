package BambooSparkPages;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;
import io.appium.java_client.MobileElement;

public class BambooSparkNotePreviewPage {

	
	
	public static void CreateScreenshotOnTheNotePreviewPage() throws IOException, InterruptedException{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_overflow")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "NotePreviewScreenshot");
		}else
		{
			if(Device.DriverName.equals("iOSPhone"))
			{
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetNotePreviewEditLink())));
				Helpers.CreateScreenshot(Helpers.CurrentLanguage, "NotePreviewScreenshot");
				
			}else
			{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetDrawOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "NotePreviewScreenshot");
			}
		}
	}
	
	
	public static void ClickOnTheDrawOption(){
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/preview_overflow_menu_draw")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/preview_overflow_menu_draw")).click();
		}else if(Device.DriverName.equals("iOSPhone"))
		{
			
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")));
				Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
		}
		else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetDrawOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetDrawOption())).click();
			
		}
	}
	
	public static void ClickOnTheSplitOption(){
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/preview_overflow_menu_split")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/preview_overflow_menu_split")).click();
		}	else if(Device.DriverName.equals("iOSPhone"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")));
			Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[2]/UIAButton[1]")).click();
		}
		else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSplitOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSplitOption())).click();
			
		}
	}
	
	public static void GoBackButton(){
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_back")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_back")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetGoBackToHomePageOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetGoBackToHomePageOption())).click();
		}
	}
	
	
	public static void ClickOnTheExportButton(){
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_share")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_share")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("libraryEditViewShare")));
			Device.Driver.findElement(By.id("libraryEditViewShare")).click();
		}
	}
	
	
	public static void CreateScreenshotOnTheExportOptions() throws IOException{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_overflow_menu_export_as_image")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SingleNoteExportOptions");
		}else if(Device.DriverName.equals("iOSPhone"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetExportAsJPGOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SingleNoteExportOptions");
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("libraryEditViewShare")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SingleNoteExportOptions");
			Device.Driver.findElement(By.id("libraryEditViewShare")).click();
		}
	}
	

	
	public static void ClickOnTheDeleteButton(){
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_delete")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_delete")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("libraryEditViewDelete")));
			Device.Driver.findElement(By.id("libraryEditViewDelete")).click();
		}
	}
	
	public static void ClickOnTheDeleteButtonCancelOption(){
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_no")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_no")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetDeleteNoteCancelOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetDeleteNoteCancelOption())).click();
		}
	}
	
	
	
	
	public static void ClickOnTheMenuOption() throws IOException{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_overflow")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_overflow")).click();
		}else if (Device.DriverName.equals("iOSPhone"))
		{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetNotePreviewEditLink())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetNotePreviewEditLink())).click();
			
		}
	}
	
	
	
	
	
	
	public static void CreateScreenshotOnTheNotePreviewMenuOptions() throws IOException{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/preview_overflow_menu_draw")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "NotePreviewMenuOptionsScreenshot");
		}else if(Device.DriverName.equals("iOSPhone"))
		{
				Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")));
				Helpers.CreateScreenshot(Helpers.CurrentLanguage, "NotePreviewMenuOptionsScreenshot");
		}
	}

	
	
	
	
	public static void CloseExportOptions() throws InterruptedException
	{
		Helpers.tapAction(2, 2);
		Thread.sleep(1000);
	}
	
	public static void CreateScreenshotOnTheDeleteNotesWindowOptions() throws IOException{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_no")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "DeleteNoteOptions");
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetDeleteNoteCancelOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "DeleteNoteOptions");
		}
	}
	
	
	
}
