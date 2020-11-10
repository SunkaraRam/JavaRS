package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.UnexpectedAlertBehaviour;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.CapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.yaml.snakeyaml.tokens.Token.ID;

public class PrimusPopUp {

	public static void main(String[] args) throws InterruptedException {
		
		DesiredCapabilities dc = DesiredCapabilities.chrome();
		
		dc.setCapability(CapabilityType.UNEXPECTED_ALERT_BEHAVIOUR, UnexpectedAlertBehaviour.ACCEPT);
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("http://primusbank.qedgetech.com");
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");;
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");;
		
		Actions act = new Actions(driver);
		
		act.sendKeys(Keys.ENTER).build().perform();
		
	}

}
