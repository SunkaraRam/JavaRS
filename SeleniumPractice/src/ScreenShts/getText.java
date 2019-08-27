package ScreenShts;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class getText {

	public static void main(String[] args) {
	
		try {
			
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.manage().window().maximize();
		
		String text = driver.findElement(By.id("gb_70")).getText();
		
		System.out.println(text);
		
		//driver.navigate().to(driver.getCurrentUrl());
		
		//driver.get(driver.getCurrentUrl());
		
		//driver.navigate().refresh();
	
		} catch (Exception e) {
			
			System.out.println("Internet is Not Available");
			
		}
		
		}

}
