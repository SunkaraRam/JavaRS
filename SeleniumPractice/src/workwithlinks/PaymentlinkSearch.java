package workwithlinks;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PaymentlinkSearch {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.linkText("Site Map")).click();
		
		
		List<WebElement> link = driver.findElements(By.tagName("a"));
		 
		String exp = "loans"; 
		 
		boolean ram = false;
		
		for (int i = 0; i < link.size(); i++) {
			
			String act = link.get(i).getText();
			
			if (exp.equalsIgnoreCase(act)) {
				
				ram = true;
		
				break;
				
			}
			
		}
		
		if (ram) {
			
			System.out.println(exp + " is available in SiteMap page, TestPass");
		}
		else {
			
			System.out.println(exp + " is not available in SiteMap page, TestFail");
			
		}
		

	}

}


/*
Select link = new Select(driver.findElement(By.tagName("a")));

List<WebElement> list = link.getOptions();

System.out.println(link);
*/