import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class WindowsHandling {

	public static void main(String[] args) {
		  
	   System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
	   
       FirefoxDriver driver = new FirefoxDriver();
        
        driver.get("http://toolsqa.wpengine.com/automation-practice-switch-windows/");
        
        driver.manage().window().maximize();
        
        String firstwindowname = driver.getWindowHandle();
        
        System.out.println(firstwindowname);
        
        driver.findElement(By.id("button1")).click();
        
        driver.manage().window().maximize();
        
        Set<String> windows = driver.getWindowHandles();
        
        for(String s : windows)
        {
        	System.out.println(s);
        }
        
       
        driver.switchTo().window("cf43a5b1-ed0a-49eb-96e3-6cf6cfe59d92");
        
        
        String title = driver.getTitle();
        
       // System.out.println(title);
        
       
	}

}
