

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LaunchBrowser {

	public static void main(String[] args) {
		 
		// declaration and instantiation of objects/variables
    	System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
    	//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		String expectedtitle = "Welcome: Mercury Tours";
	
		driver.get("http://newtours.demoaut.com/");
		
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		if(expectedtitle.equals(actualtitle)) {
			System.out.println("Title Matches...");
		}
		driver.close();
		//driver.quit();
		
	}

}
