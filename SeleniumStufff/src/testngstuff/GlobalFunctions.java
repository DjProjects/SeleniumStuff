package testngstuff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class GlobalFunctions extends BrowserInitiate {
	public static WebDriver driver;
	
	public static final String username = "hfjd";
  
      public WebDriver login(WebDriver driver) {
	 /* System.out.println("Login Method Executed");
	  driver.get("http://jsbin.com/osebed/2 ");
	  driver.manage().window().maximize();
	  System.out.println(driver.getTitle()); */
	  
	  driver.get("http://newtours.demoaut.com/ ");
	  driver.manage().window().maximize();
	  driver.findElement(By.id("Username")).sendKeys("tutorial");
	  driver.findElement(By.id("password")).sendKeys("tutorial");
	  return driver;
  }
      public void click(WebDriver driver, String signin) {
    	  driver.findElement(By.id(signin)).click();
      }
}
