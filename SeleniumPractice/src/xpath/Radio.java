package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radio {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		
		WebElement ram;
		
		ram = driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_0"));
		
		if (!ram.isSelected()) {
			
			System.out.println("TestPass");
			
		} 
		
	}

}
