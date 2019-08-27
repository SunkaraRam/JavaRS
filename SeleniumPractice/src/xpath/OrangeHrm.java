package xpath;

import java.awt.AWTException;
import java.awt.Robot;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import net.bytebuddy.asm.Advice.Argument;

public class OrangeHrm {

	public static void main(String[] args) throws Throwable {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		
		//WebElement al = driver.findElement(By.id("btnLogin"));
		
		//driver.findElement(By.id("btnLogin")).click();//method 1
		
		Actions ac = new Actions(driver);//method 2
		
		ac.sendKeys(Keys.ENTER).build().perform();
		
//		((JavascriptExecutor)driver).executeScript("arguments[0].click()",al);//method3
////		Robot robot = new Robot();
////		 
////		System.out.println(robot.get);
//		
//		try 
//		{
//			if (driver.findElement(By.partialLinkText("Welcome")).isDisplayed()) 
//			{
//				
//				System.out.println("TestPass");
//			} 	
//		} catch (Exception e) 
//		{
//			System.out.println("TestFail");
//		}

	}

}
