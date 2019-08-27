package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.By.ByXPath;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Xpathselect {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.manage().deleteAllCookies();
		
		driver.get("https://redbus.in");
		
		driver.findElement(By.id("src")).sendKeys("hyd");

		driver.findElement(By.id("src")).click();
		
		Thread.sleep(5000);
		
		List<WebElement> cities = driver.findElements(By.xpath("/html/body/section/div[2]/main/section/div/div[2]/section/div/div[1]/div/ul/li"));
		
		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++){
			
			String cityname = cities.get(i).getText();
			
			System.out.println(cityname);
			
		}
		
		/*
		driver.manage().deleteAllCookies();
		
		driver.get("http://cleartrip.com");
		
		driver.findElement(By.id("FromTag")).sendKeys("hyd");
		
		driver.findElement(By.id("FromTag")).click();
		
		List<WebElement>   cities = driver.findElements(By.xpath("/html/body/ul[1]/li"));

		System.out.println(cities.size());
		
		for (int i = 0; i < cities.size(); i++) {
			
			String citynames = cities.get(i).getText();
			
			System.out.println(citynames);
			
		}
		
		*/
		

	}

}
