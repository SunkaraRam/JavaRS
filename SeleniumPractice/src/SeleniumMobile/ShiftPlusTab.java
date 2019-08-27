package SeleniumMobile;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ShiftPlusTab {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		
		WebElement username = driver.findElement(By.id("email"));
		
		//Call Element highlighter method
		
		highLightElement(driver, username);
			
		
		
	}
	
	// Element highlighter method
	
	public static void highLightElement(WebDriver driver,WebElement element) {
		
		JavascriptExecutor js=(JavascriptExecutor)driver;
		
		js.executeScript("argument[0].setAttribute('style','background:yellow; border: 56px solid red')", element);
		
		try {
			
			Thread.sleep(1000);
			
		} catch (InterruptedException e) {
			
			System.out.println(e.getMessage());
		}
		
		js.executeScript("arguments[0].setAttribute('style','border: 2px solid red')", element);
	}
	

}
