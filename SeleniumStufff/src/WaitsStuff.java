import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitsStuff {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
     
        driver.get("https://www.facebook.com/");
        
        // Implicit Wait
        
        driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
        
        driver.manage().window().maximize();
        
        // Explicit Wait
        
        WebDriverWait wait = new WebDriverWait(driver , 10);
        
        WebElement link;
    	link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
    	link.click();
    	
    	// FluentWait

	}

}
