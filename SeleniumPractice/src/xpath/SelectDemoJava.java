package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.ExecuteScript;
import org.openqa.selenium.support.ui.Select;

public class SelectDemoJava {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		
//		driver.get("file:///D:/selectdemo.htm");
//		
//		//driver.findElement(By.id("same")).sendKeys("RamSunkara");
//		
//		List<WebElement> lw = driver.findElements(By.id("same"));
//	
//		lw.get(1).sendKeys("SunkaraRamu");
		
//		System.out.println(lw.size());
//		
//		for (int i = 0; i < lw.size(); i++) {  
//			
//			lw.get(i=1).sendKeys("RamSunkara");
//			
//		}
		
	//	driver.findElement(By.id("designation")).sendKeys("CEO");
		
//		Select s = new Select(driver.findElement(By.id("designation")));
//		
//		s.selectByVisibleText("CEO");
		
		driver.get("http://primusbank.qedgetech.com/");
		
		WebElement wl = driver.findElement(By.id("drlist"));
		
		List<WebElement> opt =wl.findElements(By.xpath("//span[@class='bodytext style11']//option"));

		for (WebElement ok : opt) {
			
			if ("Erragadda".equalsIgnoreCase(ok.getText())) {
				
				ok.click();
				
				System.out.println(ok.getText());
				
				break;
				
				
			}
		}
		
		((JavascriptExecutor)driver).executeScript("document.getElementById('txtuId').value='RamSunkara';");
		
	}

}
