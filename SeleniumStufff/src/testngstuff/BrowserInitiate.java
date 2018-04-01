package testngstuff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class BrowserInitiate {
	public static WebDriver driver;
	  
	  @BeforeTest
	  @Parameters("browser")
	  public void beforeTest(String browser) {
		  if(browser.equalsIgnoreCase("firefox")){  
		      System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");	   
		      driver = new FirefoxDriver();
		  }
		  else if(browser.equalsIgnoreCase("chrome")){
		      System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		     // System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");	   
			  driver = new ChromeDriver();
	      }
		  else if(browser.equalsIgnoreCase("IE")){
			  System.setProperty("webdriver.ie.....","D:\\Selenium\\.....exe");	   
			  driver = new InternetExplorerDriver();
		  }
	  }

	  @AfterTest
	  public void afterTest() {
		  driver.close();
		  //driver.quit();
	  }
}
