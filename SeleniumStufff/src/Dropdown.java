import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
        
        driver.get("http://demo.guru99.com/selenium/newtours/register.php");
        
        Select s = new Select(driver.findElement(By.name("country")));
       // s.selectByVisibleText("ARMENIA");
       // s.selectByIndex(4);
        s.selectByValue("ALGERIA");
        
        List<WebElement> elementss = s.getOptions();
        
        for(WebElement singleelement : elementss) {
        	String str = singleelement.getText();
        	System.out.println(str);
        }      

	}

}
