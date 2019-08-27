package xpath;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.Cookie;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Cookies {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "d://chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("http://gmail.com");
		
		Set cc = driver.manage().getCookies();
		
		System.out.println(cc.size());
		
		Iterator itr = cc.iterator();
		
		while (itr.hasNext()) {
			
			Cookie c=(Cookie) itr.next();
		
			System.out.println("Domain  :  - "+c.getDomain());
			
			System.out.println("Experity  :  - "+c.getExpiry());
			
			System.out.println("Name   :    - "+c.getName());
		}
	}

}
