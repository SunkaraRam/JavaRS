package applicationLaunch;

import org.testng.annotations.Test;

public class LoginDDT {

	@Test(dataProvider="loginData")
	public void login(String uid, String pwd) 
	{
		
		System.out.println(uid+ " " + pwd);
		
	}
	
	public Object[][] loginData()
	{
	
		Object[][] data = new Object[3][2];
		
		data[0][0] = "uid1";
		
		data[0][1] = "pwd1";
		
		data[1][0] = "uid2";
		
		data[1][1] = "pwd2";
	
		data[2][0] = "uid3";
		
		data[2][1] = "pwd3";
					
		return data;
	}

}
