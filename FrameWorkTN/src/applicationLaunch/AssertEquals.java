package applicationLaunch;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertEquals extends PrimusbankHomepage{
	
	
	@Test
	public  void test1() {
		
		String expval,actval;
		
		expval ="Google";
		
		actval = "Google";
		
		Assert.assertEquals(expval, actval);
				
	}
	
	@Test
	public void test2(){
		 
		String expval,actval;
		
		expval = "Google";
		
		actval = "Gmail";
		
		Assert.assertEquals(actval, expval);
		
	}

	
	/*
	static WebDriver driver;
	 
	@Test
	public void gmail(){
		

		PrimusbankHomepage phome = new PrimusbankHomepage();
		
		phome.launchApp("http://gmail.com");

		String expval,actval;
		
		expval = "gmail";
		
		actval = driver.getCurrentUrl();
		
		Assert.assertEquals(actval,expval);
	}
	
	*/
}
