import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Singleton {
	
	private static WebDriver driver;
	private Singleton(WebDriver driver){
		this.driver=driver;
	}
	
	public static WebDriver getInstance(){
		
		if(driver==null){
			driver=new FirefoxDriver();
			return driver;
		}
		else{
			return driver;
		}
	}


	
	 
	

}
