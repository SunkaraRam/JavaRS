package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedirectUrlPrint {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.linkText("Site Map"));
		
		List<WebElement>  links =driver.findElements(By.tagName("a"));
		
		for (int i = 0; i < links.size(); i++) {
			
			String linkname = links.get(i).getText();
			
			String linkAtt = links.get(i).getAttribute("href");
			
			System.out.println(linkname +"  "+ linkAtt);
			
		}

		
		
		
	}

}
