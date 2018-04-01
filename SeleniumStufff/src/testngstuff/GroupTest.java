package testngstuff;

import org.testng.annotations.Test;

public class GroupTest {
  @Test(groups = { "Group1", "Group2" })
  public void test1() {
	  System.out.println("Test1");
  }
  @Test(groups = { "Group3"})
  public void test2() {
	  System.out.println("Test2");
  }
  @Test(groups = { "Group2", "Group3" })
  public void test3() {
	  System.out.println("Test3");
  }
  @Test(groups = { "Group2"})
  public void test4() {
	  System.out.println("Test4");
  }
  @Test(groups = { "Group3"})
  public void test5() {
	  System.out.println("Test5");
  }
}
