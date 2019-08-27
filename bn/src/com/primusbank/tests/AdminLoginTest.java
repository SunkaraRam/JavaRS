package com.primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.primusbank.contatns.PrimusbankConstants;
import com.primusbank.libraries.AdminHomePage;
import com.primusbank.libraries.PrimusBankHomePage;



public class AdminLoginTest extends PrimusbankConstants {
	
	@Parameters({"uid","pwd"})
	@Test
	public void checkAdminLogin(String uid,String pwd) {
		
		
		ExtentHtmlReporter path = new ExtentHtmlReporter("d://adminlogintest.html");
		
		ExtentReports  report= new ExtentReports();
		
		report.attachReporter(path);
		
		ExtentTest hint = report.createTest("Admin Processing");
		
		PrimusBankHomePage phome = new PrimusBankHomePage();
			
		boolean res = phome.adminLogin(uid, pwd);
		
		Assert.assertTrue(res);
		
		hint.log(Status.PASS, "AdminLoginSuccess");
		
		
		AdminHomePage ahome = new AdminHomePage();
		
		ahome.adminLogout();
	
	
		
	}

}
