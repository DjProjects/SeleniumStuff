import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class MultipleSelectionFronDropDown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        
        driver.get("http://jsbin.com/osebed/2 ");
        
        Select s = new Select(driver.findElement(By.id("fruits")));
        
        s.selectByVisibleText("Banana");
        s.selectByVisibleText("Apple");
        s.selectByVisibleText("Grape");
        
        List<WebElement> eles = s.getAllSelectedOptions();
        
        System.out.println(s.isMultiple());
        
       /* s.deselectByVisibleText("Banana");
        s.deselectAll(); */

	}

}
