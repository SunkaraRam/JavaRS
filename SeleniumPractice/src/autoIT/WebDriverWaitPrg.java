package autoIT;

import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.By.ById;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;



public class WebDriverWaitPrg {

	

	public static void main(String[] args) throws InterruptedException, IOException {
		
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(25, TimeUnit.SECONDS);
		
		driver.manage().deleteAllCookies();
		
		driver.get("http://gmail.com");
		
		String windid = driver.getWindowHandle();
		
		System.out.println(windid);
			
		driver.findElement(By.id("identifierId")).sendKeys("sunkararam1144@gmail.com");
	
		driver.findElement(By.id("identifierNext")).click();
		
		driver.findElement(By.name("password")).sendKeys("8897411361");;
		
		driver.findElement(By.id("passwordNext")).click();
		
		driver.findElement(By.xpath("//div[3]/div/div[2]/div[1]/div[1]/div[1]/div[2]/div/div/div/div[1]/div/div")).click();
		
		driver.findElement(By.id(":oj"));
		
		driver.findElement(By.id(":om")).click();
		
		driver.findElement(By.id(":om")).sendKeys("sunkararam1166@gmail.com");
		
		//driver.findElement(By.id(":o2")).sendKeys("This Message Automatically send by RS");
		
		Runtime.getRuntime().exec("D:\\JavaRS\\Enter.exe");
		
		driver.findElement(By.xpath("/html/body/div[7]/div[3]/div/div[1]/div[4]/header/div[2]/div[2]/div")).click();
		
		driver.findElement(By.id(":pm")).click();
		
		Runtime.getRuntime().exec("D:\\JavaRS\\filepath4.exe");
		
		driver.findElement(By.id(":nu")).click();
		
		
		/*
		 //Same ids not in change
		Set<String> allwindowids = driver.getWindowHandles();
		
		System.out.println(allwindowids);
		
		*/
		
		
		//Thread.sleep(60000);		
		
		
		// For Logout from gmail
		
		/*
		driver.findElement(By.xpath("//div[2]/div[3]/div/div[2]/div/a/span")).click();
		
		driver.findElement(By.id("gb_71")).click();
		
		*/
		
	
	}

}
