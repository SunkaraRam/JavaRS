 package autoIT;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.GetAlertText;

public class WindowIDs {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "D://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://gmail.com");
		
		driver.findElement(By.linkText("Help")).click();
		
		
		/*
		String currentwin = driver.getWindowHandle();
		
		System.out.println(currentwin);
		
		Set<String> allwindows = driver.getWindowHandles();
		
		System.out.println(allwindows);
		
		Object[] winobj = allwindows.toArray();
		
		String winid1 = winobj[0].toString();
		
		String winid2 = winobj[1].toString();
		
		driver.switchTo().window(winid2);
		*/
		
		String winid = driver.getWindowHandle() ;
		
		System.out.println(winid);
		
		Set<String> allwindids = driver.getWindowHandles();
		
		System.out.println(allwindids);
		
		Object[] winds = allwindids.toArray();
		
		String wind1 = winds[0].toString();
		
		String wind2 = winds[1].toString();
		
		System.out.println("First windowID : "  + wind1 );
		
		System.out.println("Second windowID : " + wind2);
		
		
	}

}
