package xpath;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileUpload {

	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		
		driver.get("http://accedesoftwaresolutions.com/career.html");
		
		driver.findElement(By.name("fil")).sendKeys("E:\\t.txt");;

	}

}
