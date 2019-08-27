package ScreenShts;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;

public class DemoReport {

	public static void main(String[] args) {
		
			ExtentHtmlReporter path  = new ExtentHtmlReporter("d://Shailaja.html");

			ExtentReports report = new ExtentReports();
			
			report.attachReporter(path);
			
			ExtentTest logger = report.createTest("Verify Titles");
			
			System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");

			WebDriver driver = new ChromeDriver();
			
			logger.log(Status.INFO, "BrowserStarted");
			
			driver.get("http://www.google.com");
			
			logger.log(Status.INFO, "Application is Running");
			
			String title = driver.getTitle();
			
			if(title.equalsIgnoreCase("googl")) {
				
				logger.log(Status.PASS, "Title Matched" );
				
			}
			else {
				
				logger.log(Status.FAIL, "Title UnMatched");
			}
			
			report.flush();
			driver.close();
			
	}

}
