 package xpath;

import java.util.List;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;



public class CleartripDatePic {


	public static void main(String[] args) {

		
		String dob="21/Mar/1995";
		
		String dt,mn,yr;
		
		String[] temp= dob.split("/");
		
		dt = temp[0];
		
		mn = temp[1];
		
		yr = temp[2];
		
		System.out.println(dt + mn+ yr);
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().deleteAllCookies();
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		
		driver.get("http://orangehrm.qedgetech.com");
		
		driver.findElement(By.cssSelector("#txtUsername")).sendKeys("Admin");
		
		driver.findElement(By.cssSelector("#txtPassword")).sendKeys("Qedge123!@#");
		
		driver.findElement(By.cssSelector("#btnLogin")).click();
		
		Actions act = new Actions(driver);
		
		act.moveToElement(driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")));
		
		act.build().perform();
		
		driver.findElement(By.xpath("//b[contains(text(),'Recruitment')]")).click();
		
		driver.findElement(By.xpath("//a[@id='menu_recruitment_viewCandidates']")).click();
		
		driver.findElement(By.id("candidateSearch_fromDate")).click();
		
		Select mlist = new Select(driver.findElement(By.className("ui-datepicker-month")));
		
		mlist.selectByVisibleText(mn);
		
		Select ylist = new Select(driver.findElement(By.className("ui-datepicker-year")));
		
		ylist.selectByVisibleText(yr);
		
		WebElement cal = driver.findElement(By.className("ui-datepicker-calendar"));
		
		List<WebElement> rows,cols;
		
		boolean flag = false;
		rows = cal.findElements(By.tagName("tr"));
		
		for (int i = 0; i < rows.size(); i++) {
			
			cols = rows.get(i).findElements(By.tagName("td"));
			
			for (int j = 0; j < cols.size(); j++) {
				
				String data = cols.get(j).getText();
				
				if (dt.equals(data)) {
					
					cols.get(j).click();
					
					flag= true;
					break;
					
				}
				
				
			}
			
			
			
		}
		
		
		
		

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

//		String dob = "1/March/2020";
//		
//		String date,month,year;
//		
//		String[] temp = dob.split("/");
//		
//		date = temp[0];
//		
//		month = temp[1];
//		
//		year = temp[2];
//		
//		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
//		
//		WebDriver driver = new ChromeDriver();
//		
//		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
//		
//		driver.get("http://cleartrip.com");
//		
//		driver.findElement(By.id("DepartDate")).click();
//		
//		String calyear,calmonth,caldate;
//		
//		calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
//		
//		while (!calyear.equals(year))
//			{
//			
//			 driver.findElement(By.className("nextMonth")).click();
//			 
//			 //driver.findElement(By.className("prevMonth")).click();
//			
//			 calyear = driver.findElement(By.className("ui-datepicker-year")).getText();
//		
//			}
//		
//		calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
//		
//		while (!calmonth.equalsIgnoreCase(month)) 
//			{
//			
//			 driver.findElement(By.className("nextMonth")).click();
//			 
//			 //driver.findElement(By.className("prevMonth")).click();
//			
//			 calmonth = driver.findElement(By.className("ui-datepicker-month")).getText();
//			 
//			}
//		
//		WebElement table;
//		
//		table = driver.findElement(By.className("calendar"));
//		
//		List<WebElement> rows,cols;
//		
//		rows = table.findElements(By.tagName("tr"));
//		
//		boolean flag = false;
//		
//		for (int i = 1; i < rows.size(); i++) 
//		{
//			
//			cols =rows.get(i).findElements(By.tagName("td"));
//			
//			for (int j = 0; j < cols.size(); j++) 
//			
//			{
//				caldate = cols.get(j).getText();
//				
//				if (date.equals(caldate)) {
//					
//					cols.get(j).click();
//					
//					flag = true;
//					
//					break;
//			}
//				
//		}
//			
//			if (flag) {
//				
//				break;
//			}
//	}
//
}
	
}