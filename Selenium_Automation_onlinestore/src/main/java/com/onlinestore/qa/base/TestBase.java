package com.onlinestore.qa.base;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import com.onlinestore.qa.util.TestUtil;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.openqa.selenium.chrome.ChromeOptions;


public class TestBase {
	
	public static final Logger logger= LogManager.getLogger(TestBase.class);
	public static WebDriver driver;
	public static Properties prop;
	
	
	public TestBase()
	{
	try {
		prop=new Properties();
		FileInputStream ip= new FileInputStream("C:\\Users\\user\\eclipse-workspace\\Selenium_Automation_onlinestore\\src\\main\\java\\com\\onlinestore\\qa\\config\\config.properties");
		prop.load(ip);
	}
	catch(FileNotFoundException e)
	{
		e.getStackTrace();
	}
	catch(IOException e) {
		e.getStackTrace();
	}
		
	}
	public void initialization()
	{
		
		String browserName=prop.getProperty("browser");
		System.out.println(browserName);
		if(browserName.equals("chrome"))
		{
			WebDriverManager.chromedriver().setup();
			ChromeOptions chromeOptions = new ChromeOptions();
			chromeOptions.addArguments("--remote-allow-origins=*");
			driver = new ChromeDriver(chromeOptions);
			System.out.println("hiii");

		}
		else if(browserName.equals("FF"))
		{
			WebDriverManager.firefoxdriver().setup();
			
		}
		System.out.println("Started");
		driver.get(prop.getProperty("url"));
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(TestUtil.PAGE_LOAD_TIMEOUT, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(TestUtil.IMPLICITLY_WAIT, TimeUnit.SECONDS);
		driver.manage().window().maximize();

	}

	}
	
