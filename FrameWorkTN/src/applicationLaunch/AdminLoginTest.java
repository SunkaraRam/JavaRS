package applicationLaunch;

import org.testng.annotations.Test;

public class AdminLoginTest {

	@Test
	public static void main(String[] args) {
		
		PrimusbankHomepage phome =  new PrimusbankHomepage();
		
		phome.launchApp("http://primusbank.qedgetech.com");
		
		boolean res = phome.adminLogin("Admin", "Admin");
		
		if (res) {
			
			System.out.println("Admin Login Test Pass");
		
	
			
		} else {
			
			System.out.println("Admin Login Test Fail");
		}
	
				
		
		
		
		
	}

}
