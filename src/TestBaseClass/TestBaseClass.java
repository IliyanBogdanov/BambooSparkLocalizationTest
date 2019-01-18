package TestBaseClass;

import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;

import Helpers.Helpers;
import Pages.Page;

public class TestBaseClass {

	
	public static void StartBambooSpark() throws MalformedURLException, InterruptedException
	{
		Device.StartBambooSparkApp();
	}
	
	@SuppressWarnings("static-access")
	public static void SetLanguage(String Language) throws Exception
	{
		if(Device.DriverName.equals("Android"))
		{
		Device.StartSettingsAppForAndroid();
		Page.SettingsHomePage().ClickOnTheMoreOptionButton();
		Page.SettingsHomePage().ClickOnTheSwitchToTabViewOption();
		Page.SettingsHomePage().ClickOnTheGeneralTabMenu();
		Page.SettingsHomePage().ClickOnTheLanguageAndIputOption();
		Page.SettingsLanguageAndInputPage().ClickOnTheLanguageOption();
		Page.SettingsLanguagePage().FindLanguageAndClick(Language);
		Helpers.CurrentLanguage=Language;
		Device.AppClose();
		}

	}
	
	public static void InstallBambooSparkApp() throws IOException, InterruptedException
	{
		if(Device.DriverName.equals("Android"))
		{
			Runtime.getRuntime().exec("/Users/nenko/Documents/android-sdk-macosx/adb install /Users/nenko/Documents/WacomTestingProjects/BambooSparkLocalizationTest/mate-release-1.5.0-rc6.apk");
			Thread.sleep(30000);
		}else
		{
			Runtime.getRuntime().exec("/usr/local/bin/ideviceinstaller -i /Users/nenko/Desktop/BambooSparkIOSIPA/Inkspace_Dev.ipa");
			Thread.sleep(10000);
		}
	}
	
	public static void UninstallBambooSparkApp() throws IOException, InterruptedException
	{
		if(Device.DriverName.equals("Android"))
		{
			Runtime.getRuntime().exec("/Users/nenko/Documents/android-sdk-macosx/adb shell pm uninstall com.wacom.mate");
			Thread.sleep(5000);
		}else
		{
		  Runtime.getRuntime().exec("/usr/local/bin/ideviceinstaller -U com.wacom.bamboospark");
		  Thread.sleep(5000);
		}
	}
	
	
	public static void CloseBambooSpark() throws MalformedURLException
	{
		Device.AppClose();
	}
	

	
	
	
}
