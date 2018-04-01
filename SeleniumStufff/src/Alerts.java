
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerts {

    public static void main(String[] args) {
    	System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        WebDriver driver = new FirefoxDriver();
   
        driver.get("http://jsbin.com/usidix/1");
        //driver.findElement(By.cssSelector("input[value=\"Go!\"]")).click();
        //driver.findElement(By.xpath("html/body/input")).click();
        driver.findElement(By.tagName("input")).click();
        
        String alertMessage = driver.switchTo().alert().getText();
        System.out.println(alertMessage);
        driver.switchTo().alert().accept();
        driver.switchTo().alert().dismiss();
        driver.switchTo().alert().sendKeys("xyz");
        
        /*
         Alert ale = driver.switchTo().alert();
        
        ale.getText();
        ale.accept();
        ale.dismiss();
        ale.sendKeys("xyz");
         */
       
        driver.quit();
       
    }
}