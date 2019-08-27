package com.OrangeHRM.libraries;

import org.openqa.selenium.By;

import com.OrangeHRM.constants.OrangeHRMConstants;

public class OrangeClose extends OrangeHRMConstants{

	public static void logOut() {
		
		driver.findElement(By.id("/html/body/div[1]/div[1]/div[1]/ul/li[3]/a"));
		
	}

}
