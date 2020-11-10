package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Selectdeselect {

	public static void main(String[] args) throws InterruptedException {
		
		
			System.setProperty("webdriver.chrome.driver", "e://ChromeDriver.exe");
			
			WebDriver driver = new ChromeDriver();
			
			driver.get("E://JavaRS/select.html");
			
			Select clist = new Select(driver.findElement(By.id("car")));
			
			clist.selectByIndex(0);
			
			clist.selectByValue("M");
			
			clist.selectByVisibleText("BMW");
			
			clist.deselectByIndex(0);
			
			clist.deselectByValue("M");
			
			clist.deselectByVisibleText("BMW");
			
			Thread.sleep(500000);
			
			
	}

}
