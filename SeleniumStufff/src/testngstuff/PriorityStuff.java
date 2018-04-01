package testngstuff;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;

public class PriorityStuff {
	
	/** Priority stuff example... */
  @Test(priority=1)
  public void testcase3() {
	  System.out.println("test case3 executed");
  }
  @Test(priority=3)
  public void testcase2() {
	  System.out.println("test case2 executed");
  }
  @Test(priority=2)
  public void testcase1() {
	  System.out.println("test case1 executed");
  }
  
}
