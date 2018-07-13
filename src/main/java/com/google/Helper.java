package com.google;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

public class Helper {
	public static String Capture_ScreenShot(WebDriver ldriver,String name) throws IOException
	{
		File src=((TakesScreenshot)ldriver).getScreenshotAs(OutputType.FILE);
		String destination="./screenshots/"+name+System.currentTimeMillis()+".png";
		FileUtils.copyFile(src,new File(destination));
		return destination;
	}

}
