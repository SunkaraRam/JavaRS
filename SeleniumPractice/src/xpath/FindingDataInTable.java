package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindingDataInTable {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://money.rediff.com/tools/forex&quot");
		
		WebElement curtable;
		
		curtable = driver.findElement(By.className("dataTable"));
		
		List<WebElement> cols,rows;
		
		rows = curtable.findElements(By.tagName("tr"));
		
		String expvalue = "GlaxoSmithKlineConsu";
		
		boolean  sree = false;
		
		for (int i = 1; i < rows.size(); i++) {
			
			cols = rows.get(i).findElements(By.tagName("td"));
			
			for (int j = 1; j < cols.size(); j++) {
				
				String actvalue = cols.get(0).getText();
				
				//System.out.println(actvalue);
				
				if (actvalue.equalsIgnoreCase(expvalue)) {
					
					sree = true;
					
					break;
					
				}	
			}
		}
		
		if (sree) {
			
			System.out.println(expvalue + "Available in the table");
			
		} else {
			
			System.out.println(expvalue + " not Available in the table");

		}
			
	}
			
			
		}
	

		
		

	


