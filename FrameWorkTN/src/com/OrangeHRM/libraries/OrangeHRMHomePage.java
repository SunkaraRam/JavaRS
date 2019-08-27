package com.OrangeHRM.libraries;

import org.openqa.selenium.By;

import com.OrangeHRM.constants.OrangeHRMConstants;

public class OrangeHRMHomePage extends OrangeHRMConstants {

	public boolean OrangeLogin(String uid,String pwd) {
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");;
		
		driver.findElement(By.id("btnLogin")).click();
		 
		String expurl = "dashboard";
		
		String acturl = driver.getCurrentUrl();
 		
		if (acturl.equalsIgnoreCase(expurl)) {
			
			return true;
	
		} else {
			
			return false;

		}
		
		

	}

}
