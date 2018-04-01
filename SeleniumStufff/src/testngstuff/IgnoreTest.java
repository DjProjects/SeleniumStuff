package testngstuff;

import org.testng.annotations.Test;

public class IgnoreTest {
  @Test(enabled = false)
  public void test1() {
	  System.out.println("test1 methood executed");
  }
  @Test
  public void test2() {
	  System.out.println("test2 method executed");
  }
}
