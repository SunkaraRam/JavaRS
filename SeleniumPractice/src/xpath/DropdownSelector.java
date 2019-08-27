package xpath;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DropdownSelector {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "e://geckodriver.exe");
		
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://abhibus.com");

	}

}
