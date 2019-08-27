package com.primusbank.contatns;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class PrimusbankConstants {

	public static WebDriver driver;
	
	public static String url = "http://primusbank.qedgetech.com";
	
	@BeforeSuite
	public static void launchApp() {
		
		ExtentHtmlReporter path = new ExtentHtmlReporter("d://Constant.html");
		
		ExtentReports report = new ExtentReports();
		
		report.attachReporter(path);
		
		ExtentTest logger = report.createTest("Browser Launched");
	
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);
		
		logger.log(Status.INFO,"Application is Running");

	}
	
	@AfterSuite
	public static void closeApp() 
	{
		
			driver.close();
		
	}

}
