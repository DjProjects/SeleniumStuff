package testngstuff;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Point;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ScrollStuff {
	WebDriver driver;
	String baseURL = "https://www.linkedin.com/";

	@BeforeClass
	public void setUp() {
		System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
		driver = new FirefoxDriver();
		driver.get(baseURL);
		driver.manage().window().maximize();
	}

	@Test(enabled=false)
	public void scrollingToBottomofAPage() throws InterruptedException {
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		((JavascriptExecutor) driver)
        .executeScript("window.scrollTo(0, document.body.scrollHeight)"); 
		Thread.sleep(100000);
		((JavascriptExecutor)driver).executeScript("alert('hello world');");
		Thread.sleep(100000);
		
	/*	WebDriverWait wait = new WebDriverWait(driver,10);
		
		try {
		wait.until(ExpectedConditions.alertIsPresent());
		}catch(Exception e) {
			System.out.println("Alert not present");
		} */

	}	

	@Test(enabled=true)
	public void scrollingToElementofAPage() throws InterruptedException {
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		WebElement element = driver.findElement(By.linkText("Learning"));
		((JavascriptExecutor) driver).executeScript(
                "arguments[0].scrollIntoView();", element);
		Thread.sleep(1000000);
		element.click();
	}
	
	@Test(enabled=false)
	 public void getCoordinates() throws Exception {
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(12, TimeUnit.SECONDS);
		driver.manage().window().maximize();
	  //Locate element for which you wants to retrieve x y coordinates.
	       WebElement ele = driver.findElement(By.linkText("Learning"));
	       //Used points class to get x and y coordinates of element.
	        Point p = ele.getLocation();
	        int xcordi = p.getX();
	        System.out.println("Element's Position from left side"+xcordi +" pixels.");
	        int ycordi = p.getY();
	        System.out.println("Element's Position from top"+ycordi +" pixels.");
	 }

	
	@Test(enabled=false)
	public void scrollingByCoordinatesofAPage() throws InterruptedException {
		driver.navigate().to(baseURL);
		driver.manage().timeouts().implicitlyWait(100, TimeUnit.SECONDS);
		driver.manage().window().maximize();
		((JavascriptExecutor) driver).executeScript("window.scrollBy(844,743)");
		WebElement element = driver.findElement(By.linkText("Learning"));
		element.click();
		Thread.sleep(10000);
		
	}	
	@AfterClass
	public void tearDown() {
		driver.quit();
	}


}
