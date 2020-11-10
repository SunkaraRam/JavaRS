package xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HeightWeight {

	static int height,width;
	
	static WebElement box;
	
	public static void main(String[] args) {
		

		System.setProperty("webdriver.gecko.driver", "d://geckodriver.exe");
		
		WebDriver driver= new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		
		box = driver.findElement(By.id("email"));
		
		height = box.getSize().getHeight();
		
		width = box.getSize().getWidth();
		
		System.out.println("Height of the Box : " + height);
		
		System.out.println("Width of the Box : " + width);
		
		driver.quit();
	}

}
