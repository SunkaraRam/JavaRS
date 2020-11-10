package xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.Select;

public class PrimusDropd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "d://latestdrivers//chromedriver.exe");
		
		DesiredCapabilities dc = new DesiredCapabilities();
		
		dc.setCapability("CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR", UnexpectedAlertBehaviour.DISMISS);
		
		ChromeOptions opt  = new ChromeOptions();
		
		opt.addArguments("incognito");
		
		opt.addArguments("start-maximized");
		
		WebDriver driver = new ChromeDriver(opt);
		
		driver.get("http://primusbank.qedgetech.com");
	
		try {
			
		driver.findElement(By.id("txtuId")).sendKeys("admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
		
		//driver.switchTo().alert().dismiss();
		
		} catch (Exception e) {
			
			driver.switchTo().alert().dismiss();
			
		}
//		Select clist = new Select(driver.findElement(By.id("drlist")));
//		
//		List<WebElement> cnumlist = clist.getOptions();
//		
//		int cnumberlist = clist.getOptions().size();
//		
//		System.out.println(cnumberlist);
//		
//		String exp = "ram";
//		
//		boolean brlist= false;
//		
//		for (int i = 0; i < cnumberlist; i++) {
//			
//				String actval = cnumlist.get(i).getText();
//				
//				if (actval.equalsIgnoreCase(exp)) 
//				{
//					brlist= true;
//					
//					break;
//					
//				}
//			
//		}
//		
//		if (brlist) {
//			
//			System.out.println(exp + " is Available in the Dropdown List");
//			
//		} else {
//			System.out.println(exp + " is not Available in the Dropdown List");
//		}
//		
//		driver.quit();
//		
		
		

	}

}
