package Helpers;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

import TestBaseClass.Device;
import io.appium.java_client.TouchAction;

public class Helpers {

	public static final  String[] Languages={"United States","Deutsch","Nederlands","Русский","(France)","Italiano","(Espa","Polski","(Brasil)","한국어","简体"};
	//public static final  String[] Languages={"China(Traditional)"};
	public static String CurrentLanguage="United States";
	static TouchAction tap;
	
	
	public static void swipe(int x, int y, int endx, int endy, int executionTime)
	{
		Device.Driver.swipe(x, y, endx, endy, executionTime);
	}
	
	public static void tapAction(int X, int Y)
	{
		tap=new TouchAction(Device.Driver);
		tap.tap(X, Y).perform();
	}
	
	public static void CreateScreenshot(String Language, String ScreenshotName) throws IOException
	{
		switch(Language)
		{
			case "United States":
			Language="English";
			break;
			
			case "Deutsch":
			Language="Deutsch";
			break;
			
			case "Nederlands":
			Language="Nederlands";
			break;
			
			case "Русский":
			Language="Russian";
			break;

			case "(France)":
			Language="French";
			break;
				
			case "Italiano":
			Language="Italian";
			break;

			case "(Espa":
			Language="Spanish";
			break;
				
			case "Polski":
			Language="Polish";
			break;
				
			case "(Brasil)":
			Language="Portuguese (Brasil)";
			break;
				
			case "简体":
			Language="China(Simplified)";
			break;
				
			case "繁體":
			Language="China(Traditional)";
			break;
				
			case "한국어":
			Language="Korean";
			break;
			
			default:
				Language=Helpers.CurrentLanguage;
				break;
		}
		
		if(Device.DriverName.equals("Android"))
		{
			File CreateNewFile=((TakesScreenshot)Device.Driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(CreateNewFile,new File( "/Users/nenko/Documents/WacomProjectScreenshots/BambooSparkLocalization/Android/"+Language+"/"+ScreenshotName+"_"+Language+".png"));
		}else
		{
			File CreateNewFile=((TakesScreenshot)Device.Driver).getScreenshotAs(OutputType.FILE);
			FileUtils.copyFile(CreateNewFile,new File( "/Users/nenko/Documents/WacomProjectScreenshots/BambooSparkLocalization/iOS/"+Language+"/"+ScreenshotName+"_"+Language+".png"));
		}
	}
}
