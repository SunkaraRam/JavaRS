package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectUrlPrintD {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "e://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.linkText("Site Map"));
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			
			String  lname = links.get(i).getText();
			
			links.get(i).click();
			
			String urlC= driver.getCurrentUrl();
			
			System.out.println(lname +"  " + urlC) ;
			
			Thread.sleep(2000);
			
			links = driver.findElements(By.tagName("a"));
		}

	}

}
