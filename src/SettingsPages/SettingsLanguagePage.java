package SettingsPages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Helpers.Helpers;
import TestBaseClass.Device;
import io.appium.java_client.MobileElement;

public class SettingsLanguagePage {
	
	

	public void FindLanguageAndClick(String Language) throws Exception
	{
		Thread.sleep(2002);
		List<MobileElement> Languages=Device.Driver.findElements(By.id("com.lge:id/locale"));
		int counter=0;
		Device.WaitForElement.until(ExpectedConditions.elementToBeClickable(Languages.get(0)));
		boolean LanguageIsFound=false;
		while(!LanguageIsFound)
		{
			Languages=Device.Driver.findElements(By.id("com.lge:id/locale"));
			for (int i = 0; i < Languages.size()-1; i++) {
				if(Languages.get(i).getText().contains(Language))
				{
					LanguageIsFound=true;
					Languages.get(i).click();
					break;
				}
			}
			
			if(!LanguageIsFound)
			{
				Helpers.swipe(Languages.get(Languages.size()-3).getLocation().getX(), Languages.get(Languages.size()-3).getLocation().getY(), Languages.get(Languages.size()-5).getLocation().getX(), Languages.get(Languages.size()-5).getLocation().getX(), 3000);
			}
			++counter;
			if(counter==15)
			{
				throw new Exception("Language is not found!!!");
			}

		}
}
}
