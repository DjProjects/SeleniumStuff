package testngstuff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumTest3 extends BrowserInitiate{
	
	
	public static final String username = "//[@name='username']";
	public static final String signin = "//[@name='xyz']";
	public static final String signoff = "//[@name='xyz']";
	public static final String password = "//[@name='xyz']";
	
	//*[@id='myModal']/div/div/button
	GlobalFunctions g = new GlobalFunctions();
	@Test
	  public void test3() {
		  driver.get("http://jsbin.com/osebed/2 ");
		  driver.manage().window().maximize();
		  Select s = new Select(driver.findElement(By.id("fruits")));
		  s.selectByVisibleText("Banana");
	      s.selectByVisibleText("Apple");
	      s.selectByVisibleText("Grape");
	      System.out.println(s.isMultiple());
		
	  }
	  @Test
	  public void test4() {
		  driver.get("http://jsbin.com/osebed/2 ");
		  driver.manage().window().maximize();
		  Select s = new Select(driver.findElement(By.id("fruits")));
		  s.selectByVisibleText("Banana");
	      s.selectByVisibleText("Apple");
	      s.selectByVisibleText("Grape");
		  List<WebElement> eles = s.getAllSelectedOptions();
		  for(WebElement ele : eles)
		  {
			 // System.out.println("Test2 method:");
			  System.out.println(ele.getText());
		  }
	  }
	  
	  @Test
	  public void test5() {
		  driver.get("http://newtours.demoaut.com/ ");
		  driver.manage().window().maximize();
		//  driver.findElement(GlobalFunctions.getLocator(username)).sendKeys("tutorial");
		//  driver.findElement(By.id(password)).sendKeys("tutorial"); 
		//  driver.findElement(By.id(username)).sendKeys("tutorial");
		//  driver.findElement(By.id(password)).sendKeys("tutorial"); 
		  g.login(driver);
		  //login
		  g.click(driver, signoff);
	  }
	  
	  @Test
	  public void test6() {
		  driver.get("http://newtours.demoaut.com/ ");
		  driver.manage().window().maximize();
		  driver.findElement(By.id(GlobalFunctions.username)).sendKeys("tutorial");
		  driver.findElement(By.id("password")).sendKeys("tutorial");
		  g.click(driver, signoff);
	  }
}
