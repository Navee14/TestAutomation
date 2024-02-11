package utililites;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserUtil {
	
	public static void main(String args[]) {
	
		  WebDriver driver;
	        WebDriverManager.chromedriver().setup();
	        driver = new ChromeDriver(); 
	       // Thread.onSpinWait();
	        driver.get("https://google.com");
	        String title = driver.getTitle();
	        System.out.println(title);      
	        driver.quit(); 
	
	
	}
}
