package BambooSparkLocalizationTests;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import BambooSparkPages.BambooSparkDrawPage;
import BambooSparkPages.BambooSparkHomePage;
import BambooSparkPages.BambooSparkNotePreviewPage;
import BambooSparkPages.BambooSparkSelectPage;
import BambooSparkPages.BambooSparkSplitPage;
import Helpers.Helpers;
import Pages.Page;
import TestBaseClass.Device;
import TestBaseClass.TestBaseClass;
import io.appium.java_client.MobileElement;

public class LocalizationTest extends TestBaseClass {
  @SuppressWarnings("static-access")
//@Test
  public void LocalizationTest() throws Exception {
	  
	SetLanguage(Helpers.CurrentLanguage);
	StartBambooSpark();
	
	//Note
	Page.BambooSparkHomePage().CreateScreenshotOnTheHomePage();
	Page.BambooSparkHomePage().ClickOnTheFirstNote();
	Page.BambooSparkNotePreviewPage().CreateScreenshotOnTheNotePreviewPage();
	Page.BambooSparkNotePreviewPage().ClickOnTheExportButton();
	Page.BambooSparkNotePreviewPage().CreateScreenshotOnTheExportOptions();
	Page.BambooSparkNotePreviewPage().CloseExportOptions();
	Page.BambooSparkNotePreviewPage().ClickOnTheDeleteButton();
	Page.BambooSparkNotePreviewPage().CreateScreenshotOnTheDeleteNotesWindowOptions();
	Page.BambooSparkNotePreviewPage().ClickOnTheDeleteButtonCancelOption();
	Page.BambooSparkNotePreviewPage().ClickOnTheMenuOption();
	Page.BambooSparkNotePreviewPage().CreateScreenshotOnTheNotePreviewMenuOptions();
	Page.BambooSparkNotePreviewPage().ClickOnTheDrawOption();
	Page.BambooSparkDrawPage().CreateScreenshotOnDrawOrErasePage();
	//Page.BambooSparkDrawPage().Draw();
	Page.BambooSparkDrawPage().ClickOnTheSaveDrawOrEraseButton();
	Page.BambooSparkNotePreviewPage().ClickOnTheMenuOption();
	Page.BambooSparkNotePreviewPage().ClickOnTheSplitOption();
	Page.BambooSparkSplitPage().CreateScreenshotOnTheSplitPage();
	Page.BambooSparkSplitPage().ClickOnTheSplitCancelButton();
	Page.BambooSparkNotePreviewPage().GoBackButton();
	
	//Multiple Notes
	Page.BambooSparkHomePage().ClickOnTheMenuOption();
	Page.BambooSparkHomePage().CreateScreenshotOnTheMenuOption();
	Page.BambooSparkHomePage().ClickOnTheSelectOption();
	Page.BambooSparkSelectPage().CreateScreenshotOnTheHomePage();
	Page.BambooSparkSelectPage().ChangeOrientationOfTheFirstFourNotesAndSelect();
	Page.BambooSparkSelectPage().ClickOnTheSelectMenuOption();
	Page.BambooSparkSelectPage().CreateScreenshotOnTheSelectMenuOptions();
	Page.BambooSparkSelectPage().ClickOnTheCombineOption();
	Page.BambooSparkSelectPage().CreateScreenshotOnTheCombineMultipleNotesError();
	Page.BambooSparkSelectPage().ClickOnTheCombineMultipleNotesErrorOkOption();
	Page.BambooSparkSelectPage().ClickOnTheDeleteButton();
	Page.BambooSparkSelectPage().CreateScreenshotOnTheDeleteMultipleNotesWindow();
	Page.BambooSparkSelectPage().ClickOnTheDeleteMultipleNotesWindowCancelOption();
	Page.BambooSparkSelectPage().ClickOnTheExportButton();
	Page.BambooSparkSelectPage().CreateScreenshotOnTheExportMultipleNotesOptions();
	Page.BambooSparkSelectPage().CloseExportOptions();
	Page.BambooSparkSelectPage().ClickOnTheBackToHomePageButton();
	
	//Settings
	Page.BambooSparkHomePage().ClickOnTheMenuOption();
	Page.BambooSparkHomePage().ClickOnTheSettingsOption();
	Page.BambooSparkSettingsHomePage().CreateScreenshotOnTheSettingsHomePage();
	Page.BambooSparkSettingsHomePage().ClickOnTheBambooSmartpadOption();
	Page.BambooSparkSettingsBambooSmartpadPage().CreateScreenshotBambooSmartpadPage();
	
	
	
	Page.BambooSparkSettingsBambooSmartpadPage().ClickOnTheSettingsOption();
	Page.BambooSparkSettingsHomePage().ClickOnTheOtherAppsOption();
	Page.BambooSparkSettingsOtherAppsPage().CreateScreenshotOnTheOtherAppsPage();
	Page.BambooSparkSettingsOtherAppsPage().ClickOnTheOtherAppsSettingsOption();
	Page.BambooSparkSettingsHomePage().ClickOnTheAccessoriesOption();
	Page.BambooSparkSettingsAccessoriesPage().CreateScreenshotOnTheAccessoriesPage();
	Page.BambooSparkSettingsAccessoriesPage().ClickOnTheAccessoriesSettingsOption();
	Page.BambooSparkSettingsHomePage().ClickOnTheAboutOption();
	Page.BambooSparkSettingsAboutPage().CreateScreenshotOnTheAboutPage();
	Page.BambooSparkSettingsAboutPage().ClickOnTheAboutTermOfUseLink();
	Page.BambooSparkSettingsAboutPage().CreateScreenshotOnTheTermsOfUsePage();
	Page.BambooSparkSettingsAboutPage().ClickOnTheAboutTermsOfUseAboutBackOption();
	Page.BambooSparkSettingsAboutPage().ClickOnTheAboutGoogleAnalyticsLink();
	Page.BambooSparkSettingsAboutPage().CreateScreenshotOnTheGoogleAnalyticsPage();
	Page.BambooSparkSettingsAboutPage().ClickOnTheAboutGoogleAnalyticsAboutBackOption();
	Page.BambooSparkSettingsAboutPage().ClickOnTheAboutSettingsOption();
	Page.BambooSparkSettingsHomePage().ClickOnTheInkspaceOption();
	Page.BambooSparkSettingsInkspacePage().CreateScreenshotOnTheInkspacePage();
	
	CloseBambooSpark();
  }
  
  
  //RequaresManualSteps
  @SuppressWarnings("static-access")
  @Test
  public static void BmabooSparkLocalizationPreSteps() throws Exception
  {	
	  for (int i = 0; i < Helpers.Languages.length; i++) {
		
	
	//  SetLanguage(Helpers.CurrentLanguage);
	  SetLanguage(Helpers.Languages[i]);
      InstallBambooSparkApp();
	  StartBambooSpark();
	  Page.WacomInkspaceTermOfUsePage().CreateScreenshotOnTheWacomInckspaceTermOfUsePage();
	  Page.WacomInkspaceTermOfUsePage().ClickOnTheAgreeOption();
	  
	  Page.WacomInkspaceConnectYourDeviceOrLoginWithWacomIDPage().CreateScreenshotOnTheConnectYourDevicePage();
	  Page.WacomInkspaceConnectYourDeviceOrLoginWithWacomIDPage().ClickOnTheConnectYourDeviceButton();
	  
	  Page.WacomInkspaceTurnOnBambooSmartpadPage().CreateScreenshotOnTheTurnOnBambooSmartpadPage();
	  Page.WacomInkspaceTurnOnBambooSmartpadPage().ClickOnTheNextButton();
	  
	  Page.WacomInkspaceHoldFor6SecondsPage().CreateScreenshotOnTheHoldFor6SecondsPage();
	  Page.WacomInkspaceHoldFor6SecondsPage().ClickOnTheStartOverButton();
	  Page.WacomInkspaceHoldFor6SecondsPage().CreateScreenshotOnTheHoldFor6SecondsPageStartOverWindow();
	  Page.WacomInkspaceHoldFor6SecondsPage().ClickOnTheStartOverCancelOption();
	  Page.WacomInkspaceHoldFor6SecondsPage().CreateScreenshotOnTheDeviceNotFoundWindow();
	  Page.WacomInkspaceHoldFor6SecondsPage().ClickOnTheDeviceNotFoundOkOption();
	  
	  
	  Page.WacomInkspaceHoldFor6SecondsPage().CreateScreenshotOnTheSelectBambooSmartpad();
	  Page.WacomInkspaceHoldFor6SecondsPage().ClickOnTheSelectYourBambooSmartpadNextButton();
	  
	  Page.WacomInkspaceTapToConfirmPage().CreateScreenshotOnTheTapToConfirmPage();
	  Page.WacomInkspaceEnterAUniqueNamePage().CreateScreenshotOnTheEnterAUniqueNamePage();
	  Page.WacomInkspaceEnterAUniqueNamePage().ClickOnTheNextButton();
	  
	  Page.WacomInkspaceAdjustBambooSmartpadOrientationPage().CreateScreenshotOnTheAdjustBambooSmartpadOrientationPage();
	  Page.WacomInkspaceAdjustBambooSmartpadOrientationPage().ClickOnTheAdjustRightOrientationOption();
	  Page.WacomInkspaceAdjustBambooSmartpadOrientationPage().ClickOnTheAdjustOrientationNextButton();
	  
	  Page.WacomInkspaceMakeYourSmartpadMorePowerfulPage().CreateScreenshotOnTheMakeYourSmartpadMorePowerfulPage();
	  Page.WacomInkspaceMakeYourSmartpadMorePowerfulPage().ClickOnTheMakeYourSmartpadMorePowerfulOfflineButton();
	  
	  Page.WacomInkspacePairingSuccessfulPage().CreateScreenshotOnThePairingSuccessfulPage();
	  Page.WacomInkspacePairingSuccessfulPage().ClickOnThePairingSuccessfulDoneButton();
	  CloseBambooSpark();
	  UninstallBambooSparkApp();
	  }
	  
  }
  
  
  
}
