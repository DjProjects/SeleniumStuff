package testngstuff;


import org.testng.annotations.AfterClass;
import org.testng.Reporter;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class ReporterLogStuff {
	
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
  public void test1() {
	  System.out.println("test1 executed");
	  Reporter.log("Reporter - Test1 executed successfully");
	  System.out.println("test11 executed");
	  Reporter.log("Reporter - Test11 executed successfully");
  }
  @Test
  public void test2() {
	  System.out.println("test2 executed");  
	  Reporter.log("Reporter - Test2 executed successfully");
  }
}
