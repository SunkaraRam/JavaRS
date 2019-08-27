package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElements 
{

	public static void main(String[] args) throws InterruptedException 
	{
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://facebook.com");
		
		List<WebElement> list = driver.findElements(By.tagName("a"));
		
		System.out.println(list.size());
	
		for (int i = 0; i < list.size(); i++) {
			
			String name = list.get(i).getText();
			
			System.out.println(name);
			
		}
		
	}

}