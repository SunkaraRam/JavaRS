package xpath;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class wisdon {

	public static void main(String[] args) throws InterruptedException, Throwable {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.get("https://www.wisdomjobsgulf.com");
		
		driver.findElement(By.xpath("//a[@class='btn btn-danger no-radius btn-lg btn-block gf-reg hidden-xs']")).click();
				
		driver.findElement(By.xpath("//input[@id='username']")).sendKeys("SwapnaBolnedi");

		driver.findElement(By.xpath("//input[@id='emailid']")).sendKeys("bolnediswapna01@gmail.com"); 
		
		driver.findElement(By.xpath("//input[@id='pwd']")).sendKeys("Swapna@77889");
		
											//Select Nationality
		
		driver.findElement(By.xpath("//span[contains(text(),'Select Nationality')]")).click();	
		
		driver.findElement(By.xpath("//div[@id='nationality_chosen']//input")).click();
		
		List<WebElement> nation = driver.findElements(By.xpath("//div[@id='nationality_chosen']//ul//li"));
		
		for (int i = 0; i < nation.size(); i++) {
			
			if (nation.get(i).getText().equalsIgnoreCase("Algeria".toLowerCase())) {
				
				nation.get(i).click();
				
			}
			
		}
		
											//Select Current Country
		
		driver.findElement(By.xpath("//div[@id='current_country_chosen']//span[contains(text(),'Select Country')]")).click();
		
		driver.findElement(By.xpath("//div[@id='current_country_chosen']//input")).click();
		
		List<WebElement> cc = driver.findElements(By.xpath("//div[@id='current_country_chosen']//ul//li"));
		
		for (int i = 0; i < cc.size(); i++) {
			
			if (cc.get(i).getText().toLowerCase().equalsIgnoreCase("Ecuador".toLowerCase())) {
					
					cc.get(i).click();
			}
		}
		
											//Select Current Location
		
		driver.findElement(By.xpath("//span[contains(text(),'Select Current Location')]")).click();
		
		driver.findElement(By.xpath("//div[@id='current_location_chosen']//input")).click();

		List<WebElement> clc = driver.findElements(By.xpath("//div[@id='current_location_chosen']//div//ul[@class='chosen-results']//li"));
		
		System.out.println(clc.size());
		
		for (int i = 0; i < clc.size(); i++) {
			
			if (clc.get(i).getText().toLowerCase().equalsIgnoreCase("China".toLowerCase())) {
				
				clc.get(i).click();
				break;
				
			}
			
		}

											//Selecting Preferred Country
		
		driver.findElement(By.xpath("//div[@id='job_country_chosen']//span[contains(text(),'Select Country')]")).click();
		
		driver.findElement(By.xpath("//div[@id='job_country_chosen']//input")).click();
		
		List<WebElement> prefcountry = driver.findElements(By.xpath("//div[@id='job_country_chosen']//div[@class='chosen-drop']//ul//li"));	
		
		for (int i = 0;  i<= prefcountry.size(); i++) {
			
			if (prefcountry.get(i).getText().toLowerCase().equalsIgnoreCase("Bermuda".toLowerCase())) {
				
				prefcountry.get(i).click();
				break;
			}
			
			
		}
		
											//Selecting Preferred Location
		
		driver.findElement(By.xpath("//ul[@class='chosen-choices']")).click();
		
		List<WebElement> prefcntr = driver.findElements(By.xpath("//div[@id='job_location_chosen']//div//ul//li"));
		
		ArrayList<String> name = new ArrayList<String>();
		
		name.add("Bahrain");
		
		name.add("Jordan");
		
		name.add("Indonesia");
		
		System.out.println(name.size());
		
		System.out.println(name.size());
		
		for (int i = 0; i < prefcntr.size(); i++) {
						
			for (int j = 0; j < name.size(); j++) {
				
				if (prefcntr.get(i).getText().toLowerCase().equalsIgnoreCase(name.get(j).toLowerCase())) {
					
					prefcntr.get(i).click();	
					
				}
			
				
			}
			
			
		}
		
								//Scrolling WebPage down
		
		WebElement lastele = driver.findElement(By.xpath("//div[contains(text(),'Job Alerts')]"));
		
		JavascriptExecutor js = ((JavascriptExecutor)driver);
		
		js.executeScript("arguments[0].scrollIntoView()", lastele);
		
		
		//Entering Mobile Number
		
		driver.findElement(By.xpath("//div[@class='selected-dial-code']")).click();
		
		List<WebElement> dlc = driver.findElements(By.xpath("/html[1]/body[1]/section[2]/div[1]/form[1]/div[11]/div[1]/div[1]/div[1]/ul[1]/li"));
		
		for (int i = 0; i < dlc.size(); i++) {
		
			if (dlc.get(i).getText().toLowerCase().equalsIgnoreCase("Åland Islands+358".toLowerCase())) {
				
				dlc.get(i).click();
				
				driver.findElement(By.xpath("//input[@id='mobileno']")).sendKeys("897456218");
				
					break;
			}
		
			
		}
		
		//Select Total Experience  Year
		
		driver.findElement(By.xpath("//a[@class='chosen-single']//span[contains(text(),'Select Year')]")).click();
		
		driver.findElement(By.xpath("//div[@id='expyear_chosen']//input")).click();
		
		List<WebElement> year = driver.findElements(By.xpath("//div[@id='expyear_chosen']//ul//li"));
		
		for (int i = 1; i < year.size(); i++) {
			
			if (year.get(i).getText().equalsIgnoreCase("03")) {
				
				year.get(i).click();
			}

		}
		
		//Select Month
		

		driver.findElement(By.xpath("//a[@class='chosen-single']//span[contains(text(),'00')]")).click();
		
		driver.findElement(By.xpath("//div[@id='expmonth_chosen']//input")).click();
		
		List<WebElement> month = driver.findElements(By.xpath("//div[@id='expmonth_chosen']//ul//li"));
		
		for (int i = 1; i < month.size(); i++) {
			
			if (month.get(i).getText().equalsIgnoreCase("04")) {
				
				month.get(i).click();
			}

		}
		
		// Entering Key Skills
		
		driver.findElement(By.xpath("//input[@id='keyskills']")).sendKeys("PHP, Java, SQL, Selenium, Manual Testing, HTML, CSS, Python");
		
		driver.findElement(By.xpath("//input[@id='keyskills']")).sendKeys(Keys.ENTER);
		
		
		//click on Browser
		
		driver.findElement(By.xpath("//input[@id='upload_cv']")).click();
		
		Runtime.getRuntime().exec("D:\\org\\wait.exe");
		
		//driver.findElement(By.xpath("//input[@id='regsubmit']")).click();
	}

}
