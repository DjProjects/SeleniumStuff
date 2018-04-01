import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Frames {

	public static void main(String[] args) {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
     
        driver.get("http://demo.guru99.com/selenium/deprecated.html");
        
        driver.manage().window().maximize();
      /*  driver.switchTo().frame("classFrame");        
        driver.findElement(By.linkText("Deprecated")).click();
        driver.switchTo().defaultContent(); */
        
        List<WebElement> frames = driver.findElements(By.tagName("frame"));
        
        int size = frames.size();
        
        System.out.println("No of frames:" + size);
        
     /*  for(WebElement frame  : frames)
        {
        	System.out.println(frame);
        	System.out.println(frame.getText().toString());
        } */
        
        driver.switchTo().frame("packageListFrame");   // by name 
        
        driver.switchTo().frame(1); // by index
        
        driver.switchTo().parentFrame();
        
        // operation on x frame
        
        driver.switchTo().defaultContent();
          
        WebElement ele = driver.findElement(By.name("packageListFrame"));
        
        driver.switchTo().frame(ele);     // by webelement
        
        driver.findElement(By.linkText("Actions")).click();
        driver.switchTo().frame("classFrame");
        driver.findElement(By.linkText("TouchActions")).click();
        //driver.switchTo().frame("packageListFrame");
        //driver.switchTo().defaultContent(); 
        driver.switchTo().parentFrame();
        //driver.findElement(By.linkText("Deprecated")).click();
      
	}

}
