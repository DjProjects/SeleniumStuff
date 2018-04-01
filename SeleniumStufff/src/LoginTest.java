import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		// declaration and instantiation of objects/variables
    	System.setProperty("webdriver.firefox.marionette","D:\\Selenium\\geckodriver.exe");
    	//System.setProperty("webdriver.gecko.driver","D:\\Selenium\\geckodriver.exe");
		FirefoxDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		//System.setProperty("webdriver.chrome.driver","D:\\Selenium\\chromedriver.exe");
		//ChromeDriver driver = new ChromeDriver();
		String expectedtitle = "Welcome: Mercury Tours";
	
		driver.get("http://newtours.demoaut.com/");
		driver.manage().window().maximize();
		System.out.println(driver.getTitle());
        driver.findElement(By.name("userName")).clear();
		driver.findElement(By.name("userName")).sendKeys("tutorial");
		driver.findElement(By.name("password")).clear();
		driver.findElement(By.name("password")).sendKeys("tutorial");
		driver.findElement(By.name("login")).click(); 
		driver.close();
	}

}
