package workwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import ScreenShts.getText;

public class FBLinks {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("http://flipkart.com");
		
		driver.findElement(By.xpath("/html/body/div[2]/div/div/button")).click();
	
		driver.close();
		
	
	
	
	
	}

}