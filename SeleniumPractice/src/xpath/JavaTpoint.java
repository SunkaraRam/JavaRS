package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class JavaTpoint {

	public static void main(String[] args) {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.javatpoint.com/");
		
		driver.findElement(By.xpath("//*[@id='link']/div/ul/li[3]/a")).click();
		
		List<WebElement> links = driver.findElements(By.tagName("a"));
		
		System.out.println(links.size());
		
		/*
		for (int i = 0; i < links.size(); i++) {
			
			String linknames = links.get(i).getText();
			
			System.out.println(linknames);
			
		}
		
				Java Date
			Java Conversion
			Java Collection
			Java JDBC
			Java New Features
			RMI
			Internationalization
			Interview Questions
		
		*/
		
		
		String expvalue = "Interview Questions";
		
		boolean flag = false;
		
		for (int i = 0; i < links.size(); i++) {
			
			String actvalue = links.get(i).getText();
			
			if (actvalue.equalsIgnoreCase(expvalue)) {
				
				flag = true;
				
				break;
				
			}
		}
			
			if (flag)
			{
				
				System.out.println(expvalue + "  Available in the Page");
				
			} else
			{
				System.out.println(expvalue + " not Available in the Page");
				
			}
			


		
	}

}
