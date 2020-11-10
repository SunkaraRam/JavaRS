package xpath;

import java.util.concurrent.TimeUnit;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PracticeAll {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://ChromeDriver.exe");
		
		WebDriver driver =  new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://google.com");
		
		driver.findElement(By.linkText("Gmail")).click();
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL of the Page : " + url);
		
		String title = driver.getTitle();
		
		System.out.println("Title of the Page : " + title);
		
		String exp = "ram";
		
		if (title.toLowerCase().contains(exp.toLowerCase())) {
			
			System.out.println("TestPass");
		}
		
		else {
			System.out.println("TestFail");
		}
		
		/*
		//Getting data from marquee tag in Primusbank
		
		driver.get("http://primusbank.qedgetech.com");
		
		WebElement  marq;
		
		marq = driver.findElement(By.xpath("//*[@id='Table_01']/tbody/tr[2]/td/table/tbody/tr/td/marquee/font"));
		
		String marqee = marq.getText();
		
		System.out.println(marqee);
	
	*/
		
		
		/*
		driver.get("http://facebook.com");
		
		String act = driver.getTitle();
		
		System.out.println("Title of WebPage" + act);
		
		// For Accessing URL from Google 
		
		String url = driver.getCurrentUrl();
		
		System.out.println("URL of the WebPage" + url);
		
		// For Accessing Window ID
		
		String winID = driver.getWindowHandle();
		
		System.out.println(" Windows ID" + winID);
		
		//For Accessing Source of the WebApp
		
		*/
		
	}

}
