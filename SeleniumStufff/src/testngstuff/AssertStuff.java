package testngstuff;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Parameters;

import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterTest;

public class AssertStuff extends BrowserInitiate {
	
	 //public static WebDriver driver;
	
	
	 @Test
	  public void test1() {
		  driver.get("http://jsbin.com/osebed/2 ");
		  driver.manage().window().maximize();
		  String expectedresult = "Multiple Select Sample";
		  String actualresult = driver.getTitle();
		 // Assert.assertEquals(actualresult, expectedresult);
		  Assert.assertNotEquals(actualresult, expectedresult);
		  Select s = new Select(driver.findElement(By.id("fruits")));
		  s.selectByVisibleText("Banana");
	      s.selectByVisibleText("Apple");
	      s.selectByVisibleText("Grape");
		  List<WebElement> eles = s.getAllSelectedOptions();
		  for(WebElement ele : eles)
		  {
			  System.out.println(ele.getText());
		  }
}
	 @Test
	  public void test11() {
		  driver.get("http://jsbin.com/osebed/2 ");
		  driver.manage().window().maximize();
		  
		  List l1 = new ArrayList();
		  List l2 = new ArrayList();
		  l1.add("Banana");
		  l1.add("Apple");
		  l1.add("Grape");
		  Select s = new Select(driver.findElement(By.id("fruits")));
		  s.selectByVisibleText("Banana");
	      s.selectByVisibleText("Apple");
	      s.selectByVisibleText("Grape");
		  List<WebElement> eles = s.getAllSelectedOptions();
		  for(WebElement ele : eles)
		  {
			 // System.out.println("Test2 method:");
			  l2.add(ele.getText());
			  System.out.println(ele.getText());
		  }
		  
		  Assert.assertEquals(l1, l2);
		/*  if(l1.equals(l2))
		  {
			  System.out.println("both are same");
		  }else {
			  System.out.println("both are not same");
		  } */
}
}