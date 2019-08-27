package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.omg.CosNaming.NamingContextExtPackage.StringNameHelper;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Datefinding {


	public static void main(String[] args) throws InterruptedException {
		
		String appdate = "1/Mar/1995";
		
		String dt,month,year;
		
		String[] temp = appdate.split("/");
		
		dt = temp[0];
		
		month = temp[1];
		
		year = temp[2];
		
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver  driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.id("txtPassword")).sendKeys("Qedge123!@#");
		
		driver.findElement(By.id("btnLogin")).click();
		
		driver.findElement(By.id("menu_recruitment_viewRecruitmentModule")).click();
		
		driver.findElement(By.id("menu_recruitment_viewCandidates")).click();
		
		driver.findElement(By.id("candidateSearch_fromDate")).click();
		
		//Thread.sleep(2000);
		
		//driver.quit();
		
		WebElement melement;
		
		melement = driver.findElement(By.className("ui-datepicker-month"));
		
		Select mlist = new Select(melement);
		
		mlist.selectByVisibleText(month);
		
		WebElement yelement;
		
		yelement = driver.findElement(By.className("ui-datepicker-year"));
		
		Select ylist = new Select(yelement);
		
		ylist.selectByVisibleText(year);
		
		WebElement delement;
		
		delement = driver.findElement(By.className("ui-datepicker-calendar"));
	
		List<WebElement> rows,cols;
		
		rows = delement.findElements(By.tagName("tr"));
		
		boolean flag =false;
		
		for (int i = 1; i < rows.size(); i++) 
		{
			
				cols = rows.get(i).findElements(By.tagName("td"));
				
				for (int j = 0; j < cols.size(); j++) 
				{
					
					String date = cols.get(j).getText();
					
					if (dt.equals(date))
					{
					
						cols.get(j).click();
						
						flag = true;
						
						break;
						
					}
					
				}
				
			if (flag) {
				
				//break;
				
			}
				
						
		}
		

	}

}
