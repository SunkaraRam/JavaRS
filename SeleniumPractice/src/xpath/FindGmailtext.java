package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindGmailtext {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://ChromeDriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String exp,act;
		exp = "gmail";
		
		act = driver.getTitle();
		
		if(act.toLowerCase().contains(exp.toLowerCase())){
			
			
			System.out.println("TestPass");
		}
		else {
			System.out.println("TestFail");
		}
		

	}

}
