package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class TableTr {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();

		driver.get("https://money.rediff.com/tools/forex");
		
		WebElement curtable;
		
		curtable=driver.findElement(By.className("dataTable"));
		
		List<WebElement> rows = curtable.findElements(By.tagName("tr"));
		
		System.out.println(rows.size()-1);
		
	}

}
