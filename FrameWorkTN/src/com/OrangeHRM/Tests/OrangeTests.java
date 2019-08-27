package com.OrangeHRM.Tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.OrangeHRM.constants.OrangeHRMConstants;
import com.OrangeHRM.libraries.OrangeHRMHomePage;

public class OrangeTests extends OrangeHRMConstants{

	@Test
	public static void loginTest(String uid,String pwd) {
		
		OrangeHRMHomePage phome = new OrangeHRMHomePage();
		
		boolean res = phome.OrangeLogin(uid, pwd);
		
		Assert.assertTrue(res);		
		
		
	}

}
