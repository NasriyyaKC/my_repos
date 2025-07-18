package com.onlinestore.qa.util;

import com.onlinestore.qa.base.TestBase;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class TestUtil extends TestBase {
	public static long PAGE_LOAD_TIMEOUT=20;
	public static long IMPLICITLY_WAIT=10;
	
	public static void takesScreenshot(String testMethodName) 
	{
		TakesScreenshot scrnshot=((TakesScreenshot)driver);
		File srcFile=scrnshot.getScreenshotAs(OutputType.FILE);
		//String currentDir = System.getProperty("user.dir");
		try {
			FileUtils.copyFile(srcFile, new File("C:\\Users\\user\\eclipse-workspace\\Selenium_Automation_onlinestore\\screenshots\\scrnshot" + "_"+testMethodName+"_"+System.currentTimeMillis() + ".png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
