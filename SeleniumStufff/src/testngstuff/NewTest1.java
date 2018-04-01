package testngstuff;


import org.testng.annotations.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewTest1 {
	
	@BeforeClass
	  public void beforeClass() {
		  System.out.println("Before class executed");
		  Reporter.log("Before class exected successfully");
	  }

	  @AfterClass
	  public void afterClass() {
		  System.out.println("After class executed");
	  }	
  @Test
  public void testcase4() {
	  System.out.println("Test case4 executed");
	  Reporter.log("Test4 exected successfully");
	  System.out.println("Test case4 executed");
	  Reporter.log("Test44 exected successfully");
  }
  @Test
  public void testcase5() {
	  System.out.println("Test case5 executed");  
	  Reporter.log("Test5 exected successfully");
  }
}
