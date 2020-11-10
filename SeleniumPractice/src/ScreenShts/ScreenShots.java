package ScreenShts;


import java.io.File;
import java.io.IOException;


import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
//import org.apache.commons.io.FileUtils;

import com.google.common.io.Files;


public class ScreenShots {

	public static void main(String[] args) throws Throwable {
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://google.com");
//		
//		File src =  ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		
//		FileHandler.copy(src, new File("d://RS145.jpg"));
//		
		
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileHandler.copy(src,new File("d://screenshot.jpg"));
	
	}

}
