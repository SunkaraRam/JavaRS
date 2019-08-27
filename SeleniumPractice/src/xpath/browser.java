package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class browser {

	public static void main(String[] args) throws InterruptedException {
		
	System.setProperty("webdriverchrome.driver", "d://ChromeDriver.exe");
	
	WebDriver driver = new ChromeDriver();
	
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	
	driver.get("http://google.com");
	
	//driver.get("http://google.com");//Working
	
	//driver.navigate().refresh();//Working
	
	Thread.sleep(5000);

	
	driver.get("http://google.com");
	
	//driver.get(driver.getCurrentUrl());

	//driver.navigate().to("http://google.com");//Working
	
	//driver.navigate().to(driver.getCurrentUrl());//Working
	
	
	}
}