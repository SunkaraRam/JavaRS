 package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.log4testng.Logger;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;



public class ClearTripdatPicker1 {
	
	public static void main(String[] args) {
		
		ExtentHtmlReporter path = new ExtentHtmlReporter("d://Schools.html");
		
		ExtentReports report = new ExtentReports();

		ExtentTest logger;
		
		report.attachReporter(path);
		
		logger=report.createTest("Verify Data Picker");
		
		String dob = "1/March/2020";
		
		String date,month,year;
		
		String[] temp = dob.split("/");
		
		date = temp[0];
		
		month = temp[1];
		
		year = temp[2];
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		logger.log(Status.INFO, "ChromeDriver Launched");
		
		driver.manage().timeouts().implicitlyWait(200, TimeUnit.SECONDS);
		
		
		driver.get("http://cleartrip.com");
		
		logger.log(Status.INFO, "Application Lauched"+driver.getCurrentUrl());
		
		driver.findElement(By.id("DepartDate")).click();
		
		String calyear,calmonth,caldate;
		
		calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
		
		while (!calyear.equals(year))
			{
			
			 driver.findElement(By.className("nextMonth")).click();
			 
			 //driver.findElement(By.className("prevMonth")).click();
			
			 calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
			}
		
		logger.log(Status.PASS, "Year Selected ::" + calyear);
		
		calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
		
		while (!calmonth.equalsIgnoreCase(month)) 
			{
			
			 driver.findElement(By.className("nextMonth")).click();
			 
			 //driver.findElement(By.className("prevMonth")).click();
			
			 calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
			 
			}
		
		logger.log(Status.PASS, "Month Selected ::" + calmonth);
		
		WebElement table;
		
		table = driver.findElement(By.className("calendar"));
		
		List<WebElement> rows,cols;
		
		rows = table.findElements(By.tagName("tr"));
		
		boolean flag = false;
		
		for (int i = 1; i < rows.size(); i++) 
		{
			
			cols =rows.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < cols.size(); j++) 
			
			{
				caldate = cols.get(j).getText();
				
				if (date.equals(caldate)) {
					
					cols.get(j).click();
					
					logger.log(Status.PASS, "Date Selected :: "+ caldate);
					
					flag = true;
					
					
					
					break;
			}
				
		}
			
			if (flag) {
				
				break;
			}
	}

	report.flush();
	
	driver.close();
}
	
	
	
	
	
}