package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.yaml.snakeyaml.tokens.Token.ID;

public class PrimusPopUp {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.id("login")).click();
		
		String msg = driver.switchTo().alert().getText();
		
		System.out.println(msg);
		
		if (msg.contains("Passw")) {
			
			driver.switchTo().alert().accept();
			
		}
		
		else {
			
			driver.switchTo().alert().dismiss();
		}
	}

}
