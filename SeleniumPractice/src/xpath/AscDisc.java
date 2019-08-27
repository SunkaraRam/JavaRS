package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class AscDisc {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "e://ChromeDriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		
		driver.get("http://primusbank.qedgetech.com");
		
		Select dlist = new Select(driver.findElement(By.id("drlist")));
		
		List<WebElement> namelist = dlist.getOptions();
		
		//System.out.println(namelist.size());
		
		boolean aim = false;
		
		for (int i = 1 ; i < namelist.size(); i++) {
			
			String str1 = namelist.get(i-1).getText();
			
			String str2 = namelist.get(i).getText();
			
			if (str2.compareToIgnoreCase(str1)<0) {
				
				aim =  true;
				
				break;
				
			}
			//System.out.println(names);
			
		}
		
		if (aim) {
			
			System.out.println("Values are in Ordere, TestPass");
			
		} else {

			System.out.println("Values are not in Ordere, TestFail");
		}
		/*
		
		driver.get("http://primusbank.qedgetech.com");
		
		Select list = new Select(driver.findElement(By.id("drlist")));
		
		List<WebElement> dlist = list.getOptions();
		
		
		
		String expval = "Ameerpet";
		
		boolean ram = false;
		
		for (int i = 1; i < dlist.size(); i++) {
			
			String actval = dlist.get(i).getText();
			
			if (expval.equalsIgnoreCase(actval)) {
				
				ram = true;
				
				break;
				
			}
			
		}
		
		if (ram) {
			
			System.out.println("TestPass");
			
		} else {
			
			System.out.println("TestFail");

		}
		
		*/
		
		// Own HTML file
		
		/*
		driver.get("E://JavaRS/select.html");
		
		Select list = new Select(driver.findElement(By.id("car")));
		
		List<WebElement> dlist = list.getOptions();
		
		boolean ordered = true;
		
		for (int i = 1; i < dlist.size(); i++) {
			
			String str1 = dlist.get(i-1).getText();
			
			String str2 = dlist.get(i).getText();
			
			if (str2.compareToIgnoreCase(str1)<0) {
				
				ordered = false;
				
				break;
				
			}
			
		}
		
		if (ordered) {
			
			System.out.println("Values are in order, Test Pass");
			
		} else {
	
			System.out.println("Values are not in order, Test Fail");

		}
	
		*/
		
	}

}
