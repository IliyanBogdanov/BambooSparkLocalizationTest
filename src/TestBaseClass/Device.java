package TestBaseClass;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.ios.IOSDriver;
import io.appium.java_client.remote.MobileCapabilityType;

public class Device {
	
	public static AppiumDriver<MobileElement> Driver;
	public static WebDriverWait WaitForElement;
	
	//iOSPhone, Android
	public static String DriverName="Android";
	static DesiredCapabilities cap;
	
	public static void StartBambooSparkApp() throws MalformedURLException, InterruptedException
	{
		if(DriverName.equals("Android"))
		{
			 cap = new DesiredCapabilities();
			 cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Wacom Sofia QA's G3");
			//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI Y625-U51");
			cap.setCapability("appPackage","com.wacom.mate");
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
			cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
			cap.setCapability("appActivity", "com.wacom.mate.LauncherActivity");
			//	cap.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.wacom.mate.LibraryActivity,com.wacom.mate.IntroductionActivity,com.wacom.mate.LibraryDialogActivity,com.wacom.mate.SparkTestActivity,com.wacom.mate.PairNewSparkActivity,com.wacom.mate.view.PreviewActivity,com.wacom.mate.SplitActivity,com.wacom.mate.SettingsActivity,com.wacom.mate.EditNoteActivity,com.wacom.mate.NotificationActivity,com.google.android.gms.ads.AdActivity,com.google.android.gms.ads.purchase.InAppPurchaseActivity");
			Driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
			WaitForElement=new WebDriverWait(Driver, 120);
		}else
		{
			cap =new DesiredCapabilities();
			cap.setCapability("bundleId", "com.wacom.bamboospark" );
			cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "iOS" );
			cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Toni slujeben iPhone");
			cap.setCapability(MobileCapabilityType.UDID, "78e97e2beaef1405b2acc0e71c951fe83e7e2d35");
			cap.setCapability("showIOSLog", false );	  
			//Capabilities.setCapability(MobileCapabilityType.PLATFORM_NAME, "MAC" );
			Driver =new IOSDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"),cap) ;
			WaitForElement=new WebDriverWait(Driver, 120);
			Thread.sleep(10000);
		}

	}
	
	public static void StartSettingsAppForAndroid() throws MalformedURLException
	{
		DesiredCapabilities cap = new DesiredCapabilities();
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Wacom Sofia QA DEV (SM");
		cap.setCapability(MobileCapabilityType.DEVICE_NAME, "Wacom Sofia QA's G3");
		//cap.setCapability(MobileCapabilityType.DEVICE_NAME, "HUAWEI Y625-U51");
		cap.setCapability(MobileCapabilityType.APP,"com.android.settings");
		cap.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
		cap.setCapability(MobileCapabilityType.PLATFORM_VERSION, "5.0");
		cap.setCapability("appActivity", "com.android.settings.Settings");
		//	cap.setCapability(MobileCapabilityType.APP_WAIT_ACTIVITY, "com.wacom.mate.LibraryActivity,com.wacom.mate.IntroductionActivity,com.wacom.mate.LibraryDialogActivity,com.wacom.mate.SparkTestActivity,com.wacom.mate.PairNewSparkActivity,com.wacom.mate.view.PreviewActivity,com.wacom.mate.SplitActivity,com.wacom.mate.SettingsActivity,com.wacom.mate.EditNoteActivity,com.wacom.mate.NotificationActivity,com.google.android.gms.ads.AdActivity,com.google.android.gms.ads.purchase.InAppPurchaseActivity");
		Driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), cap);
		WaitForElement=new WebDriverWait(Driver, 120);
	}
	
	public static void AppClose()
	{
		Driver.quit();
	}
	

}
