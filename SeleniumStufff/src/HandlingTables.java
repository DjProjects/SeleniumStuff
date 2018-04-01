import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class HandlingTables {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
        FirefoxDriver driver = new FirefoxDriver();
     

        driver.get("file:///D:/Sample.html");
        
        driver.manage().window().maximize();
		
		//Absoulte path  - /html/head/body/table/tbody/tr/td
		
		//Relative Path  - //table/tbody/tr/td
		
		//Fetching first/second cell values
		
		driver.findElement(By.xpath("//table/tbody/tr/td[2]")).getText(); 
		
		driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]")).getText(); 
		
		//Inner Tables :
			
			driver.findElement(By.xpath("//table/tbody/tr[2]/td[2]/table/tbody/tr[2]/td[2]")).getText(); 
		
		//tagname[@attribute='value']

	}

}
