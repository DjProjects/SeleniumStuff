package testngstuff;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class SeleniumTest2 extends BrowserInitiate {
	
	GlobalFunctions g = new GlobalFunctions();
	@Test
	  public void test2() {
		 // driver.get("http://jsbin.com/osebed/2 ");
		  g.login(driver);
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
}
