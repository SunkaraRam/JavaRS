package xpath;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AllCheckBoxes {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://www.echoecho.com/htmlforms09.htm");
		
		List<WebElement> box = driver.findElements(By.xpath("//input[@type='checkbox']"));

		
		for (int i = 1; i < box.size(); i++) {
			
			if (box.get(i).isSelected()) {
				
					box.get(i).click();
				
			}
			
			box.get(i).click();
			
		}
		
	}

}
