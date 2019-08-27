package bn;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.GeckoDriverService;

public class DemoTest
{
	
	public static void main(String[]args)
	{
		System.setProperty("webdriver.chrome.driver", "e:\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://primusbank.qedgetech.com");
		driver.findElement(By.linkText("Site Map")).click();
		driver.findElement(By.linkText("Home")).click();
		driver.findElement(By.linkText("Demo")).click();
       		
			
		
	}
	
 
}
