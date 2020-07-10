package test;

import org.testng.annotations.Test;

public class Testcase7 {
  @Test
  public void test1() {System.out.println("testcase0");
  }
  
  @Test
  public void test2() {System.out.println("testcase1");
  }
  @Test
  public void test3() {System.out.println("testcase2");
  }
  @Test (timeOut=1000)
  public void test4() {;System.out.println("testcase3");
  }
  @Test(dependsOnMethods="test4")
  public void test5() {System.out.println("testcase4 depends on testcase3");
  }
}
