package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://spicejet.com/");
		
		WebElement chkbox = driver.findElement(By.id("ctl00_mainContent_chk_StudentDiscount"));
		
		if (!chkbox.isSelected()) {
			
			chkbox.click();
			
		}
		
		
		

	}

}
