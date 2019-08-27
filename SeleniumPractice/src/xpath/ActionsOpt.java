package xpath;




import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsOpt {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://snapdeal.com");
		
	    Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//div[1]/div[2]/ul/li[2]/a/span[2]")));
		
		act.build().perform();
		
		act.contextClick(driver.findElement(By.linkText("iKall")));
		
		act.build().perform();
		
		
		
		
		
		

	}

}
