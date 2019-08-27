

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class PrimusDropd {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://primusbank.qedgetech.com");
		
		Select clist = new Select(driver.findElement(By.id("drlist")));
		
		List<WebElement> cnumlist = clist.getOptions();
		
		int cnumberlist = clist.getOptions().size();
		
		System.out.println(cnumberlist);
		
		String exp = "ram";
		
		boolean brlist= false;
		
		for (int i = 0; i < cnumberlist; i++) {
			
				String actval = cnumlist.get(i).getText();
				
				if (actval.equalsIgnoreCase(exp)) 
				{
					brlist= true;
					
					break;
					
				}
			
		}
		
		if (brlist) {
			
			System.out.println(exp + " is Available in the Dropdown List");
			
		} else {
			System.out.println(exp + " is not Available in the Dropdown List");
		}
		
		driver.quit();
		
		
		

	}

}
