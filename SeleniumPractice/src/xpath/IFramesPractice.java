package xpath;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;

public class IFramesPractice {

	public static WebDriver driver;
	
	public static void main(String[] args) {
		
		    driver = new FirefoxDriver(); //navigates to the Browser
	   
		   driver.get("http://demo.guru99.com/test/guru99home/"); 
		   
		   driver=new ChromeDriver();
		   
		   //navigates to the page consisting an iframe
 
	       driver.manage().window().maximize();
	       
	       List<WebElement> list = driver.findElements(By.tagName("iframe"));
	       
	       System.out.println(list.size());	       
	       
	       driver.switchTo().frame("a077aa5e"); //switching the frame by ID

		   System.out.println("********We are switch to the iframe*******");
     		
		   driver.findElement(By.xpath("html/body/a/img")).click();

		   //Clicks the iframe
       
  			System.out.println("*********We are done***************");
  			
//  			driver.switchTo().frame(2);
//  			
//  			driver.switchTo().parentFrame();
//  			
//  			driver.switchTo().defaultContent();
	}

}
