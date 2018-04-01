package testngstuff;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class ParameterTest {
  @Test
  @Parameters("n")
  public void test11(String n) {
	  
	  System.out.println(n);
  }
  
  @Test
  @Parameters({"username","password"})
  public void test12(String uname, String pword) {
	  
	  System.out.println(uname);
	  System.out.println(pword);
  }
}
