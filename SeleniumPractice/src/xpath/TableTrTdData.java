package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TableTrTdData {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.chrome.driver", "e://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http:/primusbank.qedgetech.com");
		
		driver.findElement(By.id("txtuId")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPword")).sendKeys("Admin");
		
		driver.findElement(By.id("login")).click();
		
		driver.findElement(By.xpath("//img[@src='images/emp_btn.jpg']")).click();
		
		WebElement emptable;
		
		emptable=driver.findElement(By.id("DGBanker"));
		
		List<WebElement> rows,cols;
		
		rows = emptable.findElements(By.tagName("tr"));

		System.out.println(rows.size());
		
		try {
		
		for (int i = 1; i < rows.size(); i++) 
		{
			cols = rows.get(i).findElements(By.tagName("td"));
			
			String empno = cols.get(0).getText();
			
			String empname = cols.get(1).getText();
			
			System.out.println(empno +"  " + empname);
			
		}
		
		}
		
		catch (Exception e) {
			System.out.println("No Data Available in This Page Go to Next Page, TestPass");
		}
		
		
		
	}

}
