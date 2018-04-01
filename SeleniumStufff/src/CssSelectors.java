import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class CssSelectors {

	public static void main(String[] args) {
		
		
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
     
        driver.get("https://www.facebook.com/");
        
        driver.manage().window().maximize();
        
        //driver.findElement(By.id("email"));  // By id
        
        //driver.findElement(By.className("inputtext")); By className
        
        
      /**  driver.findElement(By.cssSelector("#email"));
        
        driver.findElement(By.cssSelector(".inputtext"));
        
        //tag and id 
        
        driver.findElement(By.cssSelector("input#email"));
        
        //tag and class
        
        driver.findElement(By.cssSelector("input.inputtext"));
        
        // tag and attribute */
        
        driver.findElement(By.cssSelector("input[id=\"email\"]"));
        
       // driver.findElement(By.cssSelector("input[class=\"inputtext\"]"));
        
        // tag class and attribute
        
       // driver.findElement(By.cssSelector("input.inputtext[type=\"email\"]"));
        
        WebDriverWait wait = new WebDriverWait(driver , 10);
        
        WebElement link;
    	link= wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath( "/html/body/div[1]/section/div[2]/div/div[1]/div/div[1]/div/div/div/div[2]/div[2]/div/div/div/div/div[1]/div/div/a/i")));
    	link.click();

	}

}
