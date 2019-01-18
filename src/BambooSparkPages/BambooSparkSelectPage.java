package BambooSparkPages;

import java.io.IOException;
import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import Helpers.IOSElementsInDifferentLanguages;
import TestBaseClass.Device;
import io.appium.java_client.MobileElement;

public class BambooSparkSelectPage {

	public static void CreateScreenshotOnTheHomePage() throws IOException, InterruptedException
	{
		if(Device.DriverName.equals("Android"))
		{
		
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_close")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SelectPage");
		}else
		{
			Thread.sleep(13000);
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectPageCancelOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SelectPage");
		}
	}
	
	
	public static void ClickOnTheSelectMenuOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_overflow")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_overflow")).click();	
		}else
		{
		
		}
	}
	
	public static void CreateScreenshotOnTheSelectMenuOptions() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
		
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_selection_overflow_menu_merge")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "SelectMenuOptions");
		}else
		{

		}
	}
	
	
	public static void ClickOnTheCombineOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_selection_overflow_menu_merge")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/library_selection_overflow_menu_merge")).click();	
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectPageCombineOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSelectPageCombineOption())).click();
		}
	}
	
	
	public static void ClickOnTheBackToHomePageButton() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_close")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_close")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectPageGoBackToHomePageOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSelectPageGoBackToHomePageOption())).click();
		}
	}
	
	
	public static void ChangeOrientationOfTheFirstFourNotesAndSelect()
	{
		List<MobileElement> AllNotes;
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_close")));
			AllNotes=Device.Driver.findElements(By.id("com.wacom.mate:id/img_file_thumb"));
			Random rnd=new Random();
			for (int i = 0; i < 4; i++) {
				AllNotes.get(i).click();
				int randomNumber=rnd.nextInt(4);
				if(randomNumber==4)
				{
					randomNumber=5;
				}else if(randomNumber==0)
				{
					randomNumber=1;
				}
				for (int j = 0; j < randomNumber; j++) {
					Device.Driver.findElement(By.id("com.wacom.mate:id/btn_rotate")).click();
				}
				AllNotes.get(i).click();
				
			}
			for (int i = 0; i < 4; i++) {
				AllNotes.get(i).click();
			}

		
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectPageCancelOption())));
			AllNotes=Device.Driver.findElements(By.className("UIACollectionCell"));
			Random rnd=new Random();
			for (int i = 0; i < 4; i++) {
				AllNotes.get(i).click();
				int randomNumber=rnd.nextInt(4);
				if(randomNumber==4)
				{
					randomNumber=5;
				}else if(randomNumber==0)
				{
					randomNumber=1;
				}
				for (int j = 0; j < randomNumber; j++) {
					Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAButton[9]")).click();
				}
				AllNotes.get(i).click();
				
			}
			for (int i = 0; i < 4; i++) {
				AllNotes.get(i).click();
			}

		}
	}
	
	public static void ClickOnTheDeleteButton() throws IOException
	{
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
	
	
	public static void CreateScreenshotOnTheDeleteMultipleNotesWindow() throws IOException, InterruptedException
	{
	
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_no")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "DeleteMultipleNotesWindow");
		}
		else if(Device.DriverName.equals("iOSPhone"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIAButton[1]")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "DeleteMultipleNotesWindow");
		}
		
		
		else
		{
			//Thread.sleep(2000);
		//	List<MobileElement> GetAllElemenetsWithIDCancel=Device.Driver.findElements(By.id(IOSElementsInDifferentLanguages.GetSelectPageDeleteButtonCancelOption()));
		//	System.out.println(GetAllElemenetsWithIDCancel.size());
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "DeleteMultipleNotesWindow");
		}
	}
	
	public static void ClickOnTheDeleteMultipleNotesWindowCancelOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_no")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_no")).click();
		
			
			
		}
		else if(Device.DriverName.equals("iOSPhone"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIAButton[1]")));
			Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAActionSheet[1]/UIAButton[1]")).click();
		}
		
		
		else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")));
			Device.Driver.findElement(By.xpath("//UIAApplication[1]/UIAWindow[1]/UIAAlert[1]/UIACollectionView[1]/UIACollectionCell[1]/UIAButton[1]")).click();
		}
	}
	
	
	
	
	public static void ClickOnTheExportButton() throws IOException
	{
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
	
	public static void CloseExportOptions()
	{
		Helpers.tapAction(2, 2);
	}
	
	public static void CreateScreenshotOnTheExportMultipleNotesOptions() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/library_overflow_menu_export_as_image")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "ExportMultipleNotesOptions");
			
		}else if(Device.DriverName.equals("iOSPhone"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetExportAsJPGOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "ExportMultipleNotesOptions");
			
		}else{
			
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("libraryEditViewShare")));
			Device.Driver.findElement(By.id("libraryEditViewShare")).click();
		}
	}
	
	public static void CreateScreenshotOnTheCombineMultipleNotesError() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_yes")));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "CombineMultipleNotesError");
			
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectPageCombineErrorOkOption())));
			Helpers.CreateScreenshot(Helpers.CurrentLanguage, "CombineMultipleNotesError");
		}
	}
	
	public static void ClickOnTheCombineMultipleNotesErrorOkOption() throws IOException
	{
		if(Device.DriverName.equals("Android"))
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id("com.wacom.mate:id/btn_yes")));
			Device.Driver.findElement(By.id("com.wacom.mate:id/btn_yes")).click();
		}else
		{
			Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(By.id(IOSElementsInDifferentLanguages.GetSelectPageCombineErrorOkOption())));
			Device.Driver.findElement(By.id(IOSElementsInDifferentLanguages.GetSelectPageCombineErrorOkOption())).click();
		}
	}

	
}
