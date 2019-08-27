package applicationLaunch;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class PrimusbankHomepage {

	public static WebDriver driver;
	

	public static void launchApp(String url) {
		
		System.setProperty("webdriver.gecko.driver", "e://geckodriver.exe");
		
		driver = new FirefoxDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get(url);

	}
	
	public boolean adminLogin(String uid, String pwd)
	{
		String expurl,acturl;
		
		expurl = "adminflow";
		
		driver.findElement(By.id("txtuId")).sendKeys(uid);
		
		driver.findElement(By.id("txtPword")).sendKeys(pwd);
		
		driver.findElement(By.id("login")).click();
		
		acturl = driver.getCurrentUrl();
		
		if (acturl.toLowerCase().contains(expurl.toLowerCase())) 
		{
		
			return true;
			
		}
		else 
		{

			return false;
			
		}
		
	}
	
	
}
