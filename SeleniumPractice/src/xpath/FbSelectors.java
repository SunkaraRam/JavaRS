package xpath;

import java.sql.Driver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;
import org.openqa.selenium.support.ui.Select;

public class FbSelectors {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "e://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver(); 
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://facebook.com");
		
		driver.findElement(By.xpath("//*[@id='u_0_j']")).sendKeys("Sunkara");

		driver.findElement(By.id("u_0_l")).sendKeys("Ramu");	
		
		driver.findElement(By.id("u_0_o")).sendKeys("8142417264");
		
		driver.findElement(By.id("u_0_v")).sendKeys("sai8142417264");
		
				
		Select dlist= new Select(driver.findElement(By.id("day")));
		
		dlist.selectByIndex(1);
		
		Select mlist = new Select(driver.findElement(By.id("month")));
		
		mlist.selectByVisibleText("Mar");
		
		Select ylist = new Select(driver.findElement(By.id("year")));
		
		ylist.selectByVisibleText("1995");
		
		driver.findElement(By.id("u_0_a")).click();
		
		driver.findElement(By.id("u_0_11")).click();
		/*
		
		Select dlist = new Select(driver.findElement(By.id("day")));
		
		dlist.selectByIndex(1);
		
		WebElement melement;
		
		melement = driver.findElement(By.id("month"));
		
		Select mlist = new Select(melement);
		
		mlist.selectByIndex(5);
		
		WebElement yelement;
		
		yelement = driver.findElement(By.id("year"));
		
		Select ylist = new Select(yelement);
		
		ylist.selectByVisibleText("1995");		
		
		driver.findElement(By.id("u_0_a")).click();
		
		driver.findElement(By.id("u_0_11")).click();
		
		*/

	}

}
