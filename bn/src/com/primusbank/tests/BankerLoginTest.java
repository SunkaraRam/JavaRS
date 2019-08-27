package com.primusbank.tests;

import org.testng.Assert;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.mongodb.diagnostics.logging.Logger;
import com.primusbank.contatns.PrimusbankConstants;
import com.primusbank.libraries.BankerHomePage;
import com.primusbank.libraries.PrimusBankHomePage;

public class BankerLoginTest extends PrimusbankConstants {

	@Parameters({"brch","uid1","pwd1"})
	@Test
	public void CheckBankerLogin(String brch,String uid1,String pwd1) {
		
		PrimusBankHomePage phome = new PrimusBankHomePage();
		
		ExtentHtmlReporter path = new ExtentHtmlReporter("d://Banker Login Process");
		
		ExtentReports report= new ExtentReports();
		
		report.attachReporter(path);
		
		ExtentTest hint = report.createTest("Banker Login Processing");
		
		boolean res = phome.bankerLogin(brch, uid1, pwd1);
		
		Assert.assertTrue(res);
		
		hint.log(Status.PASS, "BankerLogin Success");
		
		BankerHomePage bhome = new BankerHomePage();
		
		bhome.bankerLogout();
		
	}

}
