package xpath;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class WindowsHandle {
	@Test
	public void TestPopUp() {
		
		System.setProperty("webdriver.chrome.driver","d://chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
	
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
				
		driver.get("http://www.gmail.com");
		
		String parent = driver.getWindowHandle();
		
		driver.findElement(By.xpath("//a[contains(text(),'Help')]")).click();

		driver.switchTo().window(parent);
		
		driver.findElement(By.xpath("//a[contains(text(),'Terms')]")).click();
		
		Set<String> s1= driver.getWindowHandles();
		
		//s1= driver.getWindowHandles();

		System.out.println(s1.size());
		
		int count =0;
		
		for (String s2: s1) {
			
			driver.switchTo().window(s2);
			
			if (count==2) {
				
				driver.switchTo().window(s2);
				
				driver.close();
				
				break;
			}
			
			
			
			count++;
			
		}
		
		
		
		
		
//		Iterator<String> i1 = s1.iterator();
//		
//		while (i1.hasNext()) {
//			
//			String childwin = i1.next();
//			
//			if (!parent.equals(childwin)) {
//				
//				driver.switchTo().window(childwin);
//			
//				//driver.close();
//				
////				driver.findElement(By.xpath("//div[@class='appbar-helpcenter-sections']//a[2]")).click();
////				
////				System.out.println(driver.switchTo().window(childwin).getTitle());
////				
//				
//				
//			}
//			
//			
//			
//		}
		
		//System.out.println(driver.switchTo().window(parent));
		
//		driver.findElement(By.xpath("//div[contains(text(),'Companies')]")).click();
//		
//		Set<String>  ds = driver.getWindowHandles();
//	
//		for (int i = 0; i <=ds.size(); i++) {
//			
//			System.out.println(ds);
//			
//		}
	
	}
	
	public static void main(String[] args) {
		
List li = new ArrayList();
		
		li.add(1);
		
		System.out.println(li);
	}
	
}
