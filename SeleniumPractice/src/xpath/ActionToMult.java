package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;


public class ActionToMult {

	public static void main(String[] args) {
		
		
		//driver.get("https://www.infosys.com/");
		
//		Actions act = new Actions(driver);
//		
//		act.moveToElement(driver.findElement(By.xpath("//div/div/div/div/nav/ul/li[1]/a/span"))).build().perform();
//		
//		//act.build().perform();
//		
//		act.moveToElement(driver.findElement(By.xpath("//div/div/div/div/nav/ul/li[3]"))).build().perform();
//		
//		//act.build().perform();
//		
//		/*
//		
//		driver.findElement(By.xpath("//div/div/div/div/nav/ul/li[1]/a/span")).click();
//		
//		driver.findElement(By.xpath("//div/div/div/div/nav/ul/li[3]")).click();
//		
//		*/
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		String baseUrl = "http://www.facebook.com/"; 
			WebDriver driver = new ChromeDriver();

			driver.get(baseUrl);
			driver.get(baseUrl);
			WebElement txtUsername = driver.findElement(By.id("email"));

			Actions builder = new Actions(driver);//org.openqa.selenium.interactions.Action
			 Action seriesOfActions = builder.moveToElement(txtUsername)
				.click().keyDown(txtUsername, Keys.SHIFT)
				.sendKeys(txtUsername, "hello")
				.keyUp(txtUsername, Keys.SHIFT)
				.doubleClick(txtUsername)
				.contextClick()
				.build();
				
			seriesOfActions.perform() ;
			}
	

}
