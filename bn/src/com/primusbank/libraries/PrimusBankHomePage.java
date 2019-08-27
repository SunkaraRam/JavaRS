package com.primusbank.libraries;



import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.Select;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.primusbank.contatns.PrimusbankConstants;


public class PrimusBankHomePage extends PrimusbankConstants {

	
	public  boolean adminLogin(String uid,String pwd) {
		
		ExtentHtmlReporter path = new ExtentHtmlReporter("d://adminlogintest.html");
		
		ExtentReports  report= new ExtentReports();
		
		report.attachReporter(path);
		
		ExtentTest hint = report.createTest("Admin Login Processing");
		
		String expurl,acturl;
		
		
		
		expurl = "adminflow" ;
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);;
		
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
		
		acturl = driver.getCurrentUrl();
		
		
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) {
			
			return true;
			
		
			
		} else {

			return false;
			
		}
		
	}
	
	public boolean bankerLogin(String brch, String uid, String pwd) {
		
		String expval,actval;
		
		expval = "Bankers_flow";
		
		Select dlist = new Select(driver.findElement(By.id("drlist")));
		
		dlist.selectByVisibleText(brch);
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);;
		
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
		
		actval = driver.getCurrentUrl();
		
		if (actval.toLowerCase().contains(expval.toLowerCase())) {

			return true;
			
		} else {
			
			return false;

		}
		
			
	}
	
}


